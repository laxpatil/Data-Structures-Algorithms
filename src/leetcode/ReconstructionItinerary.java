/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Laxmikant
 *
 */
public class ReconstructionItinerary {

    HashMap<String , PriorityQueue<String>> airports =  new HashMap<String , PriorityQueue<String>>();
    
    LinkedList<String> result = new LinkedList<String>();
    
    public List<String> findItinerary(String[][] tickets) {
        
        for(int i=0;i<tickets.length;i++)
        {
            if(!airports.containsKey(tickets[i][0]))
            {
                PriorityQueue<String> nextAirports = new PriorityQueue<String>();
                
                nextAirports.add(tickets[i][1]);
                
                airports.put(tickets[i][0], nextAirports);
                
            }
            else
            {
                airports.get(tickets[i][0]).add(tickets[i][1]);
            }
            
            
        }
        
        // start DFS
        startDFS("JFK");
        
        return result;
        
    }
    
    
    public void startDFS(String port)
    {
        PriorityQueue<String> tempPorts= airports.get(port);
        
        while(tempPorts!=null && !tempPorts.isEmpty())
        {
            startDFS(tempPorts.poll());
            
        }
        
       // System.out.println(port);
        result.addFirst(port);
        
        
    }
}
