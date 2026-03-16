package com.qsp.day6;

import java.util.Scanner;

class SnakePattern {
	public static void main(String[] args) {
		System.out.println("enter the number of row: ");
		int n = new Scanner(System.in).nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				int val = (i - 1) * n + 1;
				for (int j = 1; j <= n; j++) {
					System.out.print(val + "\t");
					val++;
				}
			} else {
				int val = n * i;
				for (int j = 1; j <= n; j++) {
					System.out.print(val + "\t");
					val--;
				}
			}
			System.out.println();
		}
	}
	/* 
enter the number of row: 
5
1	2	3	4	5	
10	9	8	7	6	
11	12	13	14	15	
20	19	18	17	16	
21	22	23	24	25
	 */
}
