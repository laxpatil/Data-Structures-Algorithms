/**
 * 
 */

/**
 * @author Laxmikant
 *
 */
public class zappos {

	/**
	 * @param args


	 */
	
	public static boolean isit(int x, int y, int X, int Y)
	{
		System.out.println("INSIDE FUNCTION x= "+x +" y="+y);
		if(x==X && y==Y)
		{
			System.out.println(" TRUE x= "+x +" y="+y);
			return true;
		}
		
		if(x>X || y> Y)
		{
			System.out.println(" FALSE x= "+x +" y="+y);
			return false;
		}
		
		if(isit(x+y,y, X, Y) || isit(x, x+y, X,Y))
		{
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isit(1,4,10,9));
	}

}
