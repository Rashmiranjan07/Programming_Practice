package com.qsp.day16;

import java.util.Arrays;

//31-03-2026

class SumOfPrefix {
	public static void main(String[] args) {
		int a[] = { 9, 2, 6, 0, 4, 2 };
		soluction(a);
		System.out.println(Arrays.toString(a));
	}
	static void soluction(int a[]) {
		for (int i = 1; i < a.length; i++) {
			a[i] = a[i] + a[i - 1];
		}
	}
	/*
[9, 11, 17, 17, 21, 23]
	 */
}

// each unicode and their correcponding value 

class TypeConversion {
	public static void main(String[] args) {
		for( int i=0; i<=130; i++) {
			System.out.println(i+" "+(char)(i));
		}
	}
}


class DigitSum {
	public static void main(String[] args) {
		String s="h12e5l2l5o7";
		digitSum(s);
	}
	static int digitSum(String s) {
		int sum=0;
		for( int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if( ch>='0' && ch<='9') {
				System.out.println(ch);
				 sum = sum + (ch - '0'); // converted into '0' value is 48 
				                         // we can converted it into appropiate number by -48 / - '0'
			}
		}
		System.out.println(sum);
		return 0;
	}
	/*
1
2
5
2
5
7
22
	 */
}


class Vowelcount {
	public static void main(String[] args) {
		String s = "hello World";
		int res = NoOfVowel(s);
		System.out.println(res);
		System.out.println(s.length() - res);

	}
	static int NoOfVowel(String s) {
		int count = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		return count;
	}
	/*
	 * 3
	 * 8
	 */
}

class FindCharacter{
	public static void main(String[] args) {
		
	}
}

