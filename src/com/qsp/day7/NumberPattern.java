package com.qsp.day7;

import java.util.Scanner;

class NumberPattern {
	public static void main(String[] args) {
		System.out.println("Enter no of row");
		int n = new Scanner(System.in).nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
	/*
Enter no of row
5
55555
4444
333
22
1
	 */
}
