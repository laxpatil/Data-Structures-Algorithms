/**
 * 
 */
package leetcode;

/**
 * @author Laxmikant
 *
 */
public class MedianOfTwoSortedArrays {

	/**
	 * @param args
	 */
	
	public static double median(int arr[], int i, int j)
	{
		if((i+j)%2==0)
		{
			return ((arr[(i+j)/2] + arr[(i+j)/2 -1]) /2) ;
		}
		else
		{
			return arr[(i+j)/2];
		}
	}
	
	public static int findMedianIndex(int i, int j)
	{
		if((i+j)%2==0)
		{
			return (((i+j)/2+ (i+j)/2 -1) /2) ;
		}
		else
		{
			return (i+j)/2;
		}
	}
	
	public static double findMedianSortedArrays2(int[] nums1,int aStart, int aEnd, int[] nums2, int bStart, int bEnd) {
		
		int aLen= aEnd- aStart +1;
		int bLen= bEnd- bStart +1;
		
		if(aLen==1  && bLen ==1)
		{
			return (nums1[aStart] + nums2[bStart]) / 2; 
		}
		
		if(aLen==2 && bLen==2)
		{
			return (Math.max(nums1[aStart], nums2[aStart])+ Math.min(nums1[aEnd], nums2[aEnd])) /2 ;
		}
		
		
		double m1= median(nums1,aStart,aEnd);
		double m2= median(nums2,bStart,bEnd);
		
		int aIndex= findMedianIndex(aStart,aEnd);
		int bIndex= findMedianIndex(bStart,bEnd);
		
		
		
		
		
		
		if(m1==m2)
		{
			return m1;
		}
		if(m1>m2)
		{
			return findMedianSortedArrays2(nums1, aStart, aIndex, 
										   nums2, bIndex, bEnd);
		}
		else
		{
			
				return findMedianSortedArrays2(nums1,aIndex, aEnd,
											   nums2, bStart,bIndex);
		}
		
		
        
    }
	
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		
		int aStart=0;
		int aEnd=nums1.length;
		int bStart=0;
		int bEnd=nums2.length;
		return findMedianSortedArrays2(nums1, aStart, aEnd, nums2, bStart, bEnd);
        
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 12, 15, 26, 38};
		 int[]  b = {2, 13, 17, 30, 45};
		
		System.out.println(findMedianSortedArrays(a,b));
	}

}
