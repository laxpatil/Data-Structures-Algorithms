import java.util.Scanner;

public class Queens {

   

   

    public boolean canPlaceQueen(int r, int c) {
      
        for (int i = 0; i < r; i++) {
            if (x[i] == c || (i - r) == (x[i] - c) ||(i - r) == (c - x[i])) 
            {
                return false;
            }
        }
        return true;
    }

    public void printQueens(int[] x) {
        int N = x.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (x[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void placeNqueens(char[][] x ) {
       int n=x.length;
       int m=x[0].length;
        for (int c = 0; c < n; c++) {
            if (canPlaceQueen(r, c)) {
                x[r] = c;
                if (r == n - 1) {
                    printQueens(x);
                } else {
                    placeNqueens(r + 1, n);
                }
            }
        }
    }

   

    public static void main(String args[]) {
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
     	
    	
        
        placeNqueens(x);
     
    }
}
