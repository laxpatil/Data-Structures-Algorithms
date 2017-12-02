/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lapatil
 *
 */
public class LargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public String largestNumber(int[] nums) {
        
		String[] strs= new String[nums.length];
		for(int i= 0;i<nums.length;i++) {
			strs[i]=String.valueOf(nums[i]);
		}
		
		Arrays.sort(strs,new Comparator<String>() {
		public int compare(String a, String b) {
		return (b+a).compareTo(a+b);
		}
		}
		);
		String res="";
		for(int i=0;i<strs.length;i++) {
			res+=strs[i];
		}
		
		while(res.charAt(0)=='0' && res.length()>1) {
			res=res.substring(1);
		}
		
		return res;
    }


}
