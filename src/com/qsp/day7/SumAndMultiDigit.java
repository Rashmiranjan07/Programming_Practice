package com.qsp.day7;

import java.util.Scanner;

class SumAndMultiDigit {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(sum(n));
		System.out.println(multi(n));

	}

	static int sum(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			n /= 10;
			sum += rem;
		}
		return sum;

	}

	static int multi(int n) {
		int multi = 1;
		while (n > 0) {
			int rem = n % 10;
			n /= 10;
			multi *= rem;
		}
		return multi;
	}
}
