/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Laxmikant
 *
 */
public class PathSumII {

	/**
	 * @param args
	 */
	
public List<List<Integer>> pathSum(TreeNode root, int sum) {
	
	 List<List<Integer>> result= new ArrayList<List<Integer>>();
	 
	 ArrayList<Integer> p= new ArrayList<Integer>();
	 Stack<TreeNode> s = new Stack<TreeNode>();
	
	 int tSum=0;
	 TreeNode q= root;
	 while(!s.isEmpty() || q!=null )
	 {
		 if(q!=null)
		 {
			 tSum+=q.val;
			 p.add(q.val);
			
			 s.push(q);
			 q=q.left;
		 }
		 else
		 {
			  if(tSum==sum)
			  {
				   result.add(p);
			  }
			 TreeNode t= s.pop();
			 p.remove(p.size()-1);
			 tSum=tSum-t.val;
			 q=t.right;
			 
		 }
		 
		 
	 }
	 
	
	
	return null;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
