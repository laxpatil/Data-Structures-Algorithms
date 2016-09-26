/**
 * 
 */
package leetcode;

import java.util.Stack;

/**
 * @author Laxmikant
 *
 */

public class LongestValidParanthesis {
    public int longestValidParentheses(String s) {
        
       Stack<int[]> stack =  new Stack<int[]>();
       
       int result=0;
       
       
       int i=0;
       
       while(i<s.length())
       {
           
           char c=  s.charAt(i);
           
           if(c=='(')
           {
               int[] p ={i,0};
               stack.push(p);
               
           }
           
           else
           {
               if(stack.empty() || stack.peek()[1]==1)
               {
                   int[] p= {i,1};
                   stack.push(p);
               }
               else
               {
                   stack.pop();
                   
                   int cur=0;
                   
                   if(stack.empty())
                   {
                       cur=i+1;
                   }
                   else
                   {
                       cur= i-stack.peek()[0];
                   }
                   
                   result =  Math.max(result, cur);
               }
               
           }
           
           
           
        i++;
           
       }
        
        return result;
    }
}