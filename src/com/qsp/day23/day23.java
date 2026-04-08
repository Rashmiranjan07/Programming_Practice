package com.qsp.day23;

import java.util.Arrays;

class TwoDArray {
	public static void main(String[] args) {
		int n=5;
		int a[][]=new int[n][];
		for( int i=0; i<=a.length; i++) {
			a[i]=new int[i+1];
		}
		for(int x[]:a) 
			System.out.println(Arrays.toString(x));
		}
	}



