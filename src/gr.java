import java.util.HashMap;


public class gr {

	public static void isPanagram(String s) {
		// TODO Auto-generated method stub

		
		HashMap<Character, Integer> m= new HashMap<Character, Integer>();
		char[] a=s.toCharArray();
		int[] p=new int[26];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int val=a[i]-'a';
			p[val]=1;
			count++;
			
		}
		
		if(count==26)
		{
			System.out.print("1");
		}
		
		
	}

}
