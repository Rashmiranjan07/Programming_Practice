package com.qsp.day2;

import java.util.Scanner;

class PrintDivisor {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

	}
}

/*
Enter a number
36
1
2
3
4
6
9
12
18
*/

class PrintDivisor2 {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				if (n / i != i) {
					System.out.println(n / i);
				}
			}
		}
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
 */
}



