/**
 * 
 */
package GoogleAmazon;

/**
 * @author Laxmikant
 *
 */
public class ConsecutiveDigits {

	/**
	 * @param args
	 */
	
	public static int maxNumber(int X)
	{
		if(X<10)
			return 0;
		
		String number= Integer.toString(X);
		String outNumber="";
		int max=Integer.MIN_VALUE;
		for(int i=0;i<number.length()-1;i++)
		{
			int n1= Integer.parseInt(number.charAt(i)+"");
			int n2= Integer.parseInt(number.charAt(i+1)+"");
			
			double avg = (double)(n1 + n2)/2;
			
			int avgDig= (int) Math.round(avg);
			
			System.out.println("avg "+avg+"  avgdig :"+avgDig);
			if(i+1==number.length()-1)
			{
				outNumber=number.substring(0,i)+avgDig;
			}
			else
			{
				outNumber=number.substring(0,i)+avgDig+number.substring(i+2);
			}
			
			System.out.println(outNumber);
			if(max<Integer.parseInt(outNumber))
			{
				max=Integer.parseInt(outNumber);
			}
			
		}
		
		
		return max;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("max  "+maxNumber(923456999));
		
		
	}

}
