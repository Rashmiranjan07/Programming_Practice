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
