package com.qsp.day4;

class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sum(10));
	}

	static int sum(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}
}
