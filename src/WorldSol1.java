import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WorldSol1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        
      
        Scanner sc = new Scanner(System.in);
    	int T = Integer.parseInt(sc.nextLine());
        int j=0;
        for( int i=0;i<T;i++)
            {
            int N =Integer.parseInt(sc.nextLine());
            int[] arr=new int[N];
            int[] flag=new int[N];
              
            String line=sc.nextLine();
            
            for ( j=0;j<N;j++)
                {
                   int num =Integer.parseInt(line.split(" ")[j]);
              //  System.out.println("num:  "+num);
                    
                   arr[j]=num-1;
                    m.put(j, num-1);
                }
             j=0;
            
            int[] loops= new int[N]; //loops end point
            int c=0;
            int k=0;
            while(m.size()>0)
                {
                while(flag[j]!=1)
                {
                
                 int nextCity=arr[j];
                flag[j]=1;
                m.remove(j);
                j=nextCity;
                
               // System.out.println(" nextcity:  "+nextCity);
                
                }  //inner while
               // System.out.println("loop:  "+c);
                loops[c]=j;
                
                
                c++;
                
                for ( int key : m.keySet() ) {
                    System.out.println( "key:  "+key );
                    j=key;
                    break;
                }
              
               
                
                
            }
            
        
            
            System.out.println(c-1);
           
            
            
        }
        
    }
}