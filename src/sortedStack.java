import java.util.Stack;


public class sortedStack {

	
	public static Stack<Integer> sort(Stack<Integer> s)
	{
		Stack <Integer> r=new Stack<Integer>();
		
		while(!s.empty())
		{
			int temp=(int) s.pop();
			
			while(!r.empty() && r.peek()>temp)
			{
				s.push(r.pop());
			}
			
			r.push(temp);
		}
		return r;
		
	}
	
	
	public static void main(String[] args)
	{
		
		Stack<Integer> s= new Stack<Integer> ();
		int i=0;
		while(i<10 )
		{
			s.push(i);
			i++;
		}
		
		
		Stack<Integer> p=new Stack<Integer>();
		p=sort(s);
		int j=91;
		while(!p.empty())
		{
			System.out.println(p.pop() + "::: num " + j);
			j++;
		}
		
		
		
		
	}
	
}
