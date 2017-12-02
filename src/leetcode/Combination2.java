/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lapatil
 *
 */
public class Combination2 {
	
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
	List<List<Integer>> result =new ArrayList<List<Integer>>();
	List<Integer> cur = new ArrayList<Integer>();
	Arrays.sort(candidates);
	helper(result, cur, 0,target,candidates);
	return result;
	
	
    }

public void helper(List<List<Integer>> result, List<Integer> cur, int start, int target, int[] candidates) {
	// TODO Auto-generated method stub
	if(target==0)
	{
		result.add(new ArrayList<>(cur));
		return;
	}
	
	if(target<0) {
		return;
	}
	int prev=-1;
	for(int i=start;i<candidates.length;i++)
	{
		if(prev!=candidates[i]) {
			cur.add(candidates[i]);
			helper(result, cur, i+1, target-candidates[i], candidates);
			cur.remove(cur.size()-1);
			prev=candidates[i];
		}
		
	}
}


}
