/**
 * 
 */
package leetcode;

/**
 * @author Laxmikant
 *
 */
public class SearchForARange {

	/**
	 * @param args
	 */
	
	

	 public static int searchLeft(int[] nums, int left, int right, int target)
	    {
	        int mid=-1;
	        
	         while(left<=right)
	        {
	            mid= (left+right)/2;
	            if(target==nums[mid])
	            {
	                      System.out.println("Left SEARCH: " + mid);
	                if(   (mid==0)    ||  (mid-1>=0 && nums[mid-1]<target)   )
	                {
	                    return mid;
	                } 
	                
	                right=mid-1;
	            }
	            else if(target>nums[mid])
	            {
	                  System.out.println("Left SEARCH: " + mid);
	                left=mid+1;
	            }
	            else if(target<nums[mid])
	            {
	                  System.out.println("Left SEARCH: " + mid);
	                right=mid-1;
	            }
	            
	            
	        }
	        
	        return -1;
	        
	    }
	    
	     public static int searchRight(int[] nums, int left, int right, int target)
	    {
	        int mid=-1;
	        
	         while(left<=right)
	        {
	            mid= (left+right)/2;
	            if(target==nums[mid])
	            {
	                
	                System.out.println("Right SEARCH: " + mid);
	                if(   (mid==nums.length-1)    ||  (mid+1<=nums.length-1 && nums[mid+1]>target)   )
	                {
	                    return mid;
	                } 
	                
	                left=mid+1;
	            }
	            else if(target>nums[mid])
	            {
	                     System.out.println("Right SEARCH: " + mid);
	                left=mid+1;
	            }
	            else if(target<nums[mid])
	            {
	                      System.out.println("Right SEARCH: " + mid);
	                right=mid-1;
	            }
	            
	            
	        }
	        
	        return -1;
	        
	    }
	    
	    
	    public static int[] searchRange(int[] nums, int target) {
	        
	        int left = 0;
	        int right = nums.length-1;
	        
	        int mid=-1;
	        
	        int resLeft=-1;
	        int resRight=-1;
	        
	        if(nums.length==1)
	        {
	            
	            if(nums[0]==target)
	            {
	                resLeft = 0;
	                resRight= 0;
	                
	            }
	                 int[] result=new int[2];
	        
	                  result[0]=resLeft;
	                  result[1]= resRight;
	            
	            return result;
	        }
	        
	        while(left<=right)
	        {
	            mid= (left+right)/2;
	            if(target==nums[mid])
	            {
	                  System.out.println("Main: " + mid);
	                resLeft= searchLeft(nums,left, mid-1, target);
	                
	                if(resLeft==-1)
	                {
	                    resLeft=mid;
	                }
	                
	                resRight= searchRight(nums,mid+1, right, target);
	                
	                 if(resRight==-1)
	                 {
	                    resRight=mid;
	                 }
	                
	                break;
	            }
	            else if(target>nums[mid])
	            {
	                left=mid+1;
	            }
	            else if(target<nums[mid])
	            {
	                right=mid-1;
	            }
	            
	            
	        }
	        
	        int[] result=new int[2];
	        
	        result[0]=resLeft;
	        result[1]= resRight;
	        
	        return result;
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0,0,0,0,1,2,3,3,4,5,6,6,7,8,8,8,9,9,10,10,11,11};
		int target=0;
		
		
		searchRange(nums, target);
		
	}

}
