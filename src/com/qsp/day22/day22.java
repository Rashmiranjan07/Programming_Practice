package com.qsp.day22;

import java.util.Arrays;
import java.util.Scanner;

class FibonacciSequence {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = Sc.nextInt();
		int[] result = fibonacci(n);
		System.out.println("Fibonacci sequence in array:");
		System.out.println(Arrays.toString(result));
	}

	static int[] fibonacci(int n) {
		int[] arr = new int[n];
		int a = 0;
		int b = 1;
		for (int i =0; i < n; i++) {
			System.out.println(a);
			arr[i] = a;
			int c = a + b;
			a = b;
			b = c;
		}
		return arr;
	}
/*
Enter a number 
10
0
1
1
2
3
5
8
13
21
34
Fibonacci sequence in array:
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
 */
}

// Another method 

class FibonacciSequence2 {
	public static void main(String[] args) {
		sol(10);
	}

	static void sol(int n) {
		int a[] = new int[n];
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		System.out.println(Arrays.toString(a));
	}
	/*
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
	 */
}