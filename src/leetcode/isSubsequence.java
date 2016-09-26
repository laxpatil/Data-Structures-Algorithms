/**
 * 
 */

/**
 * @author Laxmikant
 *
 */
public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        
        
        int[] seq=  new int[s.length()];
        
        int i=0;
        int j=0;
        while(i<s.length())
        {
            if(j==t.length())
                break;
            if(s.charAt(i) == t.charAt(j))
            {
                i++;
                
            }
            
            j++;
            
        }
        
        
        if(i==s.length())
        return true;
        
        return false;
        
    }
}