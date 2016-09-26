// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int X, int D) {
        // write your code in Java SE 8
        
        
         int i=0;
	        int max=0;
	        int dr=0;
	        int time=0;
	        int cur=0;
	        
	         if(X-cur<=D)
	        	return 0;
	        
            while(i<A.length)
	        {
	        	if(A[i]>=cur && A[i]-cur<=D)
	        	{
	        		cur=A[i];
	        		
	        		time=i;
	        	}
	        	if(X-cur<=D)
	        		return time;
	        	i++;
	        }	
		        if(i==A.length)
		        {
		            if(time==0)
		            	return -1;
		            else 
		            {
		            	if(X-cur>D)
		            		{
		            		return -1;
		            		}
		            
		            	
		            }
		        
	        	//return time;	
	           }
        return -1;
    }
}