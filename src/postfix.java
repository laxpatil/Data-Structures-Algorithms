/**
 * 
 */


import java.util.Scanner;
import java.util.Stack;

/**
 * @author laxmikant
 *
 */
public class postfix {

	/**
	 * @param args
	 */
	
	public static int solution(String s)
	{
		
		Stack<Integer> stack= new Stack<Integer>();
		if(s.length()>2000000)
			return -1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9' )
			{
				int dig= Integer.parseInt(s.charAt(i)+"");
			//	System.out.println("Stack push : "+dig);
				stack.push(dig);
				
			}
			else if(s.charAt(i)=='*')
			{
				if(stack.isEmpty())
					return -1;
				int n1=stack.pop();
				//System.out.println("Stack pop : "+n1);
				if(stack.isEmpty())
					return -1;
				
				
				
				int n2=stack.pop();
				//System.out.println("Stack pop : "+n2);
				
				long multi= (long)n1 * n2;
				if((multi>>12) > 0)
					return -1;
				stack.push(n1*n2);
			}
			else if(s.charAt(i)=='+')
			{
				if(stack.isEmpty())
					return -1;
				int n1=stack.pop();
			//	System.out.println("Stack pop : "+n1);
				
				if(stack.isEmpty())
					return -1;
				
				int n2=stack.pop();
			//	System.out.println("Stack pop : "+n2);
				int sum=n1+n2;
				
				if((sum>>12) > 0)
					return -1;
				stack.push(n1+n2);
			}
			else
				return -1;
			
			
		}
		if(!stack.isEmpty())
		{
			if(stack.isEmpty())
				return -1;
			int res=stack.pop();
			//System.out.println("Stack pop : "+res);
			
			if(!stack.isEmpty())
				return -1;
			
			return res;
		}
		
		return -1;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exp="11+";
		
		int res=solution(exp);
		System.out.println("----- Result : "+res);
	}

}
