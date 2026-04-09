package com.qsp.day24;

class MaxElementLast {
	public static void main(String[] args) {
		int arr[] = { 9, 2, 4, 1, 6, 3, 2, 8 };

	}

	static void soluction(int arr[]) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
	}

}
