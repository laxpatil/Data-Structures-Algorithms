/**
 * 
 */
package leetcode;
/**
public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
/**
 * @author Laxmikant
 *
 */


public class MaxPathSum {

	/**
	 * @param args
	 */
	  public int maxPathSum(TreeNode root) {
	       int[] res= new int[1];
	       
	       res[0]= Integer.MIN_VALUE;
	       maxAux(root,res);
	       return res[0]; 
	    }
	    
	    
	    public int maxAux(TreeNode root, int[] res)
	    {
	         
	        
	        if(root==null)
	        return 0;
	        
	        int l= maxAux(root.left, res);
	        
	        int r= maxAux(root.right, res);
	        
	        int current= Math.max(Math.max(l,r)+root.val , root.val);
	        
	        int max_with_root= Math.max(current, l+r+root.val);

	        res[0]= Math.max(max_with_root, res[0]);
	        return current;
	        
	        
	    }

}
