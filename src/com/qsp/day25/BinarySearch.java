package com.qsp.day25;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a input");
		int n=sc.nextInt();
		int a[]= { 1,3,4,5,7,8,10,12};
	
		Sort(a);
		
	}
	static void Sort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	static int binarySearch( int a[]) {
		if( n)
		return 0;
		
	}

}
