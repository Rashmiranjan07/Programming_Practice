package com.qsp.day9;

import java.util.Scanner;

class PyramidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j && i + j >= n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

// another method 

 class PyramidPattern2 {
	public static void main(String[] args) {
		System.out.print("Emter the number of row: ");
		int n = new Scanner(System.in).nextInt();
		int sp = n - 1;
		int st = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {

				System.out.print("*");
			}
			sp--;
			st += 2;
			System.out.println();
		}
	}
	/*
Emter the number of row: 7
       *
      ***
     *****
    *******
   *********
  ***********
 *************
	 */
}

 
 // Hollow pyramid 
 class PyramidPattern3 {
		public static void main(String[] args) {
			System.out.print("Emter the number of row: ");
			int n = new Scanner(System.in).nextInt();
			int sp = n - 1;
			int st = 1;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= sp; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= st; k++) {
					if (i == 1 || i == n || st == k || k == 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				sp--;
				st += 2;
				System.out.println();
			}
		}
		/*
Emter the number of row: 8
        *
       * *
      *   *
     *     *
    *       *
   *         *
  *           *
 ***************
		 */
	}
 
 

class PyramidPattern4{
	public static void main(String[] args) {
		System.out.print("Enter the number of row: ");
		int n = new Scanner(System.in).nextInt();
		int sp = 0;
		int st = (n*2)-1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {

				System.out.print("*");
			}
			sp++;
			st -= 2;
			System.out.println();
		}
	}
	/*
Enter the number of row: 5
*********
 *******
  *****
   ***
    *

	 */
}



