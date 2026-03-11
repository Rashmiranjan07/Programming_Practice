package com.qsp.day3;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(soluction(i)) {
				System.out.println(i+" is prime");
			} else {
				System.out.println(i+" is not a prime");
			}
		}
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
