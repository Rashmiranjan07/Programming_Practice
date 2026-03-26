//26-03-2026
package com.qsp.day13;

import java.util.Arrays;

class MissingNumber {
	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 5, 3, 7, 8, 9 };
		missing1(a);
	}

	static void missing1(int a[]) {
		Arrays.sort(a);   // using sort
		for (int i = 1; i < a.length; i++) {
			if (a[i] - 1 != a[i - 1]) {
				System.out.println(a[i] - 1);
			}
		}
/*
6
 */
	}
}


// Without sorting an array 
