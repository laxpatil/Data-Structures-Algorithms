/**
 * 
 */
package leetcode;

/**
 * @author lapatil
 *
 */

class NodeHelper{
	boolean validity;
	int min;
	int max;
	public NodeHelper(boolean validity, int min, int max) {
		// TODO Auto-generated constructor stub
		this.validity=validity;
		this.min=min;
		this.max=max;
	}
	
}
public class ValidateBST {
	public boolean isValidBST(TreeNode root) {
		if(root==null){
            return true;
        }
		NodeHelper rootHelperNode = isValidBSTHelper(root);
		return rootHelperNode.validity;
	    }
	
	
	public NodeHelper isValidBSTHelper(TreeNode root) {
		
		if((root.left==null) && (root.right==null)) {
			return new NodeHelper(true, root.val, root.val);
		}
		
		if(root.left!=null && root.right!=null) {
			NodeHelper l = isValidBSTHelper(root.left);
			NodeHelper r = isValidBSTHelper(root.right);
			if(l.validity && r.validity && ((l.max < root.val) && (root.val < r.min ) )) {
				return new NodeHelper(true, l.min, r.max);
			}
		}
		else if(root.left!=null)
		{
			NodeHelper l = isValidBSTHelper(root.left);
			if(l.validity && (l.max < root.val )) {
				return new NodeHelper(true, l.min, root.val);
			}
		}
		else
		{
			NodeHelper r = isValidBSTHelper(root.right);
			if(r.validity && (root.val < r.min ) ) {
				return new NodeHelper(true, root.val, r.max);
			}
		}
		
		return new NodeHelper(false, root.val, root.val);
		
	}
}
