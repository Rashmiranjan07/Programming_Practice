package com.qsp.day7;

import java.util.Scanner;

class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		int n = new Scanner(System.in).nextInt();
		System.out.println(soluction(n));

	}

	static boolean soluction(int n) {
		int temp = n;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			n /= 10;
			rev = (rev * 10) + rem;
		}
		return rev == temp;
	}

}
