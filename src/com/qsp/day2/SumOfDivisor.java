package com.qsp.day2;

import java.util.Scanner;

public class SumOfDivisor {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
				System.out.println(i);
				if (n / i != i) {
					System.out.println(n / i);
					sum = sum + (n / i);
				}
			}
		}
		System.out.println("Sum=" + sum);
	}
	/*
Enter a number
36
1
36
2
18
3
12
4
9
6
Sum=91
	 */
}
