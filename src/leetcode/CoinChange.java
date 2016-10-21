/**
 * 
 */
package leetcode;

/**
 * @author Laxmikant
 *
 */
public class CoinChange {

	/**
	 * @param args
	 */
	
	
	
   public  static int coinChange(int[] coins, int amount) {
        
	   if(amount==0)
       {
           return 0;
       }
       
      int[] v = new int[amount+1];
      
      v[0]=0;
      
      for(int i=1;i<v.length;i++)
      {
    	  v[i]= Integer.MAX_VALUE;
      }
     
      for(int i=1;i<=amount;i++)
      {
    	  for(int j=0;j<coins.length;j++){
    		  
    		  if(coins[j]<=i)
    		  {
    			  int remianing=  v[i-coins[j]];
    			  
    			  if(remianing!=Integer.MAX_VALUE && remianing+1 < v[i])
    			  {
    				  v[i]=  remianing+1;
    				  
    				  
    			  }
    			  
    			  
    		  }
    		  
    	  }
    	  
    	  
      }
      
      System.out.println(v[amount]);
      
      if(v[amount]==Integer.MAX_VALUE)
      {
          return -1;
      }
      
      return v[amount];
        
    }
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		int[] arr= {1};
		coinChange(arr, 2);

	}

}
