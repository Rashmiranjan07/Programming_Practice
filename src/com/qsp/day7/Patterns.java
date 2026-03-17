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


class Pattern2{
	public static void main(String[] args) {
		System.out.println("Enter no of row");
		int n = new Scanner(System.in).nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n; j++) {
				if (i==1 || j==1 || i+j==n+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
					
			}
			System.out.println();

		}
	}
	/*
Enter no of row
7
******
*    *
*   * 
*  *  
* *   
**    
*     
	 */
}
