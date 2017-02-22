/**
 * 
 */
package Amazon;

//import java.util.Collections;
//import java.util.PriorityQueue;
import java.util.*;
/**
 * @author Laxmikant
 *
 */
public class MaxHeap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int arr[] = {2,5,91,3,7,99,1,4};
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(3, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return (int) (o2.intValue()-o1.intValue());
			}
		});
		int k = 3, i=0;
		while(k!=0){
			pq.offer(arr[i]);
			k--;
			i++;
		}
		
		for(;i<arr.length;i++){
			if(pq.peek()>arr[i])
			{
			  System.out.println("Removed: "+pq.remove());
			}
			System.out.println("Added: "+arr[i]);
			pq.offer(arr[i]);
		}
		
		System.out.println(pq.peek());
		
	}

}
