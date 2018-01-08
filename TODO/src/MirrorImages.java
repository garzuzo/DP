import java.io.*;
import java.util.*;

public class MirrorImages {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader lect = new BufferedReader(new InputStreamReader(System.in));

		int nCases = Integer.parseInt(lect.readLine());
		for (int i = 1; i <= nCases; i++) {

			String[] tam = lect.readLine().split(" ");

			int n = Integer.parseInt(tam[0]);
			int m = Integer.parseInt(tam[1]);

			char[][] matrix = new char[n][m];
			for (int j = 0; j < n; j++)
				matrix[j] = lect.readLine().toCharArray();
			System.out.println("Test " + i);
			for (int j = n - 1; j >= 0; j--) {
				for (int k = m - 1; k >= 0; k--) {
					System.out.print(matrix[j][k]);
				}
				System.out.println();
			}
		}
	}

}
