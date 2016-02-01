//package coding;
 
 
/**
 * @author laxmikant
 *
 */
 
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.io.*;
import java.util.*;
import java.util.Scanner;
 
 
 
class Graph {
   private final Map<String, Vertex> graph; 
 
  
     static class Edge {
      public final String v1, v2;
      public final int dist;
      public Edge(String v1, String v2, int dist) {
         this.v1 = v1;
         this.v2 = v2;
         this.dist = dist;
      }
   }
 
  
     class Vertex implements Comparable<Vertex> {
      public final String name;
      public int dist = Integer.MAX_VALUE; 
      public Vertex previous = null;
      public final Map<Vertex, Integer> neighbours = new HashMap<>();
 
      public Vertex(String name) {
         this.name = name;
      }
 
      private String printPath() {
    	  String temp="";
         if (this == this.previous) {
        	 temp=temp+this.name+":";
        
         } else if (this.previous == null) {
        	 temp=temp+this.name;
         
         } else {
        	  temp=temp+this.previous.printPath();
        	  temp=temp+","+ this.name+":"+ this.dist;
        
         }
         
		return temp;
      }
 
      public int compareTo(Vertex other) {
         return Integer.compare(dist, other.dist);
      }
   }
 
  
   public Graph(Edge[] edges) {
      graph = new HashMap<>(edges.length);
 
      
      for (Edge e : edges) {
         if (!graph.containsKey(e.v1)) graph.put(e.v1, new Vertex(e.v1));
         if (!graph.containsKey(e.v2)) graph.put(e.v2, new Vertex(e.v2));
      }
 
    
      for (Edge e : edges) {
         graph.get(e.v1).neighbours.put(graph.get(e.v2), e.dist);
        
      }
   }
 
   /** Runs dijkstra using a specified source vertex */ 
   public void dijkstra(String startName) {
      if (!graph.containsKey(startName)) {
     
         return;
      }
      final Vertex source = graph.get(startName);
      NavigableSet<Vertex> q = new TreeSet<>();
 
    
      for (Vertex v : graph.values()) {
         v.previous = v == source ? source : null;
         v.dist = v == source ? 0 : Integer.MAX_VALUE;
         q.add(v);
      }
 
      dijkstra(q);
   }
 
  
   private void dijkstra(final NavigableSet<Vertex> q) {      
      Vertex u, v;
      while (!q.isEmpty()) {
 
         u = q.pollFirst(); 
         if (u.dist == Integer.MAX_VALUE) break;
 
      
         for (Map.Entry<Vertex, Integer> a : u.neighbours.entrySet()) {
            v = a.getKey();
 
            final int alternateDist = u.dist + a.getValue();
            if (alternateDist < v.dist) { 
               q.remove(v);
               v.dist = alternateDist;
               v.previous = u;
               q.add(v);
            } 
         }
      }
   }
 
  
   public String printPath(String endName) {
      if (!graph.containsKey(endName)) {
         //System.err.printf("Graph doesn't contain end vertex \"%s\"\n", endName);
         return "" ;
      }
     
     return graph.get(endName).printPath();
      
   }
  
   public void printAllPaths() {
      for (Vertex v : graph.values()) {
         v.printPath();
      
      }
   }
}
 
 
 
 
 
class solution {
  
 
   public static void main(String[] args) {
       
       Scanner in = new Scanner(System.in);
    //  ArrayList<String> finalcities = new ArrayList<String>();
      int cast=0;
      String f="";
      int val=0;
      String first=in.nextLine();
         final String START = first.split(" ")[1];
     final String END = first.split(" ")[2];
      int total=Integer.parseInt(first.split(" ")[0]);
      
      HashMap<String, Integer> m= new HashMap<String, Integer>();
      
      
      int flag=0;
      while(flag==0)
      {
    	  String ip=in.nextLine();
    	 //s System.out.println(ip);
    	  if(ip.equals("0"))
    		  flag=1;
    	  else
    	  {
    	//  System.out.println(ip);
          m.put((ip.split(" ")[0]+","+ ip.split(" ")[1]),Integer.parseInt(ip.split(" ")[2]));
    	  }
          
      }
      
      
   //   System.out.println("inside");
    
    int min=Integer.MAX_VALUE;
    
     for(int j=0;j<m.size();j++)
     {
    	 
    	  Graph.Edge[] GRAPH = new Graph.Edge[m.size()];
    //	 System.out.println("inside");
       int count=0,i=0;
     for (Map.Entry<String, Integer> entry : m.entrySet()) {
         if(count!=j)
         {
		        
		       GRAPH[i]= new Graph.Edge(entry.getKey().split(",")[0],entry.getKey().split(",")[1],entry.getValue());
		        
         }
         else
        {
             GRAPH[i]= new Graph.Edge(entry.getKey().split(",")[0],entry.getKey().split(",")[1],0);
            
        }
	  //   System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	     	count++;
	     	i++;
		
	}
     
   Graph g = new Graph(GRAPH);
      g.dijkstra(START);
      String path=g.printPath(END);
    // System.out.println("INSIDE : "+ path);
      String[] cities=path.split(",");
     
      val=Integer.parseInt(cities[cities.length-1].split(":")[1]);
      if(min>val)
      {
    	 
    	  min=val;
    	 // System.out.println("min "+min);
    	  f=path;
    	  cast=j;
      }
     
      
      //g.printAllPaths();
	
     }
       
     String[] fc=f.split(",");
     // String finaldest= fc[fc.length-1].split(":")[0];
     for(int j=0;j<fc.length-1;j++)
     {
    	 System.out.println(fc[j].split(":")[0]+" to " +  fc[j+1].split(":")[0]);
     }
     
     int c=0;
   //  System.out.println(cast);
     for (Map.Entry<String, Integer> entry : m.entrySet()) {
         if(c==cast)
         {
        	 System.out.println("Spell was cast between "+entry.getKey().split(",")[0]+" to "+entry.getKey().split(",")[1]);
        	 
         }
         c++;
        	 
         }
     System.out.print("Arrived to "+END+" with "+ (total-min*10) +" pieces of amber");
   }
}
 
