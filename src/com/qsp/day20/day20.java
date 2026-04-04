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
		String res=" ";
		for(int i=sa.length-1;i>=0;i--) {
			res=res+sa[i];
			if(i==0) {
				continue;
			}
			res=res+ " ";
		}
		return res;
	}
}
