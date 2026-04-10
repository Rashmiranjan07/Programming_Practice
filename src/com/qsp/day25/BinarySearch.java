package com.qsp.day25;

class BinarySearch {
	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 7, 8, 10, 12 };
		soluction(a, 3);
	}

	static int soluction(int a[], int key) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (a[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;

	}
}