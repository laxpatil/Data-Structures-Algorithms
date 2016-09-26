import java.util.Scanner;


public class alien {
	static int GlobalMin=Integer.MAX_VALUE;
	
	public static void UpLeft(char[][] m, int i, int j)
	{
		int count=2;
		int q=0;
		int col=j;
		int var=0;
		int max=1;
		for(int k=i;k>=0;k--)  /// row
		{
			
			while(var<count && col-var>=0 && m[k][col-var] =='#')
			{
				var++;
			}
			max=var;
		
			if(var!=count)
			{
				
				break;
			}
				
			count++;
			var=0;
		}
		
		if(GlobalMin>max)
		{
			GlobalMin=max; //globalmin updated break //FOUND
			
		}
		
	}
	
	public static void UpRight(char[][] m, int i, int j)
	{
		int count=2;
		int q=0;
		int col=j;
		int var=0;
		int max=1;
		for(int k=i;k>=0;k--)  //row
		{
			
			while(var<count && col+var<m[0].length && m[k][col+var] =='#')
			{
				var++;
			}
			max=var;
			
			if(var!=count)
			{
				
				break;
			}
				
			count++;
			var=0;
		}
		if(GlobalMin>max)
		{
			GlobalMin=max; //globalmin updated break //FOUND
			
		}
		
	}
	
	
	public static void LeftUp(char[][] m, int i, int j)
	{
		int count=2;
		int q=0;
		int col=j;
		int row=i;
		int var=0;
		int max=1;
		for(int k=j;k>=0;k--)  //column
		{
			
			while(var<count && row-var>=0 && m[row-var][k] =='#')
			{
				var++;
			}
			max=var;
			
			if(var!=count)
			{
				
				break;
			}
				
			count++;
			var=0;
		}
		
		if(GlobalMin>max)
		{
			GlobalMin=max; //globalmin updated break //FOUND
			
		}
	}
	
	
	public static void RightUp(char[][] m, int i, int j)
	{
		int count=2;
		int q=0;
		int col=j;
		int row=i;
		int var=0;
		int max=1;
		for(int k=j;k<m[0].length;k++)  //column
		{
			
			while(var<count && row-var>=0 && m[row-var][k] =='#')
			{
				var++;
			}
			max=var;
			
			if(var!=count)
			{
				
				break;
			}
				
			count++;
			var=0;
		}
		
		
		if(GlobalMin>max)
		{
			GlobalMin=max; //globalmin updated break //FOUND
			
		}
	}
	
	
	public static void LeftDown(char[][] m, int i, int j)
	{
		int count=2;
		int q=0;
		int col=j;
		int row=i;
		int var=0;
		int max=1;
		for(int k=j;k>=0;k--)  //column
		{
			
			while(var<count && row+var<m.length && m[row+var][k] =='#')
			{
				var++;
			}
			max=var;
			
			if(var!=count)
			{
				
				break;
			}
				
			count++;
			var=0;
		}
		if(GlobalMin>max)
		{
			GlobalMin=max; //globalmin updated break //FOUND
			
		}
		
	}
	
	public static void RightDown(char[][] m, int i, int j)
	{
		int count=2;
		int q=0;
		int col=j;
		int row=i;
		int var=0;
		int max=1;
		for(int k=j;k<m[0].length;k++)  //column
		{
			
			
			
			while(var<count && row+var<m.length && m[row+var][k] =='#')
			{
				var++;
			}
			max=var;
			
			if(var!=count)
			{
				
				break;
			}
				
			count++;
			var=0;
		}
		if(GlobalMin>max)
		{
			GlobalMin=max; //globalmin updated break //FOUND
			
		}
		
	}
	
	public static void DownLeft(char[][] m, int i, int j)
	{
		int count=2;
		int q=0;
		int col=j;
		int row=i;
		int var=0;
		int max=1;
		for(int k=i;k<m.length;k++)  //row down
		{
			
			while(var<count && col-var>=0 && m[k][col-var] =='#')
			{
				var++;
			}
			max=var;
			
			if(var!=count)
			{
				
				break;
			}
				
			count++;
			var=0;
		}
		if(GlobalMin>max)
		{
			GlobalMin=max; //globalmin updated break //FOUND
			
		}
	}
	
	public static void DownRight(char[][] m, int i, int j)
	{
		int count=2;
		int q=0;
		int col=j;
		int row=i;
		int var=0;
		int max=1;
		for(int k=i;k<m.length;k++)  //column
		{
			System.out.println("1 -- "+k+" :  "+(col+var));  
			while(var<count && col+var<m[0].length && m[k][col+var] =='#')
			{
				System.out.println(" 2 --collvar "+ (col+var)+ "  k: "+k );
				var++;
			}
			max=var;
			
			if(var!=count)
			{
				
				break;
			}
				
			count++;
			var=0;
		}
		
		if(GlobalMin>max)
		{
			GlobalMin=max; //globalmin updated break //FOUND
			
		}
		
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String[] input=sc.nextLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		 char[][] mat=new char[N][M];
		for(int i=0;i<N;i++)
		{
			String temp = sc.nextLine();
			
			
			for(int j=0;j<M;j++)
			{
				mat[i][j]=temp.toCharArray()[j];
			}
			
		}
		
		///------start traverse----
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				
				if(mat[i][j]=='#')
				{
				
					if(i>0  && mat[i-1][j]=='#')
					{
					UpLeft(mat,i-1,j);
				    UpRight(mat,i-1,j);
				    System.out.println(": ---------- : "+GlobalMin);
					}
				
				
				if(j-1>0 && mat[i][j-1]=='#')
				{
				LeftUp(mat,i,j-1);
				LeftDown(mat,i,j-1);
				}
				if(j+1 <M && mat[i][j+1]=='#')
				{
				RightUp(mat,i,j+1);
				
				RightDown(mat,i,j+1);
				}
				if(i+1<N && mat[i+1][j]=='#')
				{
				DownLeft(mat,i+1,j);
				DownRight(mat,i+1,j);
				}
			}
			}
			
		}
		System.out.println("-----------------------GlobalMin=-------" + GlobalMin);
		
		
		
		
}
}
