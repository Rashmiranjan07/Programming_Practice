package com.qsp.day14;

import java.util.Arrays;

class AddElement {
	public static void main(String[] args) {
		int[] a = { 9, 2, 6, 0, 4, 2, 6 };

		System.out.println(Arrays.toString(addElement(a, 9)));
	}

	static int[] addElement(int a[], int newElement) {
		int[] b = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[a.length] = newElement;
		a = b;
		return b;
	}
	/*
	 * [9, 2, 6, 0, 4, 2, 6, 1]
	 */
}
