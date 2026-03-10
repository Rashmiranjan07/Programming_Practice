package com.qsp.day2;

import java.util.Scanner;

class Square1 {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	/*
 Enter a number
5
11111
22222
33333
44444
55555

	 */
}

class Square2 {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
/*
 * Enter a number
5
12345
12345
12345
12345
12345

 */
}

class Square3 {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(val + "\t");
				val++;
			}
			System.out.println();
		}
	}
	/*
	 * Enter a number
5
1	2	3	4	5	
6	7	8	9	10	
11	12	13	14	15	
16	17	18	19	20	
21	22	23	24	25
	 */

}
