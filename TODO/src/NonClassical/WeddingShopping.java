package NonClassical;
import java.io.*;
import java.util.*;

public class WeddingShopping {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader lect=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter esc=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(lect.readLine());
		
		for (int i = 0; i < n; i++) {
			
			String[] mc=lect.readLine().split(" ");
			
			int m=Integer.parseInt(mc[0]);
			int c=Integer.parseInt(mc[1]);
			
			int[][] matrix=new int[c][20];
			for (int j = 0; j < c; j++) {
				
				String[] kAct=lect.readLine().split(" ");
				
				int ki=Integer.parseInt(kAct[0]);
				
				
				for (int k = 1; k <kAct.length; k++) {
					matrix[j][k]=Integer.parseInt(kAct[k]);
				}
				
				
			}
			
			
			
			
			esc.write("\n");
		}
		
		
		
	}

}
