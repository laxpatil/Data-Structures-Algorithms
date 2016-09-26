/**
 * 
 */
package leetcode;

/**
 * @author Laxmikant
 *
 */
public class LCABinaryTree {

	/**
	 * @param args
	 */
	
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        
	        if(root==null)
	            return null;
	        
	        if( ((root.left==p) && (root.right==q) ) || ( (root.left==q) && (root.right==p) ) )
	            return root;
	        
	        if((root.left==p) || (root.right==p) || (root.left==q) || (root.right==q) )
	            return root;
	        
	        TreeNode l= lowestCommonAncestor(root.left, p, q);
	        TreeNode r= lowestCommonAncestor(root.right,p, q);
	        
	        return (l!=null) ? l : r;
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
