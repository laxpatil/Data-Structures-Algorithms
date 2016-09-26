import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class FacilitiesSolution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
    	int N = Integer.parseInt(sc.nextLine());
    	ArrayList<String> facilities= new ArrayList<String>();
    	for (int i = 1; i<= N;i++){
    		
      	  String word =	sc.nextLine();
      	  
      	  facilities.add(word);
      	  
      	  
}
    	
    	String desc =	sc.nextLine().toLowerCase();
    	ArrayList<String> result= new ArrayList<String>();
    	for (String j : facilities)
    	{
    		if(desc.contains(j.toLowerCase()))
    		{
    			result.add(j);
    			
    		}
    	}
    	Collections.sort(result);
    	for(String r: result){
			System.out.println(r);
		}
	}
}
    	 
    	 