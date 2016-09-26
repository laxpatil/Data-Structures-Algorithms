import java.util.Scanner;


public class queenMN {

	  public static int count=0; 
/*
public static void printSolution(char[][]board)
{
	
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
            printf(" %d ", board[i][j]);
        printf("\n");
    }
}
 */
/* A utility function to check if a queen can be placed on board[row][col]
   Note that this function is called when "col" queens are already placeed
   in columns from 0 to col -1. So we need to check only left side for
   attacking queens */
public static boolean iSafe(char[][] board, int row, int col)
{
    int i, j;
    int N=board.length;
    int M=board[0].length;
 
    
    /* Check this row on left side */
    for (i = 0; i < col; i++)
    {
        if (board[row][i]=='1')
            return false;
    }
 
    /* Check upper diagonal on left side */
    for (i = row, j = col; i >= 0 && j >=0; i--, j--)
    {
        if (board[i][j]=='1')
            return false;
    }
 
    /* Check upper diagonal on right side */
    for (i = row, j = col; i>=0 && j < M; i--, j++)
    {
        if (board[i][j]=='1')
            return false;
    }
    //lower left
    for (i = row, j = col; i<=N && j >=0; i++, j--)
    {
        if (board[i][j]=='1')
            return false;
    }
 
    return true;
}
 
/* A recursive utility function to solve N Queen problem */
public static void solveNQUtil(char[][] board, int row, int col)
{

	 int N=board.length;
	    int M=board[0].length;
    /* base case: If all queens are placed then return true */
    if (row >= N)
    {
    	count++;
       return;
    }
 
    /* Consider this column and try placing this queen in all rows
       one by one */
    
    for (int i = 0; i < M; i++)
    {
    	
        /* Check if queen can be placed on board[i][col] */
        if ( iSafe(board, row, i) )
        {
            /* Place this queen in board[i][col] */
            board[row][i] = '1';
 
            /* recur to place rest of the queens */
            solveNQUtil(board,row+1, col);
          
            /* If placing queen in board[i][col] doesn't lead to a solution
               then remove queen from board[i][col] */
             // BACKTRACK
        }
        
    }
 
     /* If queen can not be place in any row in this colum col
        then return false */
    
}
 
/* This function solves the N Queen problem using Backtracking.  It mainly uses
solveNQUtil() to solve the problem. It returns false if queens cannot be placed,
otherwise return true and prints placement of queens in the form of 1s. Please
note that there may be more than one solutions, this function prints one of the
feasible solutions.*/
public static boolean solveNQ(char[][] x)
{
    
	 int N=x.length;
	    int M=x[0].length;
	    
     solveNQUtil(x, 0,0) ;
    
    
    System.out.println("YES");
   // printSolution(board);
    return true;
}
 
// driver program to test above function
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.nextLine());
	int M = Integer.parseInt(sc.nextLine());
	 char[][] x=new char[N][M];
	for(int i=0;i<N;i++)
	{
		String[] temp = sc.nextLine().split(" ");
		
		
		for(int j=0;j<M;j++)
		{
			x[i][j]=temp[j].toCharArray()[0];
		}
		
	}
	
	
   
	solveNQ(x);
	System.out.println("count: "+count);

}
}