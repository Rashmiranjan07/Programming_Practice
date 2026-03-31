package com.qsp.day16;

import java.util.Arrays;

//31-03-2026

class PrefixSum {
	public static void main(String[] args) {
		int a[] = { 9, 2, 6, 0, 4, 2 };
		soluction(a);
		System.out.println(Arrays.toString(a));
	}
	static void soluction(int a[]) {
		for (int i = 1; i < a.length; i++) {
			a[i] = a[i] + a[i - 1];
		}
	}
	/*
[9, 11, 17, 17, 21, 23]
	 */
}

// each unicode and their correcponding value 

class TypeConversion {
	public static void main(String[] args) {
		for( int i=0; i<=130; i++) {
			System.out.println(i+" "+(char)(i));
		}
	}
}