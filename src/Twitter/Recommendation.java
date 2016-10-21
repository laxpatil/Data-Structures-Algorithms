/**
 * 
 */
package Twitter;

import java.util.*;

/**
 * @author Laxmikant
 *
 */
public class Recommendation {

	/**
	 * @param args
	 */
	
	public static int[] getRecommendedTweets(int[][] followGraph_edges, int[][] likeGraph_edges, 
            int targetUser, int minLikeThreshold) {
		
		
		
		
		
		
		TreeMap<Integer, TreeSet<Integer>> followerMap =  new TreeMap<Integer,  TreeSet<Integer>>();
		
		
		for(int i =0;i< followGraph_edges.length;i++)
		{
			int p= followGraph_edges[i][0];
			
			int f = followGraph_edges[i][1];
			
			if(followerMap.containsKey(p))
			{
				TreeSet<Integer> temp = followerMap.get(p);
				temp.add(f);
				followerMap.put(p, temp );
				
			}
			else
			{
				TreeSet<Integer> temp= new TreeSet<Integer>();
				temp.add(f);
				followerMap.put(p, temp);
			}
		
		}
		
		Iterator<Integer> ftr = followerMap.keySet().iterator();
		  while (ftr.hasNext()) 
		{
            int tid =ftr.next();
            System.out.println(tid+": ");
            
            TreeSet<Integer> t= followerMap.get(tid);
              Iterator<Integer> it2 = t.iterator();
		  while (it2.hasNext()) 
		{
            
			  System.out.println(it2.next()+" ");
        }
            
            
        }

		

			TreeMap<Integer, TreeSet<Integer>> tweetMap =  new TreeMap<Integer,  TreeSet<Integer>>();
				
				for(int i =0;i< likeGraph_edges.length;i++)
				{
					int p= likeGraph_edges[i][0];
					
					int t = likeGraph_edges[i][1];
					
					if(tweetMap.containsKey(t))
					{
						TreeSet<Integer> temp = tweetMap.get(t);
						temp.add(p);
						tweetMap.put(t, temp );
						
					}
					else
					{
						TreeSet<Integer> temp= new TreeSet<Integer>();
						temp.add(p);
						tweetMap.put(t, temp);
					}
				
				}
		
		 
		Iterator<Integer> itr = tweetMap.keySet().iterator();
				  while (itr.hasNext()) 
				{
	                  int tid =itr.next();
	                  System.out.println(tid+": ");
	                  
	                  TreeSet<Integer> t= tweetMap.get(tid);
	                    Iterator<Integer> it2 = t.iterator();
				  while (it2.hasNext()) 
				{
	                  
					  System.out.println(it2.next()+" ");
	              }
	                  
	                  
	              }
		
		
		ArrayList<Integer> res= new ArrayList<Integer>();
		
		

		Iterator<Integer> tweetIt = tweetMap.keySet().iterator();
			  while (tweetIt.hasNext()) 
			{
				
				int tid = tweetIt.next();
				TreeSet<Integer> temp = tweetMap.get(tid);
				
				TreeSet<Integer> userFollowers = followerMap.get(targetUser);
				userFollowers.retainAll(temp);
				
				if(userFollowers.size()>=4)
				{
					res.add(tid);
				}
				
				
				
			}
			
		
		int[] result = new int[res.size()];
		
		for(int i=0;i<res.size();i++)
		{
			
			result[i]= res.get(i);
		}
		
		
		
		return result;

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
