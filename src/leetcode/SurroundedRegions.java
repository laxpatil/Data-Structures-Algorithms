/**
 * 
 */
package leetcode;

/**
 * @author Laxmikant
 *
 */
public class SurroundedRegions {

	/**
	 * @param args
	 */
	
	
public void solve(char[][] board) {
        
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
    
    
    public void floodFill(char[][] mat, int i, int j, char c, int m ,int n)
    {
        
        if(i<0 || j<0 || i>=m || j>=n)
        {
            return;
        }
        
        
        if(mat[i][j]=='X' || mat[i][j]=='-')
        {
        	return;
        }
        
        mat[i][j]=c;
        
        floodFill(mat, i-1,j, c, m ,n);
        floodFill(mat, i,j-1, c, m ,n);
        floodFill(mat, i+1,j, c, m ,n);
        floodFill(mat, i,j+1, c, m ,n);
        
    }
    
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
