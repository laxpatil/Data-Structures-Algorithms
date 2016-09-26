package leetcode;
import java.util.LinkedList;


public class trieNode{
        char data;
        LinkedList<trieNode> childList;
        boolean end;
        
        
        
        public trieNode(char c)
        {
        	
        	
        	childList=new LinkedList<trieNode>();
        	end=false;
        	data=c;
        	
        }
        
        public trieNode getsubNode(char c)
        {
        	if (childList !=null)
        	{
        		for (trieNode d: childList)
        		{
        			if (d.data==c)
        			{
        				return d;
        			}
        		}
        	}
        	
        	return null;
        }
        
        
        
    }
    