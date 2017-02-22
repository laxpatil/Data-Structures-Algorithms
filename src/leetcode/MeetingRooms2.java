/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Laxmikant
 *
 */

 class Interval
{
	int start;
	int end;
	
	Interval(int start, int end)
	{
		this.start=start;
		this.end=end;
	}
}

public class MeetingRooms2 {

	/**
	 * @param args
	 */
	
	public int minMeetingRooms(Interval[] intervals)
	{
		
		if(intervals==null || intervals.length==0)
		{
			return 0;	
		}
		
		Arrays.sort(intervals, new Comparator<Interval>(){
			
			public int compare(Interval i1,Interval i2)
			{
				return i1.start-i2.start;
			} 
		});
		
		
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		q.offer(intervals[0].end);
		int count=1;
		
		for(int j=1;j<intervals.length;j++)
		{
			if(!q.isEmpty() && intervals[j].start < q.peek())
			{
				count++;
			}
			else
			{
				q.poll();
			}
			
			q.offer(intervals[j].end);
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
