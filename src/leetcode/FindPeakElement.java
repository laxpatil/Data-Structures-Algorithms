/**
 * 
 */
package leetcode;

/**
 * @author Laxmikant
 *
 */
public class FindPeakElement {

 public static int findPeakElement(int[] nums) {
        
        if(nums.length==0)
        {
            return 0;
        }
        
         if(nums.length==1)
        {
            return 0;
        }
        
        int low=0;
        int high =  nums.length-1;
        
        int mid=0;
        
        while(low<=high)
        {
            mid= (low+high)/2;
            System.out.println("mid:"+mid+" low="+low+" high="+high);
            
            if(low==high)
            {
                return low;
            }
            
            if(mid==low && nums[mid+1]>nums[mid])
            {
                return mid+1;
            }
            
             if(mid==low && nums[mid+1]<nums[mid])
            {
                return mid;
            }
            
            if(nums[mid]>nums[mid-1] && nums[mid]> nums[mid+1])
            {
                return mid;
            }
            
          if(nums[mid]>nums[mid-1] && nums[mid]< nums[mid+1])
            {
                low= mid+1;
            }
            else if(nums[mid]<nums[mid-1] && nums[mid]> nums[mid+1]){
                
                high= mid-1;
            }
          if(nums[mid]<nums[mid-1] && nums[mid]< nums[mid+1]){
              
              low=mid+1;
          }
            
        }
        
        return 0;
        
        
    }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,1,2};
		findPeakElement(a);
	}

}
