package com.qsp.day10;

import java.util.Scanner;

class Patterens {
	public static void main(String[] args) {
		int n = 9;
		diamond1(n);
	}

	static void diamond1(int n) {
		if (n % 2 == 0) {
			n = n + 1;
		}
		int sp = n / 2;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i <= n / 2) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}
		}
	}
	/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
	 */
}



class Patterens2 {
	public static void main(String[] args) {
		System.out.println("Enter sequence number");
		int n = new Scanner(System.in).nextInt();
		int st = 1;
		int sp = n - 1;
		for (int i = 1; i <= (2*n-1); i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*");
			}
			if (i < n) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}
			System.err.println();
		}
	}
	/*
Enter sequence number
5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
	 */
}