/**
 * 
 */
package leetcode;

/**
 * @author lapatil
 *
 */
public class ContinuousSubarraySum {
public boolean checkSubarraySum(int[] nums, int k) {
        
		int[] sum = new int[nums.length];
		sum[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			sum[i] = sum[i - 1] + nums[i];
            if(k==0 && sum[i]==0) {
				return true;
			}
			if (k!=0 && sum[i] % k == 0) {
				return true;
			}
		}

		for (int i = 1; i < sum.length; i++) {
			for (int j = 0; j < i - 1; j++) {
                if(k==0 && (sum[i] - sum[j])==0) {
				return true;
			}
				if (k!=0 && ((sum[i] - sum[j]) % k == 0)) {
					return true;
				}
			}
		}

		return false;

	}
}
