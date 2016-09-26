/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Laxmikant Patil
 *
 */
public class FrogJump {
    public boolean canCross(int[] stones) {
        
        if(stones==null | stones.length==0 || stones[0]!=0)
        {
            return false;
        }
        
        HashMap<Integer, HashSet<Integer>> steps= new HashMap<>();
        
        for(int i=0;i<stones.length; i++)
        {
            steps.put(stones[i], new HashSet<Integer>());
        }
        
        for(int num : stones)
        {
            HashSet<Integer> substeps = steps.get(num);
            
            if(num==0)
            {
                substeps.add(0);
                if(steps.containsKey(1))
                    {
                        steps.get(1).add(1);
                    }
                    
                continue;
            }
            
            for(int step: substeps)
            {
                for(int jump = step-1, pos=num+step-1; jump<=step+1; pos++, jump++)
                {
                    
                    if(pos!=num && steps.containsKey(pos))
                    {
                       // System.out.println(pos);
                        steps.get(pos).add(jump);
                    }
                }
            }
            
        }
        
        return !steps.get(stones[stones.length-1]).isEmpty() ;
        
    }
}