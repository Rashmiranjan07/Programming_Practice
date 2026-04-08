package com.qsp.day23;

import java.util.Arrays;

class TwoDArray {
	public static void main(String[] args) {
		int n = 5;
		int a[][] = new int[n][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
			for (int j = 0; j < a[i].length; j++) {
				if (j == 0 || j == a[i].length - 1) {
					a[i][j] = 1;
				}else {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
				}
			}
		}
		for (int x[] : a)
			System.out.println(Arrays.toString(x));
	}
	/*
[1]
[1, 1]
[1, 2, 1]
[1, 3, 3, 1]
[1, 4, 6, 4, 1]

	 */
}





