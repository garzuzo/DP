package LIS;

import java.io.*;
import java.util.*;

public class testingTheCatcher {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner lect = new Scanner(System.in);
BufferedWriter esc=new BufferedWriter(new OutputStreamWriter(System.out));
		boolean salir = false;

		int contOut = 1;

		ArrayList<Integer> arr=new ArrayList<Integer>();
		int act;
		while (true) {

			if (salir)
				break;
			while (true) {
				act = lect.nextInt();
				if (act == -1)
					break;

				arr.add(act);
			}
			esc.write(
					"Test #" + contOut + ":\n  maximum possible interceptions: " + maxSubsequence(arr, arr.size())+"\n");

			contOut++;
			arr = new ArrayList<Integer>();

			act = lect.nextInt();
			if (act == -1)
				salir = true;
			else {
				arr.add(act);
				esc.write("\n");
			}
		}esc.close();

	}

	static int maxSubsequence(ArrayList<Integer> arr, int n) {

		int[] lis = new int[n];
		int max = 0;
		Arrays.fill(lis, 1);

		for (int i = 1; i < n; i++) {

			for (int j = 0; j < i; j++) {

				if (arr.get(i) <=arr.get(j) && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;

			}
		}

		for (int i = 0; i < lis.length; i++) {
			max = Math.max(max, lis[i]);
		}
		return max;
	}
}