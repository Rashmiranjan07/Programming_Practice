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
