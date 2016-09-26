/**
 * 
 */


/**
 * @author Laxmikant
 *
 */
import java.io.*;
import java.util.*;

public class Moon {
   public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        
       
        int I = Integer.parseInt(temp[1]);
      
        int[][] arr= new int[N+1][2];
        for(int i = 0; i < I; i++){
            temp = bfr.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
          // Store a and b in an appropriate data structure of your choice
            arr[i][0]=a;
            arr[i][1]=b;
            
        }
        
        	ArrayList<HashSet<Integer>> ah= new ArrayList<HashSet<Integer>>();
        
        	HashMap<Integer,HashSet<Integer>> m= new HashMap<Integer,HashSet<Integer>>();
        	
        	HashSet<Integer> unique= new HashSet<Integer>();
        	
        	HashSet<Integer> tmap;
        for(int k=0;k<I;k++)
        {
        	HashSet<Integer> nMap=new HashSet<Integer>();
        	int p=arr[k][0];
        	int q=arr[k][1];
        	//System.out.println("reading : p " + p+ " : q "+q);
        	if(m.containsKey(q))
        	{
        		int t=q;
        		q=p;
        		p=t;
        	}
        	if(m.containsKey(p))
        	{
        		p=p;
        		q=q;
        	}
        	
        	if((!m.containsKey(p)) && (!m.containsKey(q)))
        	{
        	//	System.out.println("adding : " + p);
        		unique.add(p);
        	}
        	
        	if(m.containsKey(p))
        	{
        	//	System.out.println("exists: "+p);
        		tmap=m.get(p);
        		//System.out.println("tmap: "+tmap.size() + "  p");
        		tmap.add(p);
        		tmap.add(q);
        		m.put(p, tmap);
        		m.put(q, tmap);
        		
        		
        		
        		
        	}
        	else
        	{
        		//System.out.println("not exists: "+p);
        		nMap.add(p);
        		nMap.add(q);
        		m.put(p, nMap);
        		m.put(q, nMap);
        		
        		
        	}
        	
        	
        }
       // System.out.println("uinq "+ unique.size());
        Iterator<Integer> it=unique.iterator();
        long combinations = 1; 
        while(it.hasNext())
        {
        	int z=it.next();
        //	System.out.println("z "+ z+ ":"+m.get(z).size() );
        	combinations=combinations* (m.get(z).size());
        }
       

        // Compute the final answer - the number of combinations
       
        System.out.println(combinations);
        
    }
}

 

