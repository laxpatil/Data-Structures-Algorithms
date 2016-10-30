/**
 * 
 */
package Hackerrank_Walmart;

import java.util.Scanner;

/**
 * @author Laxmikant
 *
 */
public class HackingSelfies {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int x= sc.nextInt();
		
		double d= Math.pow((double)2 , (double)(n) ) - 1 ;
		
		if((double)x>=d)
		{
			System.out.println((int)((double)x-d));
		}
		else
		{
			System.out.println((int)(d-(double)x));
		}
		
		
		
		
	}

}
