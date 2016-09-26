import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			String cur;

			br = new BufferedReader(new FileReader("C:\\Users\\Laxmikant\\Documents\\testing.txt"));
			
			while ((cur = br.readLine()) != null) {
				//cur="5 4 3 2 1";
				//System.out.println(cur);
				String[] temp=cur.split(" ");
				
				int[] a=new int[temp.length];
				int n=temp.length;
				for (int i=0;i<temp.length;i++)
				{
					//System.out.println(temp[i]);
					a[i]=Integer.parseInt(temp[i]);
				}
				int swap=0;
				int count=0;
				 for (int c = 0; c < ( n - 1 ); c++) {
				      for (int d = 0; d < n - c - 1; d++) {
				        if (a[d] > a[d+1]) 
				        {
				          swap       = a[d];
				          a[d]   = a[d+1];
				          a[d+1] = swap;
				          count++;
				        }
				      }
				    }
				 
				 System.out.println(count);
				 String t="";
				 for (int c = 0; c < ( n); c++) {
					 t=t+a[c]+" ";
				 }
				 t=t.trim();
				 System.out.println(t);
				
				
			}
			
			

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}