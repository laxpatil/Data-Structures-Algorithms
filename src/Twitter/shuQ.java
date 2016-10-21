/**
 * 
 */
package Twitter;

/**
 * @author Laxmikant
 *
 */

import java.util.*;

class Date implements Comparable<Date>, Comparator<Date>{
	int year;
	int month;
	String category;
	String data;
	
	Date(){}
	
	Date(String line){
		if(line.length()!=7){
			String date = line.split(",")[0].trim();
			this.year = Integer.parseInt(date.split("-")[0]);
			this.month = Integer.parseInt(date.split("-")[1]);
			
			this.category = line.split(",")[1].trim();
			this.data = line.split(",")[2].trim();
		}
		else if(line.length()==7){
			this.year = Integer.parseInt(line.split("-")[0]);
			this.month = Integer.parseInt(line.split("-")[1]);
		}
	}

	@Override
	public int compareTo(Date o) {
		if(this.year > o.year)
			return -1;
		else if(this.year < o.year)
			return 1;
		else if(this.month > o.month)
			return -1;
		else if(this.month < o.month)
			return 1;
		else
			return 0;
	}

	@Override
	public int compare(Date o1, Date o2) {
		return o1.compareTo(o2);
	}
	
	@Override
	public String toString(){
		return year +"-" + month+ ", " + category+ ", " + data;
	}
}
public class shuQ {

	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		// start and end dates
		Date startDate = new Date(line.split(",")[0].trim());
		Date endDate = new Date(line.split(",")[1].trim());
		
		sc.nextLine(); // skip one line
		
		ArrayList<Date> arr = new ArrayList<>();
		while(!(line = sc.nextLine()).equals("")){
			if(Integer.parseInt(line.split(",")[2].trim())!=0) // skip the 0 data
				arr.add(new Date(line));
		}
		
		for(int i=0;i<arr.size();i++){ // add data within the interval
			if(!(arr.get(i).compareTo(startDate)<=0 && arr.get(i).compareTo(endDate)>0)){
				arr.remove(i);
				i--;
			}
		}
		
		Collections.sort(arr, new Comparator<Date>() {

			@Override
			public int compare(Date o1, Date o2) {
				if(o1.year > o2.year)
					return -1;
				else if(o1.year < o2.year)
					return 1;
				else if(o1.month > o2.month)
					return -1;
				else if(o1.month < o2.month)
					return 1;
				else
					return o1.category.toLowerCase().compareTo(o2.category.toLowerCase());
			}
			
		});
		
		
		String output = "";
		output += fixMonth(arr.get(0))+"\n";
		Date prev = arr.get(0);
		
		for(int i=1;i<arr.size();i++){
			if(arr.get(i).compareTo(prev)!=0){
				output+=fixMonth(arr.get(i))+"\n";
				prev = arr.get(i);
			}
			else{
				output=output.substring(0, output.length()-1); // remove \n
				output+=", "+arr.get(i).category+", "+arr.get(i).data + "\n";
				prev = arr.get(i);
			}
		}
		
		System.out.println(output);
		
	}

	private static String fixMonth(Date date) {
		if(((int)date.month/10) == 0){
			return date.year+"-0"+date.month+", "+date.category+", "+date.data;
		}
		else
			return date.year+"-"+date.month+", "+date.category+", "+date.data;
			
	}

}
