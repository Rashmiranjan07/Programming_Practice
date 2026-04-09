package com.qsp.day24;

import java.util.Arrays;

class MaxElementLast {
	public static void main(String[] args) {
		int a[] = { 9, 2, 4, 1, 6, 3, 2, 8 };
soluction(a);
	}
	
	static void soluction(int a[]) {
		for( int j=0; j<a.length; j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
		}
System.out.println(Arrays.toString(a));
	}
}
