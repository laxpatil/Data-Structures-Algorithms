/**
 * 
 */
package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Laxmikant
 *
 */
 class Point{
	int x;
	int y;
	
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}

public class SurroundedRegionsQueue {

	
	

public static void solve(char[][] board) {
        
	 	if(board.length==0)
	    return;
	        
	
        int m= board.length;
        int n = board[0].length;
        
        for (int i=0;i<m; i++)
        {
            if(board[i][0]=='O')
            {
            	floodFill(board, i, 0, '-', m, n);
            }
            
            if(board[i][n-1]=='O')
            {
            	floodFill(board, i, n-1, '-', m, n);
            }
        }
        
        for (int j=0;j<n; j++)
        {
            if(board[0][j]=='O')
            {
            	floodFill(board, 0, j, '-', m, n);
            }
            
            if(board[m-1][j]=='O')
            {
            	floodFill(board, m-1, j, '-', m, n);
            }
        }
        
        
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n ;j++)
        	{
        		
        		if(board[i][j]=='O')
        		{
        			board[i][j]='X';
        		}
        		
        		if(board[i][j]=='-')
        		{
        			board[i][j]='O';
        		}
        		
        	}
        }
        
      
        
        
        
    }
    

 public static boolean checkBoundary(char[][] mat, int i, int j, int m ,int n)
 {
	 if(i<0 || j<0 || i>=m || j>=n)
     {
         return false;
     }
	 return true;
 }
    
    public static  void floodFill(char[][] mat, int i, int j, char c, int m ,int n)
    {
      
    	Queue<Point> q= new LinkedList<Point>();
    	
    	q.add(new Point(i, j));
    	
    	while(!q.isEmpty())
    	{
    		Point cur= q.remove();
    		
    		i=cur.x;
    		j=cur.y;
    		
    		mat[i][j]=c;
    		
    		if(checkBoundary(mat, i-1, j, m, n) &&   mat[i-1][j]=='O')
    		{
    			q.add(new Point(i, j));
    		}
    		
    		if(checkBoundary(mat, i, j-1, m, n) && mat[i][j-1]=='O' )
    			q.add(new Point(i, j-1));
    		
    		if(checkBoundary(mat, i, j+1, m, n) && mat[i][j+1]=='O' )
    			q.add(new Point(i, j+1));
    		
    		if(checkBoundary(mat, i+1, j, m, n) && mat[i+1][j]=='O' )
    			q.add(new Point(i+1, j));
    		
    			
    		
    		
    	}
        
    }
    
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		char[][] board= {{"OXXOX"},{"XOOXO"},{"XOXOX"},{"OXOOO"},{"XXOXO"}};
//		solve(board);
		
	}
}
