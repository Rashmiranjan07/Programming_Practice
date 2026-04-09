package com.qsp.day24;

import java.util.Arrays;

class Selection {
	public static void main(String[] args) {
		int a[] = { 9,2,4,1,6,3,2,8 };
		soluction(a);
	}

	static void soluction(int a[]) {
		int min = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[min]) {
				min = i;
			}
		}
		int temp = a[min];
		a[min] = a[0];
		a[0] = temp;
		System.out.println(Arrays.toString(a));
	}
/*
 [1, 2, 4, 9, 6, 3, 2, 8]

 */
}


