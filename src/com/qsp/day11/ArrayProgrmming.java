package com.qsp.day11;

class CreateArray {
	public static void main(String[] args) {
//		int a[] = { 10, 12, 25, 8, 12 };
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		
		int a[]= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=25;
		a[3]=8;
		a[4]=12;
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
