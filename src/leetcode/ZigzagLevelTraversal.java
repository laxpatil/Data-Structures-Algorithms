/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Laxmikant
 *
 */
public class ZigzagLevelTraversal {

	/**
	 * @param args
	 */
	
	
	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        
		 Stack<TreeNode>  stack1= new  Stack<TreeNode> ();
	        
	        Stack<TreeNode> stack2 = new Stack<TreeNode>();
	        boolean S1=true;
	         boolean S2=false;
	        
	       stack1.push(root);
	        
	        List<List<Integer>> result= new ArrayList<List<Integer>>();
	       
	        if(root==null)
	        {
	            return result;
	        }
	        while(!stack1.isEmpty() || !stack2.isEmpty())
	        {
	        	List<Integer> temp= new ArrayList<Integer>();
	        	if(S1==true)
	        	{
	        		
	        		while(!stack1.isEmpty())
	        		{
	        			TreeNode t= stack1.pop();
	        			
	        			temp.add(t.val);
	        			if(t.left!=null)
	        			{
	        				System.out.println("Now inserting stack2   :" +t.left.val);
	        				stack2.push(t.left);
	        			}
	        			if(t.right!=null)
	        			{
	        				System.out.println("Now inserting stack2   :" +t.right.val);
	        				stack2.push(t.right);
	        			}
	        		}
	        		result.add(temp);
	        		S1=false;
	        		S2=true;
	        		
	        	}
	        	else if(S2==true)
	        	{
	        		while(!stack2.isEmpty())
	        		{
	        			TreeNode t= stack2.pop();
	        			temp.add(t.val);
	        			
	        			
	        			
	        			
	        			if(t.right!=null)
	        			{
	        				System.out.println("Now inserting stack1   :" +t.right.val);
	        				stack1.add(t.right);
	        			}
	        			
	        			if(t.left!=null)
	        			{
	        				System.out.println("Now inserting stack1  :" +t.left.val);
	        				stack1.add(t.left);
	        			}
	        		}
	        		result.add(temp);
	        		S2=false;
	        		S1=true;
	        	}
	        		
	        }
	        
	        return result;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
