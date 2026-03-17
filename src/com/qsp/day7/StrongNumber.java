package com.qsp.day7;

import java.util.Scanner;

class StrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		int n = new Scanner(System.in).nextInt();
		boolean res = sol(n);
		System.out.println(res);
	}

	static boolean sol(int n) {
		int sum = 0;
		int temp = n;
		while (n > 0) {
			int rem = n % 10;
			n /= 10;
			sum = sum + fact(rem);
		}
		return temp == sum;
	}

	static int fact(int n) {

	}

}
