/**
 * 
 */
package Coursera;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Laxmikant
 *
 */
public class coursera1 {

	/**
	 * @param args
	 */
	
	
	
	public static void sol(int[] prices)
	{
		int min=prices.length-1;
		ArrayList<Integer> t=  new ArrayList<Integer>();
		String ans="";
		t.add(min);
		ans=" "+min + ans;
		int total=prices[min];
		for(int i=prices.length-2;i>=0;i--)
		{
			int flag=0;
			int val=0;
			for(int j=min;j>i;j--)
			{
				if(prices[i]>=prices[j])
				{
					flag=1;
					val=prices[i]-prices[j];
					
				}
			}
			if(prices[min]>= prices[i])
			{
				
				min=i;
				//System.out.println("min :"+min);
			}
			
			if(flag==0)
			{
				//System.out.println(i);
				t.add(i);
				val=prices[i];
				ans=" " +i+ ans;
			}
			
			//System.out.println("val :"+val);
			total+=val;
		}
		
		System.out.println(total);
		
	
		
		
		System.out.println(ans.trim());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = {5,1,3,4,6,2};									
		
		sol(p);
	}

}
