/**
 * 
 */
package GoogleAmazon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Laxmikant
 *
 */
public class LongestPathFile {

	/**
	 * @param args
	 */
	
	public static int getTotalLength(String pathStr)
	{
	
		String[] paths=pathStr.split("\n");
	
		
		
		if(paths.length==0)
			return 0;

		Stack<String> pathStack= new Stack<String>();
		int count=0;
		int maxLen=0;
		for(int i=0;i<paths.length;i++)
		{
			System.out.println("string="+paths[i]);
			int spaces=0;
			
			spaces= paths[i].length()- paths[i].trim().length();
			
		//	System.out.println("spaces="+spaces);
			//
			if(spaces==0)
			{
				if(paths[i].trim().contains(".jpeg") || 
						paths[i].trim().contains(".png") ||
							paths[i].trim().contains(".gif") )
				{
					
					String finalstr="/";
					
					if(maxLen<finalstr.length())
					{
						maxLen=finalstr.length();
					}
					System.out.println("finalstr="+finalstr+" maxlen="+maxLen);
				}
				else
				{
				
						while(!pathStack.empty())
						{
							pathStack.pop();
						}
						pathStack.push("/"+paths[i].trim());
						count=0;
				}		
				
				
			}
			else
			{
				if(spaces<=count)
				{
					
					while(spaces<=count)
					{
						pathStack.pop();
						count--;
						
					}
					String top= pathStack.peek();
					
					if(paths[i].trim().contains(".jpeg") || 
							 paths[i].trim().contains(".png") ||
								paths[i].trim().contains(".gif") )
					{
						String finalstr= top;
						
						if(maxLen<finalstr.length())
						{
							maxLen=finalstr.length();
						}
						System.out.println("finalstr="+finalstr+" maxlen="+maxLen);
					}
					else
					{
						pathStack.push(top+"/"+paths[i].trim());
						count++;
					}
					
					
				}
				else
				{
					if(spaces==count+1)
					{
					//	System.out.println("count="+count+": spaces="+spaces);
						String top= pathStack.peek();
						
						if(paths[i].trim().contains(".jpeg") || 
								 paths[i].trim().contains(".png") ||
									paths[i].trim().contains(".gif") )
						{
							String finalstr= top;
							
							if(maxLen<finalstr.length())
							{
								maxLen=finalstr.length();
							}
							System.out.println("finalstr="+finalstr+" maxlen="+maxLen);
						}
						else
						{
							
							pathStack.push(top+"/"+paths[i].trim());
							count++;
						}
					}
					
				}
			}
			
			
			
		}
		
		return maxLen;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String input="dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif\nlax.png";
		
		String input="dir1\n f.txt\n f2.jpeg\nf.png";
		System.out.println("Length:"+getTotalLength(input));
		
	}

}
