/**
 * 
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Laxmikant
 *
 */
public class cat {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		
		
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String temp = bfr.readLine();
        int N = Integer.parseInt(temp);
       
      
        
        for(int m = 0; m < N; m++){
            temp = bfr.readLine();
            
            int p = Integer.parseInt(temp);
            System.out.println("input");
            if(p==1)
            	 System.out.println("1");
            else
            	
            {
            	long[] c= new long[p+1];
            
            
            c[0] = c[1] = 1;
         
         
            for (int i=2; i<=p; i++)
            {
                c[i] = 0;
                for (int j=0; j<i; j++)
                    c[i] += c[j] * c[i-j-1];
                
                System.out.println("c "+ i  +": "+ c[i]);
            }
         
            System.out.println("printing");
            System.out.println(""+ (c[p]% (1000000000+9)));
            }
        }
	}

}
