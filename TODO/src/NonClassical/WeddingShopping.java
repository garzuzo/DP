package NonClassical;

import java.io.*;
import java.util.*;

public class WeddingShopping {

	static int m;

	static boolean[][] mem;

	static int[][] matrix;
	static int c;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader lect = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter esc = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(lect.readLine());
		
		for (int i = 0; i < n; i++) {
			mem = new boolean[20][201];
			String[] mc = lect.readLine().split(" ");
			m = Integer.parseInt(mc[0]);
			c = Integer.parseInt(mc[1]);
			matrix = new int[c][21];
			for (int j = 0; j < c; j++) {
				String[] kAct = lect.readLine().split(" ");
				for (int k = 0; k < kAct.length; k++) {
					int val = Integer.parseInt(kAct[k]);
					matrix[j][k] = val;
				}
			}
			
			esc.write(maxAmount());
		}
		esc.flush();

	}

	static String maxAmount() {

		for (int i = 1; i < matrix[0].length; i++) {
			if (m - matrix[0][i] >= 0 && matrix[0][i] != 0)
				mem[0][m - matrix[0][i]] = true;
		}
	
		for (int i = 1; i < matrix.length ; i++) {
		
			for (int j = 0; j < 201; j++) {

				if (mem[i - 1][j]) {
					for (int k = 1; k <= matrix[i][0]; k++) {

						if (mem[i - 1][j] && j - matrix[i][k] >= 0) {

							mem[i][j - matrix[i][k]] = true;
						
						}
					}

				}
			}

		}

		for (int i = 0; i <= m; i++) {

			if (mem[c - 1][i]) {

				return m - i + "\n";

			}

		}
		return "no solution\n";

	}
}
