/**
 * 
 */
package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Laxmikant
 *
 */
public class slidingMaxWindow {

	/**
	 * @param args
	 * 
	 * O(n) solution with DQEUUE

	 */
	
	public static int[] maxSlidingWindow(int[] nums, int k) {
		
		
		Deque dq = new ArrayDeque<Integer>();
		
		for(int i=0;i<k;i++)
		{
			while(!dq.isEmpty() && nums[i]>=(int)dq.peekLast())
			{
				dq.removeLast();
			}
			dq.addLast(i);
		}
		
		for(int i=k ;i<nums.length;i++)
		{
			System.out.print(" "+nums[(int) dq.getFirst()]);
			
			
			while(!dq.isEmpty() && (int)dq.getFirst()<i-k)
			{
				dq.removeFirst();
			}
			
			while(!dq.isEmpty() && nums[i]>=(int)dq.peekLast())
			{
				dq.removeLast();
			}
			//System.out.print(" "+nums[(int) dq.getFirst()]);
			dq.addLast(i);
		}
		
		
		System.out.print(" "+nums[(int) dq.getFirst()]);
		return nums;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  num= {1,3,-1,-3,5,3,6,7};
		maxSlidingWindow(num, 3);
	}

}
