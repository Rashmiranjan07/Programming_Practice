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

}
