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



class NumOfDigits2 {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(solution(n));
	}

	static int solution(int n) {
		return (n + "").length();
	}
}

//======================================================
class NumOfDigits3 {
	public static void main(String[] args) {
		System.out.println("Enter a numbers : ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(solution(n));
	}

	static int solution(int n) {
		if (n <= 9)
			return 1;
		return 1 + solution(n / 10);
	}
}
/*
Emter a number: 23456
5

 */