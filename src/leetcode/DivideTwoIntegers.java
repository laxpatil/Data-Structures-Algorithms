/**
 * 
 */
package leetcode;

/**
 * @author Laxmikant
 *
 */
public class DivideTwoIntegers {

	/**
	 * @param args
	 */
	
	
	 public static int divide(int dividend, int divisor) {
	        
		  if(divisor==0)
	       {
	           return Integer.MAX_VALUE;
	       }
	       
	       if(divisor==-1 && dividend==Integer.MIN_VALUE)
	       {
	           return Integer.MAX_VALUE;
	       }
	       
	       int result=0;
	       
	      long pdividend = Math.abs( (long) dividend);
	      
	      long pdivisor = Math.abs( (long) divisor);
	      
	      int numshift=0;
	      while(pdividend>= pdivisor)
	      {
	          
	          numshift=0;
	          
	          while(pdividend >= (pdivisor<<numshift))
	          {
	              
	              
	              numshift++;
	              
	          }
	          
	          result+=1<<(numshift-1);
	          
	          pdividend-=(pdivisor << (numshift-1));
	          
	          
	      }
	      
	      
	      
	        if((dividend>0 && divisor>0) || (dividend<0 && divisor<0)){
	        return result;
	            }
	        else{
	          return -result;
	            }
	       
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		divide(-1, -1);
	}

}
