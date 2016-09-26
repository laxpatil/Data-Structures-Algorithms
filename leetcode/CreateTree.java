/**
 * 
 */
package leetcode;

import java.util.List;

/**
 * @author Laxmikant
 *
 */
public class CreateTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root= new TreeNode(1);
		
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		
		root.left.left=new TreeNode(4);
		root.left.right=null;
		
		root.right.left=null;
		root.right.right=new TreeNode(5);
		
	/**	ZigzagLevelTraversal z= new ZigzagLevelTraversal();
		
		List<List<Integer>> l=z.zigzagLevelOrder(root);
		
		for (List<Integer> l1 : l )
		{
			for(int k : l1)
			{
				System.out.print(" "+ k);
			}
			System.out.println();
		}
		
		**/
		
		
		
	}

}
