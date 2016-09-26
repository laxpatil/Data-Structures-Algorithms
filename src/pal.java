import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;


public class pal {
	
	
	 public static int f(int n)
	 {
		 int fact=1;
		 while(n>=1)
	        {
	        fact=fact*(n);
	        n--;
	        }
		 return fact;
	 }
	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			String cur;

			br = new BufferedReader(new FileReader("C:\\Users\\Laxmikant\\Documents\\testing.txt"));
			
			while ((cur = br.readLine()) != null) {
				int val;
		     char[] a=cur.toCharArray();
		     HashMap<Character,Integer> set = new HashMap<Character,Integer>();
	        for(int i=0;i<a.length;i++)
	        {
	        	 
	        	  if(set.containsKey(a[i]))
	        	  {
	        		   val=set.get(a[i]);
	        				  val=val+1;
	        		  set.put(a[i],val );
	        	  }
	        	  else
	        	  {
	        		  set.put(a[i],1 );
	        	  }
	        	 
	        	 
	        }
	        
	        int odd=0;
	        int even=0;
	        int total=0;
	        for(Entry<Character, Integer> entry : set.entrySet())
	        { 
	        	char k= entry.getKey();
	        	int  v=entry.getValue();
	        	
	        	if(v%2==1)
	        		odd++;
	        	if(v%2==0 || v>1)
	        	{
	        		total=total+v/2;
	        		
	        	}
	        	
	        }
	       System.out.println("max: +"+Integer.MAX_VALUE);
	        int totalfact=f(total);
	        
	        int multi=1;
	        for(Entry<Character, Integer> entry : set.entrySet())
	        { 
	        	char k= entry.getKey();
	        	int  v=entry.getValue();
	        
	        	if(v%2==0 || v>1)
	        	{
	        		v=v/2;
	        		multi=multi*f(v);
	        	}
	        }
	        
	        int value= totalfact/multi;
	        
	        
	       
	        int min=0;
	        if(odd==1 || odd==0)
	        	min=0;
	        else
	        	min=odd-1;
	        System.out.println(""+min+","+ value);
	       
		}
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
}
}
