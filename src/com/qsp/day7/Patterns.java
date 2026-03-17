package com.qsp.day7;

import java.util.Scanner;

class Patterns {
	public static void main(String[] args) {
		System.out.println("Enter no of row");
		int n = new Scanner(System.in).nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j <= n - 1)
					System.out.print("*");
			}
			System.out.println();

		}
	}
	/*
Enter no of row
6
******
*****
****
***
**
*
	 */
}
