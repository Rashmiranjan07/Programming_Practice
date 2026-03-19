package com.qsp.day8;

import java.util.Scanner;

 class Pattern1 {
	public static void main(String[] args) {
		System.out.print("Emter the number of row: ");
		int n = new Scanner(System.in).nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
Emter the number of row: 5
    *
   **
  ***
 ****
*****
	 */
}
 
 
class Pattern2 {
	public static void main(String[] args) {
		System.out.print("Emter the number of row: ");

		int n = new Scanner(System.in).nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	/*
Emter the number of row: 5
    1
   22
  333
 4444
55555

	 */
}

