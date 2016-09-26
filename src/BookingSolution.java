import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class BookingSolution {
	double pi=3.14159265359;
	static class dest{
		int id;
		double lat;
		double longi;
		
	 dest(int a, int b, int c)
	 {
		 
		 id=a;
		 lat=b;
		 longi=c;
	 }
	}
	
	public double degree2radians( double i)
	{
		return i*pi/180;
	}
	public double distance_between(dest point1, dest point2) {
	    int EARTH_RADIUS = 6371;//in km
	    double point1_lat_in_radians  = degree2radians( point1.lat );
	    double point2_lat_in_radians  = degree2radians( point2.lat );
	    double point1_long_in_radians  = degree2radians( point1.longi );
	    double point2_long_in_radians  = degree2radians( point2.longi );

	    return acos( sin( point1_lat_in_radians ) * math.sin( point2_lat_in_radians ) +
	                 cos( point1_lat_in_radians ) * cos( point2_lat_in_radians ) *
	                 cos( point2_long_in_radians - point1_long_in_radians) ) * EARTH_RADIUS;
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
    	int N = Integer.parseInt(sc.nextLine());
       ArrayList<dest> destinations= new ArrayList<dest>();
       
    	for (int i = 1; i<= N;i++){
    		
    	  String word =	sc.nextLine();
    	  String temp[]=word.split(" ");
    	  
            destinations.add(new dest(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),Integer.parseInt(temp[2])));
    	  
    	  
        
    }
    	
    	HashMap<Integer,Integer> m= new HashMap<Integer,Integer>();
    	for (dest i : destinations) 
    	{
    		for(dest j: destinations)
    		{
    			if (i.id!=j.id)
    			{
    				
    			}
    		}
    		
    	}
    	
    	int M = Integer.parseInt(sc.nextLine());
    	for (int i = 1; i<= M;i++){
    		
      	  String word =	sc.nextLine();
      	  String temp[]=word.split(" ");
      	  
      	  int lat= Integer.parseInt(temp[0]);
      	int longi= Integer.parseInt(temp[1]);
      	String travel= temp[2];
      	int mins= Integer.parseInt(temp[3]);
      	
      	
      	
  }
}
}