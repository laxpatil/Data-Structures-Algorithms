/**
 * 
 */
package Amazon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author Laxmikant
 *
 */
public class ChainInspection {

	/**
	 * @param args
	 */
	
	public static String checkChain(HashMap<Integer, Integer> chainMap)
	{
		if(chainMap.size()==0)
			return "BAD";
		
		int pairCount=0;
		int startChain=0;
		
		
		// START as -1 & END as 0
		
		if(chainMap.containsKey(-1))
		{
			startChain=chainMap.get(-1);
			pairCount++;
			chainMap.remove(-1);
			
		}
		else
		{
			return "BAD";
		}
		
		int chainKey= startChain;
		while(chainKey != 0 && chainMap.containsKey(chainKey) )
		{
			
			int tempKey= chainKey;
			chainKey= chainMap.get(chainKey);
			
			chainMap.remove(tempKey);
			
			pairCount++;
			
		}
		
		if(chainKey==0 && chainMap.size()==0)
		{
			return "GOOD";
		}
		
		return "BAD";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("C:\\Users\\Laxmikant\\workspace\\Data Structures\\src\\Amazon\\chains.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println("Chain: "+sCurrentLine);
				
				String[] pairs= sCurrentLine.split(";");
				
				HashMap<Integer, Integer> chainMap= new HashMap<>();
				for(int i=0;i<pairs.length;i++)
				{
					String v1= pairs[i].split("-")[0];
					String v2= pairs[i].split("-")[1];
					
					if(v1.equals("BEGIN"))
					{
						chainMap.put(-1, Integer.parseInt(v2));
					}
					else if(v2.equals("END"))
					{
						chainMap.put(Integer.parseInt(v1), 0);
					}
					else
					{
						chainMap.put(Integer.parseInt(v1), Integer.parseInt(v2));
					}
					
				}
				
				
				// call method
				String result= checkChain(chainMap);
				System.out.println("Result:  "+result);
				
			}

		} catch (IOException e) {
			e.printStackTrace();
	}

}
}