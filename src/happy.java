import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;


public class happy {
 int count=0;
	
	public static boolean isHappy(int n) {
	    HashSet<Integer> set = new HashSet<Integer>();
	 
	    while(!set.contains(n)){
	        set.add(n);
	        
	        n = sum(getDigits(n));
	        
	        if (n == 1)
	        {
	        	int count=set.size();
	           System.out.println("happy "+count);
	            return true;
	        }
	    }
	    int count=set.size();
	    System.out.println("unhappy "+count);
	    return false;
	}
	 
	public static int sum(int[] arr){
	    int sum = 0;
	    for(int i: arr){
	        sum = sum + i*i;
	    }
	    return sum;
	}
	 
	public static int[] getDigits(int n){
	    String s = String.valueOf(n);
	    int[] result = new int[s.length()];
	    int i=0;
	 
	    while(n>0){
	        int m = n%10;
	        result[i++] = m;
	        n = n/10;
	    }
	 
	    return result;
	}
	
	
	
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
	
