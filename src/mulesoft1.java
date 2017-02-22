

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/**
 * @author laxmikant
 *
 */
import java.util.HashSet;
import java.util.Set;

class mulesoft1 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int max = 0;
        
        if(A.length==0)
        {
            return 0;
        }
        
        
        for (int i = 0; i < A.length; i++) {
            Set<Integer> s = new HashSet<Integer>();
            int flag = 1;
            int sSize = 0;
            for (int j = i; j < A.length & (flag==1); j++) {
                s.add(A[j]);
                if (s.size() > 2)
                    flag = 0;
                else {
                	sSize++;
                    if (sSize > max)
                        max = sSize;
                }
            }
        }
        //System.out.println(max);
        return max;
        
        
    }
}