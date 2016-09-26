import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class boom {

    public static void main(String[] args) {
      
        
       BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
       try
       {   
    	   
    	  // System.out.println("::::::"+Integer.MAX_VALUE);
         int T= Integer.parseInt(inp.readLine());
            
         for(int i=0;i<T;i++)
         {
            int n= Integer.parseInt(inp.readLine());
            //Your code goes here
             
             
             ArrayList<Integer> a=new ArrayList<Integer>();
             
             for(int j=1;j<=n;j++)
             {
            	 a.add(j);
             }
         //  System.out.println("-----");
        
           int cur=0;
           while(a.size()>1)
           {
        	   
        	   
        	   if(a.size()%2==1)  //odd
        	   {
        		//   System.out.println("---ODD---");
        		   int rm=cur;
        		   a.remove(rm);
        		   //System.out.println("remove  "+a.remove(rm)+" at index "+cur  + " size :"+a.size());
        		   
        		   
        		  
        		   
        		   if(a.size()==1)
        		   {
        			   System.out.println(a.get(0));
        			   break;
        		   }
        		  
        		  // System.out.println("Cur: "+cur);
        		   //System.out.println("now cur :"+cur+ " value : " + a.get(cur));
        		   
        	   }
        	   else  //even
        	   {
        		   
        		//   System.out.println("---EVEN---");
        		   int total=a.size();
        		   
        		   int rm=(cur+total/2) % total;
        		//   System.out.println("Rm index:  "+rm);
        		   
        		   a.remove(rm);
        		 //  System.out.println("remove:  "+a.remove(rm) + " size :"+a.size());
        		   
        		   
        		   int temp =a.remove(0);
        		   
        		   a.add(temp);
        		   
        		   
        		   
        		//   System.out.println("Cur: "+cur);
        		  
        			   
        		   
        		   
        		   
        		  
        		   //System.out.println("now cur :"+cur+ " value : " + a.get(cur));
        		   
        		
        		   
        		   if(a.size()==1)
        		   {
        			   System.out.println(a.get(0));
        			   break;
        		   }
        		   
        		  
        		   
        	   }
        	   
        	   
           }
             
             
             
             
             
         }
       }
         catch(Exception e){}

      
    }
}
