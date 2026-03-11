package com.qsp.day3;

import java.util.Scanner;

class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println(fact);
	}

}

// another 
class Factorial2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println(fact(n));
	}

	static int fact(int n) {
		if (n == 0)
			return 1;
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		return res;
	}
}
