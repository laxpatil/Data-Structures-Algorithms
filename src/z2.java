import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class z2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String P="";
        String E="";
        
        
        for(int a0 = 0; a0 < t; a0++){
             P = in.next();
            E = in.next();
        }
        
       char[] p =P.toCharArray();
       char[] e=E.toCharArray();
       
       HashMap<Integer, Integer> m=new  HashMap<Integer, Integer>();
       
       for(int i=0;i<p.length;i++)
       {
    	   int k= e[i]-p[i];
    	   if(k<0)
    		   k=k+26;
    	   if(m.containsKey(k))
    	   m.put(k, m.get(k)+1);
    	   else
    		   m.put(k, 1);
    	   
       }
       int max=Integer.MIN_VALUE;
       for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
    	   
    	   if(max<entry.getValue())
    		   max=entry.getValue();
       }
       
       System.out.println(P.length()-max);
       
       
    }
}
