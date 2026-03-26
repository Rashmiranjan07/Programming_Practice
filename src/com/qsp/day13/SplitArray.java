package com.qsp.day13;

import java.util.Arrays;

class SplitArray {
	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 5, 3, 7, 9, 8 };
		split(a);
	}

	static void split(int a[]) {
		int left[] = new int[a.length / 2];
		int right[] = new int[a.length - left.length];
		for (int i = 0; i < left.length; i++) {
			left[i] = a[i];
		}

		for (int j = 0; j < right.length; j++) {
			right[j] = a[j + left.length];
		}

		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));

	}
	/*
	 * [2, 4, 1, 5]
	   [3, 7, 9, 8]
	 */
}
