/**
 * 
 */
package leetcode;

/**
 * @author Laxmikant
 *
 */
public class LCABST {

	/**
	 * @param args
	 */
	
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root==null)
	            return null;
	        
	         if( ((root.left==p) && (root.right==q)) || ((root.left==q) && (root.right==p)) ) 
	            return root;
	        
	         if((root==p) || (root==p) || (root==q) || (root==q) )
	            return root;
	        
	         if(p.val <= root.val && q.val>= root.val )
	            return root;
	            
	          if(q.val <= root.val && p.val>= root.val )
	            return root; 
	        
	        if(p.val < root.val && q.val< root.val )
	            return lowestCommonAncestor(root.left,p,q);
	        
	        if(p.val > root.val && q.val> root.val )
	            return lowestCommonAncestor(root.right,p,q); 
	            
	        
	        return null;
	    
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
