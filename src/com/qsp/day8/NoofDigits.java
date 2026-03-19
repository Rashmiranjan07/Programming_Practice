package com.qsp.day8;

import java.util.Scanner;

class NoofDigits {
	public static void main(String[] args) {
		System.out.print("Emter a number: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(solution(n));
	}

	static int solution(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}
	/*
Emter a number: 23456
5

	 */
}
