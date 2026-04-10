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
	/*
	 * 7
	 */
}

class Secondmax {
	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 1, 6, 2, 7, 9, 9 };
		System.out.println(sol(a));
	}

	static int sol(int a[]) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secondMax = max;
				max = a[i];
			} else if (a[i] > secondMax && a[i] != max) {
				secondMax = a[i];
			}
		}
		return secondMax;
	}
	/*
7
	 */
}
