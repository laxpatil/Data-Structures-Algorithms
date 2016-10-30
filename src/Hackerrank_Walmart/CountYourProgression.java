/**
 * 
 */
package Hackerrank_Walmart;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Laxmikant
 *
 */
public class CountYourProgression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int[] seq= new int[n];
		for(int i=0;i<n;i++)
		{
			seq[i]= sc.nextInt();
		}
		
		ArrayList<ArrayList<Integer>> list= new 	ArrayList<ArrayList<Integer>>();
		
		list.add(new ArrayList<Integer>());  //empty list
		
		for(int i=0;i<n;i++)
		{
			ArrayList<ArrayList<Integer>> newList= new ArrayList<ArrayList<Integer>>();
			
			for(int j=0;j<list.size();j++)
			{
				ArrayList<Integer> subList =  list.get(j);
				
				ArrayList<Integer> newSubList= new ArrayList<Integer>();
				
				newSubList.addAll(subList);
				
				if(subList.size()==0 || subList.size()==1)
				{
					newSubList.add(seq[i]);
					newList.add(newSubList);
				}
				else
				{
					if((newSubList.get(0) - newSubList.get(1)) ==( newSubList.get(1)-  seq[i]))
					{
						newSubList.add(seq[i]);
						newList.add(newSubList);
					}
				}
				//System.out.println("new Sub List "+newSubList);
			}
			
			//System.out.println("New List Size: "+list.size());
			list.addAll(newList);
			
			
		}
		
		
		System.out.println((list.size()% 1000000009) );
		
	}

}
