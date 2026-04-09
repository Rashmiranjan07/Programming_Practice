package com.qsp.day24;

import java.util.Arrays;

class BubbleSort {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 8, 10, 2, 3, 1, 5, 4, 6, 4 };
		solution(a);
	}

	static void solution(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	/*
	 * [1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 6, 8, 10]
	 */
}