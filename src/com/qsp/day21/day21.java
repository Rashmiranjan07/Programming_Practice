package com.qsp.day21;

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
