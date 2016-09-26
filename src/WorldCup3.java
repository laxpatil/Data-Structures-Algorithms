import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class WorldCup3 {

	public static int bfs(int[][] m,	int i, int[] x, int n)
	{
		int[][] temp =new int[n][n];
		for (int w = 0; w < m.length; w++) {
	        System.arraycopy(m[w], 0, temp[w], 0, temp[w].length);
	    }
		Queue<Integer> Q=new LinkedList<Integer>();
		int sum=0;
		Q.add(i);
		while(!Q.isEmpty())
		{
			int num=Q.remove();
			sum=sum+x[num];
		//	System.out.println("num & x[num] : "+ num+" & "+x[num]);
			for(int k=0;k<n;k++)
			{
				if(temp[num][k]==1)
				{
					Q.add(k);
			//		System.out.println("added Q:"+k);
					temp[num][k]=0;
					temp[k][num]=0;
				}
				
				
				
			}
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[][] mat=new int[N][N];
		String[] temp = sc.nextLine().split(" "); 
		//HashMap<Integer,LinkedList> m=new HashMap<Integer,LinkedList>();
		
		
		int[] x=new int[N];
		int j=0;
		for(j=0;j<N;j++)
		{
			x[j]=Integer.parseInt(temp[j]);
		}
		 
		for (j=0;j<N-1;j++)
		{
			temp = sc.nextLine().split(" ");
			int n1=Integer.parseInt(temp[0]);
			int n2=Integer.parseInt(temp[1]);
			//LinkedList<Integer> l=m.get(n1-1);
			mat[n1-1][n2-1]=1;
			mat[n2-1][n1-1]=1;
			
		/*	if(l==null)
				l=new LinkedList<Integer>();
			l.add(n2-1);
			m.put(n1-1,l);
			
			*/
			
		}
		//System.out.print("---INITIAL Mat---");
	/*	for (int p = 0; p < N; p++) {
		    for (int q = 0; q < N; q++) {
		        System.out.print(mat[p][q] + " ");
		    }
		    System.out.print("\n");
		}
		System.out.println("---------------"); */
		int sum=0;
		int part1=0;
		int part2=0;
		int diff=Integer.MAX_VALUE;
		int result=0;
		for(j=0;j<N;j++)
		{
			sum=sum+x[j];
		}
		int[][] tp =new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(j=0;j<i;j++)
			{
				if(mat[i][j]==1)
				{
					
					for (int w = 0; w < mat.length; w++) {
				        System.arraycopy(mat[w], 0, tp[w], 0, mat[w].length);
				    }
					
				
					tp[i][j]=0;
					tp[j][i]=0;
				//	 System.out.println("i:j---  "+i+":" +j);
					part1=bfs(tp,i,x,N);
				//	System.out.print("---in the llopMat---");
				/*	for (int p = 0; p < N; p++) {
					    for (int q = 0; q < N; q++) {
					        System.out.print(tp[p][q] + " ");
					    }
					//    System.out.print("\n");
					} */
					// System.out.println("i"+i);
					part2=sum-part1;
					if(diff>Math.abs(part1-part2))
					{
						diff=Math.abs(part1-part2);
					//	 System.out.println("diff:"+diff+":  "+part1+":"+part2);
						if(part1>part2)
							result=part1;
						else
							result=part2;
					}
					
				//	System.out.print("---M Mat---");
				/*	for (int p = 0; p < N; p++) {
					    for (int q = 0; q < N; q++) {
					        System.out.print(mat[p][q] + " ");
					    }
					    System.out.print("\n");
					} */
				}
				
			}
		}
		
		
	    System.out.println(result);
		
	}
}
