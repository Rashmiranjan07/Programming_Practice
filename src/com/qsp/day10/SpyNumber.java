package com.qsp.day10;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		int n = new Scanner(System.in).nextInt();
		System.out.println(isSpy(n));
	}

	static boolean isSpy(int n) {
		int sum = 0;
		int multiply = 1;
		while (n > 0) {
			int rem = n % 10;
			n /= 10;
			sum += rem;
			multiply *= rem;
		}
		return sum == multiply;
	}
	/*
Enter sequence number
123
true

	 */
}
