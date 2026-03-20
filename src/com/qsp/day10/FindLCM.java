package com.qsp.day10;

import java.util.Scanner;

class FindLCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the first number");
		int n2 = sc.nextInt();
		int res = gcd(n1, n2);
		int lcm=lcm(n1,n2);
		//System.out.println("GCD of " + n1 + " and " + n2 + " is " + res);
		System.out.println("LCM of " + n1 + " and " + n2 + " is " +lcm );

	}

	static int gcd(int n1, int n2) {
		// int min = n1 > n2 ? n2 : n1;
		int min = Math.min(n1, n2);
		for (int i = min; i > 1; i--) {
			if (n1 % i == 0 && n2 % i == 0) {
				return i;
			}
		}
		return 1;
	}

	static int lcm(int n1, int n2) {
		return (n1 * n2)/gcd(n1, n2);
	}
	/*
Enter the first number
60
Enter the first number
6
LCM of 60 and 6 is 60

	 */
}
