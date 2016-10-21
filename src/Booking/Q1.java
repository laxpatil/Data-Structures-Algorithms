/**
 * 
 */
package Booking;

import java.util.ArrayList;

/**
 * @author Laxmikant
 *
 */
public class Q1 {

	/**
	 * @param args
	 */
	
	
	
	public static boolean contains_bomb(int[] arr)
	{
		ArrayList<Integer> newArr= new ArrayList<Integer>();
		  
		
		int i=0;
		while(i<arr.length-1)
		{
			
			int num= arr[i];
			if(arr[i]==arr[i+1])
			{
				newArr.add(arr[i]);
				//System.out.println(arr[i]);
			}
			
			while(i<arr.length && arr[i]==num)
			{
				i++;
			}
			
		}
		
		int count=1;
		for(int j=0;j<newArr.size()-1;j++)
		{
			if(newArr.get(j+1) ==( newArr.get(j) + 1))
			{
			
				count++;
				//System.out.println(newArr.get(j) + ":"+newArr.get(j+1)+ " count="+count);
			}
			else
			{
				count=1;
			}
			if(count==3)
			{
				return true;
			}
			
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {1,2,2,3,3,3,4,9,9,9,10,10,11,11};
		
		System.out.println(contains_bomb(arr));
	}

}
