package coding;

/**
 * 
 */
//package coding;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
 
/**
 * @author laxmikant
 *
 */
class ttnc2 {
 
	/**
	 * @param args
	 */
	static int totalCount=0;
	
	public static void countCombination(int current,int[] prices, int j){
		
		if(current==0)
		{
			//System.out.println("Current= " +current);
			totalCount++;
			return;
		}
		if(current<0)
		{
			//System.out.println("Current= " +current);
			return;
			
		}
		/*
		Iterator it = m.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<String, Integer> pair = (Map.Entry)it.next();
			countCombination(current-pair.getValue(),m);
		}
		*/
		
		for(int i=j;i<prices.length;i++)
		{
			countCombination(current-prices[i],prices,i);
		}
		
		return;
	}
	
	 public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	       // BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	       
	     String ip=in.nextLine();
	     
	     int M=Integer.parseInt(ip.split(" ")[0]);
	     int N=Integer.parseInt(ip.split(" ")[1]);
	       int[] prices=new int[N];
	     HashMap<String, Integer> m=new HashMap<String, Integer>();
	     for (int i=0;i<N;i++)
	     {
	    	 String obj=in.nextLine();
	    	 String[] words=obj.split(" ");
	    	 String price= words[words.length-1];
	    	 
	    	 
	    	// m.put(obj.substring(0, obj.indexOf("price", 0)), Integer.parseInt(price));
	    	 prices[i]=Integer.parseInt(price);
	     }
	     
	     countCombination(M,prices,0);
	     System.out.println(totalCount);
	     
	       
	    }
 
}
 