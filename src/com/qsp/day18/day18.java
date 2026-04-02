package com.qsp.day18;

class FindKey {
	public static void main(String[] args) {
		String input = " abcdeabcghiabcdef";
		String key = "abc";

		int prev = input.length();
		input = input.replaceAll(key, "");
		System.out.println((prev - input.length()) / key.length());
	}

}

class FindKey2 {
	public static void main(String[] args) {
		String input = " abcdeabcghiabcdefabc";
		String key = "abc";

		soluction(input, key);
	}
	static void soluction(String input, String key) {
		System.out.println(input.length());
		String temp = input.replace(key, "");
		System.out.println(temp.length());
		int removed = input.length()-temp.length();
		System.out.println(removed);
		System.out.println(removed / key.length());
	}
	/*
21
9
12
4
	 */

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
	static boolean isPanagram(String s) {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (s.indexOf(ch) == -1) {
				return false;
			}
		}

		return true;

	}
/*
The given string is a Pangram.

 */
}
