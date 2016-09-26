package coding;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");



/**
 * @author laxmikant
 *
 */
class mulesoft2 {
	 public static void main(String[] args){
        // write your code in Java SE 8
        int N=1000000000;
  int j= (int) Math.sqrt(N);
 // System.out.println(j);
  
  int x=j*(j+1)/2;
        int k=j+1;
       
        while(true)
        {
            x=x+k;
            
            if(x>N)
            {
                
                break;
            }
            
            k++;
            
        }
        k=k-1;
        System.out.println(k);
       // return k;
        
        
        
        
        
    }
}