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

class NumberPattern2{
	public static void main(String[] args) {
		System.out.println("Enter no of row");
		int n = new Scanner(System.in).nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
	/*
54321
4321
321
21
1
	 */
}

class NumberPattern3{
	public static void main(String[] args) {
		System.out.println("Enter no of row");
		int n = new Scanner(System.in).nextInt();
		for (int i = n; i >= 1; i--) {
			int val=n;
			for (int j = i; j >= 1; j--) {
				System.out.print(val);
				val--;
			}
			System.out.println();
		}

	}
	/*
Enter no of row
5
54321
5432
543
54
5
	 */
}


class NumberPattern4{
	public static void main(String[] args) {
		System.out.println("Enter no of row");
		int n = new Scanner(System.in).nextInt();
		for (int i = n; i >= 1; i--) {
			int val=1;
			for (int j = i; j >= 1; j--) {
				System.out.print(val);
				val++;
			}
			System.out.println();
		}

	}
	/*
Enter no of row
5
12345
1234
123
12
1
	 */
}


class Numberpattern5{
	public static void main(String[] args) {
		System.out.println("Enter no of row");
		int n = new Scanner(System.in).nextInt();
		int val=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(val++ +"\t");
			}
			System.out.println();
		}
		
	}
	/*
Enter no of row
5
1	
2	3	
4	5	6	
7	8	9	10	
11	12	13	14	15
	 */
	
}


