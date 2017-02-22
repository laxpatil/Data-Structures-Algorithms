/**
 * 
 */
package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Laxmikant
 *
 */
public class DecodeString {

	/**
	 * @param args
	 */

	public static String decodeString(String s) {
		
		Stack<String> mainStack = new Stack<String>();
		Stack<Integer> digitStack = new Stack<Integer>();

		String result = "";

		String dig = "";

		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			// System.out.println("c: "+c+"");
			if (c >= '0' && c <= '9') {
				dig += c + "";
				// digitStack.push(Integer.parseInt(""+dig));

			} else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				// System.out.println("mainstack "+c+"");
				mainStack.push(c + "");

			} else if (c == '[') {
				digitStack.push(Integer.parseInt("" + dig));
				// System.out.println("----Pushing Digit "+ dig);

				dig = "";
				//System.out.println("mainstack " + c + "");
				mainStack.push(c + "");
			} else if (c == ']') {
				//System.out.println("Now Popping");

				String strToPrint = "";
				//System.out.println("peek: " + mainStack.peek());

				while (!mainStack.peek().equals('[' + "")) {

					strToPrint = mainStack.pop() + strToPrint;

				}
				//System.out.println("Popped: " + strToPrint);

				if (mainStack.peek().equals('[' + "")) {
					mainStack.pop();
				}

				String temp = "";

				if (!digitStack.isEmpty()) {
					int digit = digitStack.pop();
					//System.out.println("Popped Digit " + digit);
					//System.out.println("No multiplying " + strToPrint + " by " + digit);
					for (int m = 0; m < digit; m++) {
						temp = temp + strToPrint;

					}
				}

				//System.out.println("Pushing on main Stack : " + temp);
				mainStack.push(temp);

			}

		}

		while (!mainStack.isEmpty()) {
			result = mainStack.pop() + result;
		}

		//System.out.println("REsult: " + result);

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String r = "2[20[bc]31[xy]]xd4[rt]";

		System.out.println(decodeString(r));

	}

}
