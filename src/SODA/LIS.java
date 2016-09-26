/**
 * 
 */
package SODA;

import java.util.Scanner;

/**
 * @author Laxmikant
 *
 */


	/**
	 * @param args
	 */

public class LIS {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String ip="";
		ip= sc.nextLine();
		
		int n=Integer.parseInt(ip);
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++)
		{
			ip= sc.nextLine();
			
			int elem=Integer.parseInt(ip);
			arr[i]=elem;
		}
		int max=1;
		
		int l = arr.length;
		int[] L = new int[l];
		int current = 0;
		if (l == 1)
		{
			System.out.println("1");
		}
		else
		{
			for (int i = 0; i < l; i++) {
				L[i] = 1;
			}
		
		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < i; j++) {
				if ((arr[i] > arr[j]) && (L[i] < (L[j] + 1))) {
				//	System.out.println(""+ arr[j]+ "i "+ arr[i]+"..."+ L[i] );
					L[i] = L[j] + 1;
				}

			}
			if (max < L[i])
				max = L[i];

		}
			System.out.println(max);
		}
	}
	}

