package LIS;

import java.io.*;
import java.util.*;

import java.util.Arrays;

public class HistoryGrading {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader lect = new BufferedReader(new InputStreamReader(System.in));

		String[] a = lect.readLine().split(" ");
		int[] arr = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			arr[i] = Integer.parseInt(a[i]);
		}

		System.out.println(lis(arr, a.length));

	}

	static int lis(int arr[], int n) {

		int lis[] = new int[n];
		int max = 0;

		Arrays.fill(lis, 1);

		for (int i = 1; i < n; i++) {

			for (int j = 0; j < i; j++) {

				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;

			}
		}

		for (int i = 0; i < lis.length; i++) {
			max = Math.max(lis[i], max);
		}

		return max;
	}
}
