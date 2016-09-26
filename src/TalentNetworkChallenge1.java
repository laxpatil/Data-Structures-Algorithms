/**
 * 
 */
package coding;

import java.util.Scanner;

/**
 * @author laxmikant
 *
 */
public class ttnc1 {

	/**
	 * @param args
	 */
	
		
	
	 public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	       // BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	       
	     String ip=in.nextLine();
	     
	     int N=Integer.parseInt(ip.split(" ")[0]);
	     
	     int S=Integer.parseInt(ip.split(" ")[1]);
	     
	     int t=S, a=S,week=1;
	     while(a<N)
	     {
	    	 t=a+t;
	    	 a=a+t;
	    	 week++;
	     }
	     System.out.println(week);
	}

}
