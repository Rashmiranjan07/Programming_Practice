package com.qsp.day14;

class LinearSearch {
	public static void main(String[] args) {
		int a[] = { 4, 2, 6, 1, 5, 3, 8 };
		System.out.println(indexOf(a, 9));
		System.out.println(lastIndexOf(a, 6));

	}

	static int indexOf(int a[], int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	/*
	 * -1
	 */

	static int lastIndexOf(int a[], int key) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;

	}
	
}



