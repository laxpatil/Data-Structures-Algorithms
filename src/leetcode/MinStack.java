/**
 * 
 */
package leetcode;

import java.util.LinkedList;

/**
 * @author Laxmikant
 *
 */
public class MinStack {
    
    LinkedList<Integer> minSt = null;
    LinkedList<Integer> mainStack = null;
    
    /** initialize your data structure here.*/
    
    public MinStack() {
    
        minSt =new  LinkedList<Integer>();
        mainStack =  new LinkedList<Integer>();
    }
    
    public void push(int x) {
        
       mainStack.addFirst(x);
        if(minSt.isEmpty())
        {
            minSt.addFirst(x);
        }
        else
        {
            if(minSt.peek()>x)
            {
                minSt.addFirst(x);
            }
            else
            {
                minSt.addFirst(minSt.peek());
            }
        }
    }
    
    public void pop() {
        
        if(mainStack.isEmpty())
        {
            return;
        }
        mainStack.pollFirst();
        minSt.pollFirst();
        
    }
    
    public int top() {
         if(mainStack.isEmpty())
        {
            return -1;
        }
    
    return mainStack.peek();
    
    }
    
    public int getMin() {
         if(mainStack.isEmpty())
        {
            return -1;
        }
        
        return minSt.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
