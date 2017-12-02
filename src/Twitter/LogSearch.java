/**
 * 
 */
package Twitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Laxmikant
 *
 */
public class LogSearch {

	/**
	 * @param args
	 */
	
	  

	public Collection<String> search(Collection<String> logLines, Locale startDate, Locale endDate) {

			  	Collection<String> result = new ArrayList<String>();
			  	
			  	int flag=0;
	    
	    
			  	
			for(String logLine: logLines)
			{
				
				
				
				
				
				 String pattern = "^((([0-9][0-9][0-9][0-9])[-]([0][1-9]|[1][1-2])[-]([0-2][0-9]|[3][0-1]))(T)(([0-1][0-9]|(2)[0-3])(:)[0-5][0-9](:)[0-5][0-9])(Z))";

			      // Create a Pattern object
			      Pattern r = Pattern.compile(pattern);

			      // Now create matcher object.
			      Matcher m = r.matcher(logLine);
				
				if(m.find())
				{
	                
					String logTime= m.group(7);
					
	               // System.out.println(logTime+"     "+startDate.toString()+"    "+endDate.toString());
	                
	                int c1=logTime.compareTo(startDate.toString());
	                int c2=logTime.compareTo(endDate.toString());
	               // System.out.println(c1 +" "+c2);
	                
					if(c1>=0 && c2<0 )
	                    {
	                    
	                        result.add(logLine);
	                        flag=1;
	                }
	                else
	                    {
	                    flag=0;
	                }
				}
	            else
	                {
	                
	                    if(flag==1)
	                    {
	                         result.add(logLine);
	                     }
	                 }
				
			}
			  
		        return result;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
