/**
 * 
 */
package leetcode;

/**
 * @author Laxmikant
 *
 */
public class MaximalSquare {

	/**
	 * @param args
	 */
	
	public static int maximalSquare(char[][] matrix) {
        int i,j;
        
        if(matrix.length==0)
        return 0;
        
      
        
        
        int r= matrix.length;
        int c= matrix[0].length;
        int[][] sq= new int[r][c];
        
        
        for(i=0;i<r;i++)
        {
        	
            for(j=0;j<c;j++)
            {
            	if(matrix[i][j]=='1')
                {
                    sq[i][j]=1;
                   
                }
            	else
            		sq[i][j]=0;
            }
        }
        
    int max=0;
       
    
        for(i=1;i<r;i++)
        {
        	 // System.out.println("------------");
            for(j=1;j<c;j++)
            {
            	// System.out.println("sq[i][j] "+i+" "+" "+ j+" "+sq[i][j]);
            	// System.out.println("sq[i-1][j-1] "+(i-1)+" "+" "+ (j-1)+" "+sq[i-1][j-1]);
            	// System.out.println("sq[i-1][j] "+(i-1)+" "+" "+ j+" "+sq[i-1][j]);
            	// System.out.println("sq[i][j-1] "+i+" "+" "+ (j-1)+" "+sq[i][j-1]);
                if(matrix[i][j]=='1')
                {
                    int min= Math.min(sq[i-1][j], sq[i-1][j-1]);
                    		min=Math.min(min,sq[i][j-1]);
                    		sq[i][j]=min+1;
                //    System.out.println("sq: "+min);
                }
                else 
                {
                	sq[i][j]=0;
                }
            }
            
          
            
        }
        
      
    	//get maximal length
    	for ( i = 0; i < r; i++) {
    		for ( j = 0; j < c; j++) {
    			if (sq[i][j] > max) {
    				max = sq[i][j];
    			}
    		}
    	}
        
        return max*max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] mat= {{'1','1','1','1'},{'1','1','1','1'},{'1','1','1','1'}};
		
		System.out.println(maximalSquare(mat));
		
	}

}
