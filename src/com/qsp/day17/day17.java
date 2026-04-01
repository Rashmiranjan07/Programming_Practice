package com.qsp.day17;

import java.util.Arrays;

class MergeOfArray {
	public static void main(String[] args) {
		int a[] = { 9, 2, 6, 0 };
		int b[] = { 4, 5, 6, 1, 3, 7 };
		int res[] = soluction(a, b);
		System.out.println(Arrays.toString(res));

	}

	static int[] soluction(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < a.length && j < b.length) {
			c[k] = a[i];
			k++;
			i++;
			c[k] = b[j];
			k++;
			j++;
		}
		while (i < a.length) {
			c[k] = a[i];
			i++;
			k++;
		}
		while (j < b.length) {
			c[k] = b[j];
			j++;
			k++;
		}
		return c;

	}
	/*
[9, 4, 2, 5, 6, 6, 0, 1, 3, 7]
	 */

}


//class MergeArrayWithSort {
//	public static void main(String[] args) {
//		int a[] = { 1, 5, 7, 8 };
//		int b[] = { 2, 3, 4, 6, 9, 10 };
//		int res[]=soluction(a, b);
//		System.out.println(Arrays.toString(res));
//	}
//
//	static int[] soluction(int a[], int b[]) {
//
//		int c[] = new int[a.length + b.length];
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		while (i < a.length && j < b.length) {
//			c[k] = a[i];
//			k++;
//			i++;
//			c[k] = b[j];
//			k++;
//			j++;
//		}
//		while (i < a.length) {
//			c[k] = a[i];
//			i++;
//			k++;
//		}
//		while (j < b.length) {
//			c[k] = b[j];
//			j++;
//			k++;
//		}
//		Arrays.sort(c);
//		return c;
///*
// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]		
// */
//	}
//}

class MergeArrayWithSort {
	public static void main(String[] args) {
		int a[] = { 1, 5, 7, 8 };
		int b[] = { 2, 3, 4, 6, 9, 10 };
		int res[] = soluction(a, b);
		System.out.println(Arrays.toString(res));
	}

	static int[] soluction(int a[], int b[]) {

		int c[] = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
				k++;
			} else {
				c[k] = b[j];
				j++;
				k++;
			}

		}
		while (i < a.length) {
			c[k] = a[i];
			i++;
			k++;
		}
		while (j < b.length) {
			c[k] = b[j];
			j++;
			k++;
		}

		return c;

	}
	/*
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	 */
}




