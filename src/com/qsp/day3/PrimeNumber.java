package com.qsp.day3;

import java.util.Scanner;

//Write the program to check input n is prime or not 
class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter number");
		int n = new Scanner(System.in).nextInt();
		System.out.println(soluction(n));
	}

	public static boolean soluction(int n) {
		if (n <= 1)
			return false;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		return count == 2;
//		if (count == 2)
//			return true;
//		else
//			return false;
	}

}

// another method 

class PrimeNumber2 {
	public static void main(String[] args) {
		System.out.println("Enter number ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(soluction(n));
	}

	public static boolean soluction(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

//  Advanced level to check the prime number
class PrimeNumber3 {
	public static void main(String[] args) {
		System.out.println("Enter number ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(solution(n));
	}

	public static boolean solution(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

// Q. Write  a java program to print all the prime numbers in a range given by user

class PrimeNumber4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit");
		int lower = sc.nextInt();
		System.out.println("Enter upper limit");
		int upper = sc.nextInt();
		for (int i = lower; i <= upper; i++) {
			if (soluction(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean soluction(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
