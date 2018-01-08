package hello2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PartyLemonade {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader lect = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter esc = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] in = lect.readLine().split(" ");

		int n = Integer.parseInt(in[0]);

		// capacity
		int l = Integer.parseInt(in[1]);

		int[] weight = new int[n];
		int[] cost = new int[n];

		String[] arr = lect.readLine().split(" ");
		for (int i = 0; i < n; i++) {

			weight[i] = (int) Math.pow(2, i);
			cost[i] = Integer.parseInt(arr[i]);
		}

		esc.write(knapSack(l, weight, cost, n)+"\n");
		esc.flush();
	}

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// Returns the maximum value that can be put in a knapsack of capacity W
	static int knapSack(double W, int wt[], int val[], int n) {
		int i, w;
		int K[][] = new int[n + 1][(int) (W + 1)];

		// Build table K[][] in bottom up manner
		for (i = 0; i <= n; i++) {
			for (w = 0; w <= W; w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];
			}
		}

		return K[n][(int) W];
	}
}