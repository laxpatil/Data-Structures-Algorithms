/**
 * 
 */
package leetcode;

/**
 * @author Laxmikant
 *
 */
public class NumberOfIslands {

	/**
	 * @param args
	 */
	
	 public void setIslandZero(int i, int j, char[][] grid)
		{
		   
			if((i>=0 && i<grid.length) && (j>=0 &&  j<grid[0].length) && grid[i][j]=='1')
			{
				grid[i][j]='0';
				
				setIslandZero(i-1, j, grid); // up
				setIslandZero(i, j-1, grid); // left
				setIslandZero(i, j+1, grid); //right
				setIslandZero(i+1, j, grid);  //down
			}
			return;
		}
		
	public int numIslands(char[][] grid) {
	        int islands=0;
	        if(grid.length==0 )
	        return 0;        
	        for(int i=0;i<grid.length;i++)
	        {
	        	for (int j=0;j<grid[0].length;j++)
	        	{
	        		
	        		if(grid[i][j]=='1')
	        		{
	        			islands++;
	        			grid[i][j]='0';
	        			setIslandZero(i-1, j, grid); // up
	        			setIslandZero(i, j-1, grid); // left
	        			setIslandZero(i, j+1, grid); //right
	        			setIslandZero(i+1, j, grid);  //down
	        			
	        		}
	        		
	        		
	        	}
	        	
	        }
	        return islands;
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
