/**
 * 
 */
package leetcode;

import java.util.HashMap;

/**
 * @author Laxmikant
 *
 */
public class FractionToRecurringDecimal {
public String fractionToDecimal(int numerator, int denominator) {
        
        if(numerator==0)
        {
            return "0";
        }
        if(denominator==0)
        {
            return "";
        }
        
        long n = numerator;
        long d = denominator;
        
        
        
        String intPart="";
        
        
          if((n<0) ^ (d<0))
        {
            intPart = "-"+ intPart;
        }
        n=Math.abs(n);
        d=Math.abs(d);
        
        intPart += ""+ n/d;
        long rem = (n%d) * 10 ;
        
      
        if(rem==0)
        {
            return ""+intPart;
        }
        
        
        
        String fractionPart="";
        
        HashMap<Long, Integer> map = new HashMap<Long, Integer>(); 
        
        while(rem!=0)
        {
            
            if(map.containsKey(rem))
            {
                int index = map.get(rem);
                String part1 = fractionPart.substring(0,index);
                String part2 = fractionPart.substring(index,fractionPart.length());
                fractionPart = part1+ "(" + part2 + ")";
                return ""+ intPart+"." + fractionPart;
                
            }
            
            map.put(rem,fractionPart.length());
        
            
            long div = rem/d;
            
          
            
            fractionPart += String.valueOf(div);
          
            rem=rem%d;
            rem = rem*10;
            
        }
        
        
        return ""+ intPart+"." + fractionPart;
        
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
