//26-03-2026
package com.qsp.day13;
class MaxElement {
	public static void main(String[] args) {
		int a[] = { 2, 3, 9, 1, 5, 6 };
	//	System.out.println(Integer.MIN_VALUE);
	//	System.out.println(Integer.MAX_VALUE);
		int res = max(a);
		System.out.println(res);
	}
	static int max(int a[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	/*
     9
	 */
}




