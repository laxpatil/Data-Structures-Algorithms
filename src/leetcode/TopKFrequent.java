/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author lapatil
 *
 */

class Word{
	
	int count;
	String w;
	
	public Word(int count, String w) {
		this.count=count;
		this.w=w;
	}
}
public class TopKFrequent {

	/**
	 * @param args
	 */
	
public List<String> topKFrequent(String[] words, int k) {
	HashMap<String,Integer> map =  new HashMap<String,Integer>();
	
	
	for(int i=0;i<words.length;i++)
	{
		String word= words[i];
		if(map.containsKey(word)) {
			map.put(word,map.get(word)+1);	
		}
		else {
			map.put(word,1);
		}
	}
	
         PriorityQueue<Word> pq = new PriorityQueue<Word>(k,new Comparator<Word>() {
        	public int compare(Word o1, Word o2) {
        		// TODO Auto-generated method stub
        		if(o1.count==o2.count)
        		{
        			return (o2.w.compareTo(o1.w));
        		}
        		else
        		{
        			return o1.count-o2.count;
        		}
        	}
        });
        
        for (Map.Entry<String,Integer> entry: map.entrySet())
    	{
    		Word p = new Word(entry.getValue(),entry.getKey());
    		pq.offer(p);
            
            if(pq.size()>k)
    		{
    			pq.poll();
    		}
    		
    	}
        
        List<String> result = new ArrayList<String>();
        while(pq.size()>0){
            result.add(pq.poll().w);
        }
        
        Collections.reverse(result);
         
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
