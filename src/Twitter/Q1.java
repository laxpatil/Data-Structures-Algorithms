/**
 * 
 */
package Twitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Laxmikant
 *
 */

class DateComparator implements Comparator<DateTwitter>
{

	@Override
	public int compare(DateTwitter o1, DateTwitter o2) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if(o1.ym.compareTo(o2.ym)<0)  // descending
				{
					return 1;
				}
				else if(o1.ym.compareTo(o2.ym)>0)  // descending
				{
					return -1;
				}
				else
				{
					return o1.category.compareTo(o2.category) ;
						
				}
	}
	
}

class DateTwitter {
	
	String ym;
	String category;
	int data;
	
	DateTwitter(String dateString)
	{
		String d= dateString.split(",")[0];
		
		this.ym= d.split("-")[0]+"-"+d.split("-")[1];
		this.category= dateString.split(",")[1].trim();
		this.data= Integer.parseInt(dateString.split(",")[2].trim());
		
		
	}


	
	
	
	
	
}

public class Q1 {

	/**
	 * @param args
	 */
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		ArrayList<DateTwitter> dArray = new ArrayList<DateTwitter>();
		String line="";
		while(sc.hasNextLine())
		{
			line=sc.nextLine();
			if(line.equals(""))
			{
				break;
			}
			//System.out.println("input="+line);
			
			if(line.split(",").length<=2 
					|| line.split(",")[2].trim().equals("") 
					|| Integer.parseInt(line.split(",")[2].trim())==0 )
				continue;
			
			dArray.add(new DateTwitter(line));
		}
		
		DateTwitter[] newArray = new DateTwitter[dArray.size()];
		newArray = dArray.toArray(newArray);
		
		
		Arrays.sort(newArray, new DateComparator());;
		
		for(int i=0;i<newArray.length;i++)
		{
			System.out.println("--"+newArray[i].ym +" : "+newArray[i].category+" "+ newArray[i].data);
		}
		
		TreeMap<String, String> dateHash = new TreeMap<String, String>(Collections.reverseOrder());
		
		for(int i=0;i<newArray.length;i++)
		{
			String tempD = newArray[i].ym;
			
			String dateKey= tempD.split("-")[0].trim()+"-"+tempD.split("-")[1].trim();
			if(dateHash.containsKey(dateKey))
			{
				String val= dateHash.get(dateKey);
				
				dateHash.put(dateKey, val+", "+newArray[i].category+", "+newArray[i].data);
			}
			else
			{
				dateHash.put(dateKey, newArray[i].category+", "+newArray[i].data);
			}
		}
		
		for (Map.Entry<String, String> entry : dateHash.entrySet()) {
			
			//System.out.println(entry.getKey()+":"+c1+" ="+entry.getKey().compareTo(c1));
			//System.out.println(entry.getKey()+":"+c2+" ="+entry.getKey().compareTo(c2));
			
			String dateKey= entry.getKey().split("-")[0].trim()+"-"+entry.getKey().split("-")[1].trim();
			if(dateKey.compareTo(c1)>=0 && dateKey.compareTo(c2)<=0)
			{
				System.out.println(dateKey+", " + entry.getValue());
				
			}
		    
		}
	}

}
