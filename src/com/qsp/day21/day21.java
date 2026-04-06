package com.qsp.day21;

import java.util.Scanner;

class ReverseSentense {
	public static void main(String[] args) {
		String s = "malayalam";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String temp = s.substring(i, j);
				if (isPalindrome(temp)) {
					System.out.println(temp);
				}
			}
		}
	}
	static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	/*
m
malayalam
a
ala
alayala
l
layal
a
aya
y
a
ala
l
a
m
	 */
}


class ReverseSentenseMaxLength {
	public static void main(String[] args) {
		String s = "bamalayalamax";
		String max="";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String temp = s.substring(i, j);
				if (isPalindrome(temp) && temp.length()>max.length()) {
					max=temp;
				}
			}
		}
		System.out.println(max);
	}
	static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
/*
 amalayalama
 */
}

// Using loop 
class Fibonacci{
	public static void main(String[] args) {
		Fibonacci(10);
	}
	static  void  Fibonacci(int n) {
		int a=0;
		int b=1;
		for( int i=1; i<=n; i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
		
	}
}

class Fibonacci2 {
	public static void main(String[] args) {
		fib(0, 1, 1, 10);
	}
	static void fib(int a, int b, int count, int limit) {
		if (count > limit)
			return;
		System.out.println(a);
		fib(b, a + b, ++count, limit);
	}
	/*
0
1
1
2
3
5
8
13
21
34
	 */
}