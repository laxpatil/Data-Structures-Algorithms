/**
 * 
 */
package leetcode;

/**
 * @author Laxmikant
 *
 */
public class CountOfRangeSum {
	  public int countRangeSum(int[] nums, int lower, int upper) {
	        
	        int len = nums.length;
	        
	        if(len==0)
	        {
	            return 0;
	        }
	        
	        long[] sum = new long[len+1];
	        
	        // fill sum array
	        sum[0]=nums[0];
	        for(int i=0;i<len;i++)
	        {
	            sum[i+1]=sum[i]+nums[i];
	        }
	        
	        
	        return getCount(nums, sum, 0, len+1, lower, upper);
	        
	        
	    }
	    
	    
	    public int getCount(int[] nums, long[] sum, int l,  int h, int lower, int upper)
	    {
	        
	       if(h-l<=1)
	       {
	           return 0;
	       }
	       
	       int mid=  (l+h)/2;
	       
	       int count = getCount(nums, sum, l,  mid, lower, upper) + getCount(nums, sum, mid,  h, lower, upper);
	       
	       int j=mid;
	       int k=mid;
	       int t=mid;
	       
	       long[] temp = new long[h-l];
	       int r=0;
	       for(int i=l ; i<mid; i++ )
	       {
	           while(k<h && sum[k]-sum[i]<lower)
	           k++;
	           
	           while(j<h && sum[j]-sum[i]<=upper)
	           j++;
	           
	           while(t<h && sum[t]<sum[i])
	           temp[r++]=sum[t++];
	           
	           temp[r]=sum[i];
	           r++;
	           count+=j-k;
	           
	       }
	       
	       System.arraycopy(temp, 0 , sum, l, t-l);
	       
	        return count ;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
