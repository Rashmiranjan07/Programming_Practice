package com.qsp.day3;

//Q. Write a jav a program to print alternative prime numbers in a range (1-100) 

class AlternativePrimeNo {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (soluction(i)) {
				count++;
				if (count % 2 == 1) {
					System.out.println(i);
				}
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
