package com.qsp.day19;

import java.util.Arrays;

// Write a java program to find out  the frequency of each character in a string 
//( the string only contains lowercase character ) 

class FrequencyOfChar {
	public static void main(String[] args) {
		int a[] = new int[26];
		solution("abcdefabghkij");

	}

	static void solution(String s) {
		int a[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			a[index]++;
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			System.out.println((char) (i + 'a') + " " + a[i]);
		}
	}

}


class Panagram {
	public static void main(String[] args) {
		String str = "abcd";

		if (isPanagram(str)) {
			System.out.println("The given string is a Pangram.");
		} else {
			System.out.println("The given string is NOT a Pangram.");
		}
	}

	static boolean isPanagram(String str) {
		int a[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 'a';
			a[index]++;

		}
		for (int x : a) {
			if (x == 0) {
				return false;
			}
		}
		return true;
	}
	/*
The given string is NOT a Pangram.
	 */
}

class FrequencyNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 6, 1, 9, 2, 6, 4, 8 };
		findFrec(arr);
	}
	static void findFrec(int[] arr) {
		int[] freqArr = new int[1001]; 
		for (int i = 0; i < arr.length; i++) {
			freqArr[arr[i]]++;
		}
		for (int j = 0; j < freqArr.length; j++) {
			if (freqArr[j] == 0) {
				continue;
			}
			System.out.println(j + " --> " + freqArr[j]);
		}
/*
 1 --> 1
2 --> 2
4 --> 2
6 --> 2
8 --> 1
9 --> 1
 */
	}
}


class FrequencyNumber2 {
	public static void main(String[] args) {
		int[] a = { 4, 2, 6, 1, 9, 2, 6, 4, 8 };
		findFrec(a);
	}
	static void findFrec(int[] a) {
		int[] f = new int[1001]; 
		for (int i = 0; i < a.length; i++) {
			int index=a[i];
			f[index]++;
		}
		for (int i = 0; i < f.length; i++) {
			if (f[i] == 0) {
				continue;
			}
			System.out.println(i + " --> " + f[i]);
		}
/*
 1 --> 1
2 --> 2
4 --> 2
6 --> 2
8 --> 1
9 --> 1
 */
	}
}
