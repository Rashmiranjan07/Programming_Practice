package com.qsp.day20;

import java.util.Arrays;

class ReverseSentense {
	public static void main(String[] args) {
		String s="java is easy";
		reverse(s);
		
	}
	static String reverse(String s) {
		String sa[]=s.split(" ");
		System.out.println(Arrays.toString(sa));
		return null;
	}

}
