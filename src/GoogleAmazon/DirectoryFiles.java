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
public class DirectoryFiles {

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
		int totalLength=0;
		for(int i=0;i<paths.length;i++)
		{
			System.out.println("string="+paths[i]);
			int spaces=0;
			
			spaces= paths[i].length()- paths[i].trim().length();
			
			System.out.println("spaces="+spaces);
			
			if(spaces==0)
			{
				if(paths[i].trim().contains(".jpeg") || 
					//	paths[i].trim().contains(".txt") ||
							paths[i].trim().contains(".gif") )
				{
					
					String finalstr="/"+paths[i].trim();
					
					totalLength+=finalstr.length();
					System.out.println("finalstr="+finalstr);
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
							// paths[i].trim().contains(".txt") ||
								paths[i].trim().contains(".gif") )
					{
						String finalstr= top+"/"+paths[i].trim();
						
						totalLength+=finalstr.length();
						System.out.println("finalstr="+finalstr);
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
						System.out.println("count="+count+": spaces="+spaces);
						String top= pathStack.peek();
						
						if(paths[i].trim().contains(".jpeg") || 
								// paths[i].trim().contains(".txt") ||
									paths[i].trim().contains(".gif") )
						{
							String finalstr= top+"/"+paths[i].trim();
							
							totalLength+=finalstr.length();
							System.out.println("finalstr="+finalstr);
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
		
		return totalLength;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
		
		//String input="dir1\ni.jpeg";
		System.out.println("Length:"+getTotalLength(input));
		
	}

}
