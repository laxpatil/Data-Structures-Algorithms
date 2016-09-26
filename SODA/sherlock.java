	/**
	 * 
	 */
	package SODA;
	
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Scanner;
	
	/**
	 * @author Laxmikant
	 *
	 */
	public class sherlock {
	
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			
			String ip= sc.nextLine();
			
			HashMap<Character, Integer> h= new HashMap<Character, Integer>();
			for(int i=0;i<ip.length();i++)
			{
				char c=ip.charAt(i);
				if(h.containsKey(c))
				{
					h.put(c, h.get(c)+1);
				}
				else
					h.put(c, 1);
			}
	       
	       
			
			int count=0;
			int i=0;
			int first=0;
			for(Entry<Character, Integer> entry : h.entrySet()){
				if(i==0)
				{
					int t= entry.getValue();
					//System.out.println(t);
					first=t;
					i++;
				}
				else
				{
					int t= entry.getValue();
					if(first!=t)
					{
						count++;
					}
				}
			}
			
			
			if(count<=1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}	
					
		}
	
	}
