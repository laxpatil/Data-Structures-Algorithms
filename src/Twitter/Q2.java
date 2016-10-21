package Twitter;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class Q2 {

	public static void main(String args[] ) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("ENTER");
		String interval = sc.nextLine();
		
		String d1= interval.split(",")[0].trim();
		String d2= interval.split(",")[1].trim();
		
		String c1= d1.split("-")[0].trim()+"-"+d1.split("-")[1].trim();
		String c2= d2.split("-")[0].trim()+"-"+d2.split("-")[1].trim();
		
		
	//	System.out.println("Blank Line");
		String nullLine = sc.nextLine();
		
		//System.out.println("Noew Enter data:");
	
		String line="";
		
		TreeMap<String, TreeMap<String,Integer>> totalMap = new TreeMap <String, TreeMap<String,Integer>>(Collections.reverseOrder());
		while(sc.hasNextLine())
		{
			line=sc.nextLine();
			if(line.equals(""))
			{
				break;
			}
			//System.out.println("input="+line);
			
			String fullDate= line.split(",")[0];
			
			String yyyyMM= fullDate.split("-")[0]+"-"+ fullDate.split("-")[1];
			
			
			
			String category= line.split(",")[1].trim();
			
			int data=  Integer.parseInt(line.split(",")[2].trim());
			
			if(data==0)
			{
				continue;
			}
			
			if(totalMap.containsKey(yyyyMM))
			{
				
				TreeMap<String,Integer> innerMap= totalMap.get(yyyyMM);
				
				if(innerMap.containsKey(category))
				{
					int newVal=  innerMap.get(category) + data;
					innerMap.put(category,newVal);
				}
				else
				{
					innerMap.put(category,data);
				}
				
				totalMap.put(yyyyMM, innerMap);
				
			}
			else
			{
				TreeMap<String,Integer> innerMap= new TreeMap<String,Integer>();
				innerMap.put(category,data);
				totalMap.put(yyyyMM, innerMap);
				
			}
			
			
		}
		
		
		
		for (Entry<String, TreeMap<String, Integer>> entry : totalMap.entrySet()) {
			
			
			String d= entry.getKey();
			String catString="";
			 TreeMap<String, Integer> innerMap=  totalMap.get(d);
			 int count=0;
			for (Entry<String, Integer> innerEntry : innerMap.entrySet())
			{
				if(count==0)
				{
					catString+=innerEntry.getKey()+ ", "+ innerEntry.getValue();
				}
				else
				{
					catString+=", "+ innerEntry.getKey()+ ", "+ innerEntry.getValue();
				}
				
				count++;
				
			}
			
			if(d.compareTo(c1)>=0 && d.compareTo(c2)<=0)
			{
				System.out.println(d+", "+catString);
			}
			
			
			
		    
		}
		
	
		
			
	}

}
