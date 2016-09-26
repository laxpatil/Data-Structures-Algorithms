import java.util.Scanner;


public class inv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.nextLine());
    	
    	int[] arr=new int[n];
    	int[] inv=new int[n];
    	int index=0;
    	int lar=Integer.MAX_VALUE;
    	int big_inv=Integer.MIN_VALUE;
    	int largest_num=Integer.MIN_VALUE;
    	String[] word =	sc.nextLine().split(" ");
    	
    	for(int i=0; i<word.length;i++)
    	{
    		arr[i]=Integer.parseInt(word[i]);
    		for (int j=0;j<i;j++)
    		{
    			if(arr[i]< arr[j])
    				inv[i]=inv[i]+1;
    		}
    		
    		if(inv[i]>big_inv)
    		{
    			big_inv=inv[i];
    			index=i;
    			if(lar>arr[i])
    				lar=arr[i];
    		}
    		if(largest_num<arr[i])
    			largest_num=i;
    		
    		
    	}
    	System.out.println(index+":: " +inv[index]);
    	System.out.println(((index+1) - inv[index] +1 )+" "+ (index+1));
		
	}

}
