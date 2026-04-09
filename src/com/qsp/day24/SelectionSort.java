package com.qsp.day24;

import java.util.Arrays;

class SelectionSort {
	public static void main(String[] args) {
		int a[] = { 9,2,4,1,6,3,2,8 };
		soluction(a);
	}
	static void soluction(int a[]) {
		for(int i=0; i<a.length-1;i++) {
			int min=i;
			for(int j=i+1; j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
/*
[1, 2, 2, 3, 4, 6, 8, 9]
 */
}
