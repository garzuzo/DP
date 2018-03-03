package Max1DRangeSum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MaxSubseqProduct {
	static boolean[][] memo;
	static long[][] calc;
	static pair[] arr;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		BufferedReader lect = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter esc = new BufferedWriter(new OutputStreamWriter(System.out));

		String caso;

		while ((caso = lect.readLine()) != null) {

			String[] toAr = caso.split(" ");
			memo = new boolean[toAr.length - 1][toAr.length - 1];
			calc = new long[toAr.length - 1][toAr.length - 1];
			Arrays.fill(calc, Integer.MIN_VALUE);
			arr = new pair[toAr.length - 1];

			for (int i = 0; i < toAr.length - 1; i++) {

				int val = Integer.parseInt(toAr[i]);
				int posNeg = val < 0 ? -1 : 1;
				arr[i] = new pair(Math.abs(val), posNeg);
			}

			long max = Integer.MIN_VALUE;
			for (int i = 0; i < toAr.length - 1; i++) {
				for (int j = i + 1; j < toAr.length; j++) {

					//max = Math.max(max, maxProd(i, j));
				}
			}
			System.out.println(max);
		}

	}
	static long maxProd(int i, int j) {

		if (i==0)
			return (arr[i].val);

		if (memo[i][j])
			return calc[i][j];

		long resp = arr[i].val * maxProd(i, j - 1);
		long max = 0;
		if (arr[i].val > resp)
			max = arr[i].val;
		else{
			max = resp;
		//arr[i].posNeg*=	
		}
		memo[i][j] = true;
		calc[i][j] = max;
		return max;

	}
	static class pair {

		int val;

		int posNeg;

		pair(int val, int posNeg) {
			this.val = val;
			this.posNeg = posNeg;
		}

	}
}


	


