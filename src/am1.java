import java.util.HashMap;
import java.util.Scanner;


public class am1 {

	
	
	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner(System.in);
       while(n<3)
			
		{
		 String input=sc.nextLine();
		 
		 char[] s=input.toCharArray();
		 if(s.length==0)
		 {
			 System.out.println("true");
			 continue;
		 }
		 int count1=0;
		 int count2=0;
		 HashMap<Character,Integer> m= new HashMap<Character,Integer>();
		 for(int i=0;i<s.length;i++)
		 {
			 
			
			 if(s[i]=='(')
			 {
				 count1++;
			 }
			 
			 if(s[i]=='{')
			 {
				 count2++;
			 }
			 if(s[i]==')' && count1>0 )
			 {
				 count1--;
			 }
			 
			 if(s[i]=='}' && count2>0)
			 {
				 count2--;
			 }
			 
			 
			 
		 }
		 
		 if(count1==0 && count2==0)
		 {
			 System.out.println("true");
			 
		 }
		 else
		 {
		 System.out.println("false");
		 }
		 n++; 
	}

	}
}
