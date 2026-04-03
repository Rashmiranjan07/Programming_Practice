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
		String str = "The quick brown fox jumps over the lazy dog";

		if (isPanagram(str)) {
			System.out.println("The given string is a Pangram.");
		} else {
			System.out.println("The given string is NOT a Pangram.");
		}
	}

	static boolean isPanagram(String str) {
		boolean a[] = new boolean[26];
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				a[ch - 'a'] = true;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (!a[i]) {
				return false;
			}

		}
		return true;
	}
}


