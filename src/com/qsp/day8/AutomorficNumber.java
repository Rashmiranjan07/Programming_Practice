package com.qsp.day8;

import java.util.Scanner;

 class AutomorficNumber {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(solution(n));

	}

	static boolean solution(int n) {
		int squre = n * n;
		while (n > 0) {
			int rem1 = n % 10;
			int rem2 = squre % 10;
			if (rem1 != rem2)
				return false;
			n /= 10;
			squre /= 10;
		}
		return true;

	}
	/*
Enter a number: 625
true

	 */
}
 
 
class AutomorficNumber2 {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(solution(n));
	}

	static boolean solution(int n) {
		int squre = n * n;
		String temp = squre + "";
		return temp.endsWith(n + "");
	}
	/*
Enter a number: 5
true
	 */
}
