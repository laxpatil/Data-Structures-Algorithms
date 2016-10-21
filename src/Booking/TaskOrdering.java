/**
 * 
 */
package Booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Laxmikant
 *
 */
public class TaskOrdering {

	/**
	 * @param args
	 */
	
	
	public static ArrayList<Integer> taskSorting(int key,  HashMap<Integer, ArrayList<Integer>> adjcancy, HashMap<Integer,Boolean> marked,ArrayList<Integer> result )
	{
		
		 Iterator it = adjcancy.entrySet().iterator();
		 
		 ArrayList<Integer> laterNode =  adjcancy.get(key);
		 
		 if(laterNode!=null)
		 {
			 
		
		   for(int j=0;j<laterNode.size();j++)
		   {
			   int nextKey= laterNode.get(j);
			   if(marked.get(nextKey)==false)
			   {
				   System.out.println("key to perform DFS: "+ nextKey);
				   taskSorting(nextKey, adjcancy, marked, result);
			   }
		   }
		   
		 }
		  
		   result.add(key);
		   System.out.println("in result : "+key);
		   marked.put(key, true);
		   
		   return result;
		
	}
	
	 static int[] taskOrdering(int[][] dependency) {
		 

	HashMap<Integer,Boolean> marked = new HashMap<Integer, Boolean>();
    HashMap<Integer, ArrayList<Integer>> adjcancy = new   HashMap<Integer, ArrayList<Integer>>();
    
	
	for(int i=0;i<dependency.length;i++)
	{
		//System.out.println(dependency[i][0]);
		if(!adjcancy.containsKey(dependency[i][0]))
		{
			ArrayList<Integer> laterNodes= new ArrayList<Integer>();
			laterNodes.add(dependency[i][1]);
			adjcancy.put(dependency[i][0], laterNodes);
			
			marked.put(dependency[i][0], false);
			marked.put(dependency[i][1], false);
		}
		else
		{
			ArrayList<Integer> laterNodes= adjcancy.get(dependency[i][0]);
			laterNodes.add(dependency[i][1]);
			adjcancy.put(dependency[i][0], laterNodes);
			marked.put(dependency[i][0], false);
			marked.put(dependency[i][1], false);
		}
		
	}
	
	ArrayList<Integer> result = new ArrayList<Integer>();
	
	 Iterator it = adjcancy.entrySet().iterator();
	 
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        
	        int key= (int) pair.getKey();
	        
	        if(marked.get(key)==false)
	        {
	        	System.out.println("key to perform DFS: "+ key);
	        	taskSorting(key ,adjcancy, marked, result);
	        	
	        }
	        
	        
	    }
	
	    	int[] resultArr=  new int[result.size()];
	    	int k=0;
	    	for(int i=result.size()-1;i>=0;i--)
			{
				resultArr[k++]=result.get(i);
			}
		 return resultArr;
		 
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int[][] arr=
			{
				{2,1},
				{3,1},
				{4,1},
				{3,2},
				{4,2},
				{4,3},
				{5,3},
				{5,4}
			};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i][0]+":"+arr[i][1]);
		}
		int[] result =taskOrdering(arr);
		
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
	}
	
	

}
