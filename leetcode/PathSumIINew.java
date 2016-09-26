/**
 * 
 */
package leetcode;

import java.util.*;

/**
 * @author Laxmikant
 *
 */
public class PathSumIINew {

	/**
	 * @param args
	 */
	
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result= new ArrayList<List<Integer>>();
	
		if(root==null)
		return result;
		
		
		ArrayList<Integer> currentList= new ArrayList<Integer>();
		int tSum=0;
		dfs(root,currentList,result,sum,tSum);
		return result;
		
		
	}
	
	
	public void dfs(TreeNode root, ArrayList<Integer> currentList, List<List<Integer>> result, int sum, int tSum )
	{
		if((root.left==null) && (root.right==null)  && (tSum==sum) )
		{
			result.add(currentList);
		}
		
		if(root.left!=null)
		{
			currentList.add(root.left.val);
			dfs(root.left,currentList,result,sum,tSum+root.left.val);
			currentList.remove(currentList.size()-1);
		}
		
		if(root.right!=null)
		{
			currentList.add(root.right.val);
			dfs(root.right,currentList,result,sum,tSum+root.right.val);
			currentList.remove(currentList.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
