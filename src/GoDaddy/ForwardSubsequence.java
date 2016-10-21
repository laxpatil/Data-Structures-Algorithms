/**
 * 
 */
package GoDaddy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author Laxmikant
 * Godaddy
 *
 */
public class ForwardSubsequence {

	/**
	 * @param args
	 */
	
	public static void subSeqWords(String str) {
		HashSet<String> list = new HashSet<String>();

		for (int i = str.length() - 1; i >= 0; i--) {

			HashSet<String> tempList = new HashSet<String>();

			for (String t : list) {
				// System.out.println(":"+t);
				tempList.add(str.charAt(i) + t);
			}
			tempList.add(str.charAt(i) + "");

			list.addAll(tempList);
			// System.out.println("size : "+list.size());
		}
		
		
	
		TreeSet myTreeSet = new TreeSet();
		myTreeSet.addAll(list);
		System.out.println(myTreeSet);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subSeqWords("abc");
	}

}
