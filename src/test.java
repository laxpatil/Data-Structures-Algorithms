import java.util.HashMap;
import java.util.LinkedList;

import javax.activation.MailcapCommandMap;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		
		m.put("lax",2);
		m.put("opr",4);
		
		for (String word : m.keySet())
		{
			System.out.println(word);
		}
		
		
	}

}
