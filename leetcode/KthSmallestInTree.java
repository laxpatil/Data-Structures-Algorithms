package leetcode;

import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class KthSmallestInTree {
 public  int kthSmallest(TreeNode root, int k)
    {
       Stack<TreeNode> s = new Stack<TreeNode>();
       int res=0;
       
       
       
       TreeNode q=root;
       while(!s.isEmpty() || q!=null)
       {
           if(q!=null)
           {
               s.push(q);
               q=q.left;
           }
           else
           {
               TreeNode t=s.pop();
             //  System.out.println("val"+t.val);
                k--;
                
                if(k==0)
                {
                    res= t.val;
                    break;
                }
                q=t.right;
              
           }
           
           
       }
       
       return res;
       
      
        
    }

}