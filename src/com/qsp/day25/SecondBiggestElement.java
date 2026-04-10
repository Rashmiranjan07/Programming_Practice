package com.qsp.day25;

import java.util.Arrays;

class SecondBiggestElement {
	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 1, 6, 2, 7, 9 };
		System.out.println(sol(a));
	}

	static int sol(int a[]) {
		Arrays.sort(a);
		int max = a[a.length - 1];
		int secondmax = max;
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] != max) {
				secondmax = a[i];
				break;
			}
		}
		return secondmax;

	}
}
