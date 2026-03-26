//26-03-2026
package com.qsp.day13;

import java.util.Arrays;

class MissingNumber {
	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 5, 3, 7, 8, 9 };
		missing(a);
	}

	static void missing(int a[]) {
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

class MissingNumber2 {
	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 5, 3, 7, 8, 9 };
		int res=missingNumber(a);
		System.out.println("Missing number is: " + res);
		
	}
	 static int missingNumber(int a[]) {
		 int n=max(a);
		 int expected=(n*(n+1))/2;
		 int actual=0;
		 for(int x:a) {
			 actual+=x;
			 
		 }
		 int res=expected-actual;
		 return res;
		 
	 }
	 static int max(int a[]) {
			int max = a[0];
			for (int x : a) {
				if (x > max) {
					max = x;
				}
			}
			return max;
		}
	/*
Missing number is: 6 
	 */
}
