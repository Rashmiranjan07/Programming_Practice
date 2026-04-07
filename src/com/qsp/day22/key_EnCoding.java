package com.qsp.day22;

class key_EnCoding {
	public static void main(String[] args) {
		String s="abcdef";
		sol(s,4);
	}
	static String sol(String s, int key) {
		for(int i=0; i<s.length();i++) {
			char ch=s.charAt(i);
			System.out.println(ch);
		}
		return null;
	}

}
