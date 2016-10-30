/**
 * 
 */
package Hackerrank_Walmart;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Laxmikant
 *
 */
public class CountyourProgressionOptimized {

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
		
		int globalCount= 1;  // empty + individual element
		
		HashMap<Integer,HashMap<Integer,Integer>> indexMap = new HashMap<Integer,HashMap<Integer,Integer>>(n);
		

		for(int i=0;i<n;i++)
		{
			
			HashMap<Integer,Integer> indexDiff = 	new HashMap<Integer,Integer>();
			
			indexMap.put(i, indexDiff);  //ainvey
			
			indexDiff = 	indexMap.get(i);
			
			for(int j=0;j<i;j++)
			{
				HashMap<Integer,Integer> diffMap = indexMap.get(j);
				
				int diff = seq[i] - seq[j];
				
				
				
			
					int count=0;
					if(diffMap.containsKey(diff))
					{
						 count = diffMap.get(diff);
						 indexDiff.put(diff, count+1); // total elements
						 System.out.println(seq[i]+":"+seq[j]+" adding diff "+diff+":"+(count+1));
					}
					else
					{
						 indexDiff.put(diff, 2); // total elements
					}	
				
				
				
					
				
			}
			
		
			indexMap.put(i, indexDiff);
			
		}
		
		
		HashMap<Integer,Integer> diffMap = indexMap.get(n-1);
		
		Set<Entry<Integer, Integer>> entry=  diffMap.entrySet();
		
		
		for(Entry<Integer, Integer> en: entry)
		{
			int val= (int) en.getValue();
			
			System.out.println("c="+val);
			globalCount+= (int)(Math.pow(2, val)) - 1 ;
			
		}
		globalCount+=n;
		
		
		System.out.println(globalCount);
	}

}
