import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class semi1 {

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		 HashMap<Integer,Integer> m1=new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.nextLine());
    	//ArrayList<Node> a =new ArrayList<Node>();
    	 int[] arr=new int[n];
    	 int[] p=new int[n];
         int[] flag=new int[n];
         double result=0;
         int g_count=0;
    	for(int i=0;i<n;i++)
    	{
    		String word =	sc.nextLine();
      	  String temp[]=word.split(" ");
      	  
      	arr[i]=Integer.parseInt(temp[0])-1;
        m.put(i, Integer.parseInt(temp[0])-1);
        m1.put(i, Integer.parseInt(temp[0])-1);
        p[i]=Integer.parseInt(temp[1]);
        
    	}
    	int j=0;
    	
    	
    	
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
        int k=j;
        int[] flag1=new int[n]; //new flag
       double multi=1;
       int count=0;
            while(flag1[k]!=1)
            { 
            	 ++count;
            	multi=multi*p[k]/100;
             int ncity=arr[k];
            flag1[k]=1;
            k=ncity;
            
           // System.out.println(" nextcity:  "+nextCity);
            
            }  //i
          
            result=result+ count*multi;
            g_count=g_count+count;
            
        for ( int key : m.keySet() ) {
          //  System.out.println( "key:  "+key );
            j=key;
            break;
        }
	}
    	result=result/g_count;

    	String output="";
    	double out=0;
    	String d="";
    	 //System.out.println( "result :  "+result );
    	// System.out.println( result );
    	 
    	 String number = String.valueOf(result);
    	 String before_deci=number.substring(0,number.indexOf("."));
    	 //System.out.println("b:::"+before_deci);
    	 String deci = number.substring(number.indexOf(".")+1);
    	 if(deci.length()>2)
    	 {  d =deci.substring(0,2);
    	 
    	// System.out.println( "deci, ,,, d "+ deci.substring(2) + "d::"+d );
    	   if(deci.substring(2).charAt(0)>='5')
    	    {
    	    out = Double.parseDouble(before_deci)+ (Double.parseDouble("."+ d )+0.01);
    	    output=""+out;
    	     }
    	   else
    	   		  out= Double.parseDouble(before_deci)+ (Double.parseDouble("."+ d ));
    	   output=""+out;
    	 }
    	 else
   		  output=""+result;
    	 
    	 System.out.println( output );
    	 
   	 }
    	 
}


