/**
 * 
 */
package GoogleAmazon;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Laxmikant
 *
 */
public class RadixSort {

	/**
	 * @param args
	 */
	public static void countSort(int arr[], int n, int power)
	{
		int[] output = new int[n];
		
		int[] count = new int[10];
		Arrays.fill(count, 0);
		for(int i=0;i<arr.length;i++)
		{
			count[(arr[i]/power)%10]+=1;
		}
	
		for(int i=1;i<10;i++)
		{
			count[i]+=count[i-1];
			//System.out.println("Count :" +i+" : " +count[i]);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			output[ count[(arr[i]/power)%10 ] - 1  ]=arr[i];
			count[(arr[i]/power)%10]--;
		}
		
		// store again in original array
		for(int i=0;i<n;i++)
		{
			arr[i]=output[i];
		//	System.out.println("countSort : "+power+" :" +arr[i]);
		}
		
	}
	
	
	
	public static int getMaxDigits(int n) {
		
		int count=0;
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
		
		
	}
	public static int  getMaxNum(int arr[])
	{
		int mx = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {170, 45, 75, 90, 802, 24, 2, 66};
		int n=arr.length;
		
		int m=getMaxNum(arr);
		for(int i=1;m/i>0;i*=10)
		{
			
			countSort(arr,n, i );
		}
		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		
		
	}



	
}
