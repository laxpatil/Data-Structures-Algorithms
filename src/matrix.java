import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class matrix {
	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			String cur;

			br = new BufferedReader(new FileReader("C:\\Users\\Laxmikant\\Documents\\testing.txt"));
			
			while ((cur = br.readLine()) != null) {
	     int n=Integer.parseInt(cur);
	     if(n==1)
	     {
	    	 System.out.println("happy 0");
	     }
	     else
	     isHappy(n);
}
			 System.out.println();	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
}
}
