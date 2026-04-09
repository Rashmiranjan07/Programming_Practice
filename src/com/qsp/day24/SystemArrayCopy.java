package com.qsp.day24;

import java.util.Arrays;

class SystemArrayCopy {
	public static void main(String[] args) {
		int a[] = { 9, 5, 4, 1, 10, 6, 3, 2, 8, 1, 2, 3, 0 };
		int b[] = new int[6];
		System.arraycopy(a, 2, b, 0, 6);
		System.out.println(Arrays.toString(b));
	}

	static void solution(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
	/*
[4, 1, 10, 6, 3, 2]
	 */
}


