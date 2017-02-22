/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author Laxmikant
 *
 */
class HIndex {

	
	public int hIndex(int[] citations) {
        
        
        Arrays.sort(citations);
        int result=0;
        for(int i=0;i<citations.length;i++){
            
            int small =Math.min(citations[i],citations.length-i);
            result= Math.max(small, result);
        }
        
        return result;
}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
