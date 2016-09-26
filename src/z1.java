import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class z1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		// your code goes here
		System.out.println("n :" + n);
		int[] a = new int[n + 1];
		a[0] = 0;
		a[1] = 1;
		int[] coin = { 1, 2, 5, 10, 20, 50, 100 };
		for (int i = 2; i <= n; i++) {
			
			
			System.out.println("i :" + i);
			int count = 0;
			int j=-1;
			for (int p=1;p<coin.length;p++)
			{
				if(a[i]<a[p])
					break;
			}
			for (int k=0;k<coin.length;k++)
			{
				if(i==coin[k])
					count++;
			}
			
			if(j!=0)
			a[i] = a[coin[j]] + a[i-coin[j]];
			else
				a[i]=a[i-1];
			
			a[i]+=count;
			System.out.println("--" + a[i]);
		}
		//System.out.println(a[n]);

	}
}
