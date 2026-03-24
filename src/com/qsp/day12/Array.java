package com.qsp.day12;

import java.util.Scanner;

class Array {
	public static void main(String[] args) {
		int a []= new int [5];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<a.length;i++) {
			System.out.println("Enter element no "+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println("------------");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
