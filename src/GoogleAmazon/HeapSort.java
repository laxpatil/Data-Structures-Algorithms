/**
 * 
 */
package GoogleAmazon;

/**
 * @author Laxmikant
 *
 */
public class HeapSort {

	/**
	 * @param args 
	 * 
	 * 
	 * Array based HEAP implementation
	 */
	
	
	public static void swap(int[] arr, int i, int j )
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void maxHeap(int[] arr, int i, int n)
	{
		
		int left= i*2 +1 ;
		int right = i*2+2;
		int max=i;
		if(left<n &&  arr[left]>arr[i])
		{
			max=left;
		}
		if(right<n &&  arr[right]>arr[max])
		{
			max=right;
		}
		//System.out.println("index "+i+" max :"+ max);
		if(max!= i)
		{
			
			swap(arr,max,i);
			maxHeap(arr, max, n);
		}
	}
	
	
	public static void heapify(int[] arr , int n)
	{
		
		for(int i=n/2;i>=0;i--)
		{
			maxHeap(arr,i, n);
		}
			
	}
	
	public static void heapSort(int[] arr, int n)
	{
		heapify(arr, n);
		//System.out.print(" "+ arr[0]);

		int k = n;
		for(int i=0;i<k;i++)
		{
			swap(arr,0,n-1);
			System.out.print(" "+ arr[n-1]);
			n=n-1;
			maxHeap(arr, 0, n);	
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {170, 45, 75, 90, 802, 24, 2, 66};
		heapSort(arr,arr.length);
		
		
		//for(int i=0;i<arr.length;i++)
		//	System.out.print(" "+ arr[i]);
		
	}

}
