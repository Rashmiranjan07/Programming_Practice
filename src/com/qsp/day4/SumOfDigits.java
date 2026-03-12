package com.qsp.day4;

class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sum(10));
	}

	static int sum(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}
	/* 55 */
}


class SumofDigits2 {
	public static void main(String[] args) {
		System.out.println(sum(11));

	}

	static int sum(int n) {
		int res = 0;
		for (int i = n; i >= 1; i--) {
			res += i;
		}
		return res;
	}
	/* 66 */
}



// By Recursion formulae 
class SumofDigits3 {
	public static void main(String[] args) {
		System.out.println(sum(10));

	}

	static int sum(int n) {
		if (n == 0)
			return 0;
		return n + sum(n - 1);
	}
	/* 55 */
}
