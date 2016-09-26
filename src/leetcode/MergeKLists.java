/**
 * 
 */
package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Laxmikant
 *
 */
public class MergeKLists {

	/**
	 * @param args
	 */
	
	
	class ListContainer implements Comparable<ListContainer>{
		int ListIndex;
		ListNode head;
		public ListContainer(int ListIndex, ListNode head)
		{
			this.ListIndex=ListIndex;
			this.head=head;
		}
		
		
		@Override
		public int compareTo(ListContainer o) {
			// TODO Auto-generated method stub
			if(this.head.val < o.head.val)
				return -1;
			else if(this.head.val > o.head.val)
			{
				return 1;
			}
			else 
				return 0;
		}
		
	}
	
	public ListNode mergeKLists(ListNode[] lists) {
        
		ListNode result=null;;
        int k= lists.length;
        
       PriorityQueue<ListContainer> pq = new PriorityQueue<ListContainer>();
      
       int total=0;
       
       //initial adding to Queue
       for(int i=0;i<k;i++)
       {
           if(lists[i]!=null)
    	   {
    	     //  System.out.println("Adding to Q: "+lists[i].val);
    	       pq.add(new ListContainer(i,lists[i]));
    	       lists[i]=lists[i].next;
    	   }
       }
       
       // add to final sorted list
       
       ListNode current=null;
       while(!pq.isEmpty())
       {
    	   ListContainer temp=pq.poll();
    	   // System.out.println("Removed from Q "+temp.head.val);
    	   if(result==null)
    	   {
    	     //  System.out.println("Adding to result: "+temp.head.val);
    		   result=temp.head;
    		   current=result;
    		   
    	   }
    	   else
    	   {
    	     //  System.out.println("Adding to result: "+temp.head.val);
    		   current.next=temp.head;
    		   current=current.next;
    	   }
    	   
    	   if(lists[temp.ListIndex]!=null)
    	   {
    	      // System.out.println("Adding to Q: "+lists[temp.ListIndex].val);
    		   pq.add(new ListContainer(temp.ListIndex, lists[temp.ListIndex]));
    		   lists[temp.ListIndex]=lists[temp.ListIndex].next;
    	   }
    	   
       }
        
       
       return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
