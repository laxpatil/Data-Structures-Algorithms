/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Laxmikant
 *
 */
public class WordBreak {
	 public boolean wordBreak(String s, List<String> wordDict) {
	        
	        int[] table = new int[s.length()+1];
	        
	        Arrays.fill(table,-1);
	        
	        
	        table[0]=0;
	        
	        for(int i=0;i<s.length();i++)
	        {
	            
	            if(table[i]!=-1)
	            {
	                
	                for(int j=i+1;j<s.length()+1;j++)
	                {
	                    String t = s.substring(i,j);
	                    
	                    if(wordDict.contains(t))
	                    {
	                        table[j]=i;
	                    }
	                    
	                    
	                }
	            }
	            
	            
	        }
	        
	        return table[s.length()]!=-1;
	        
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
