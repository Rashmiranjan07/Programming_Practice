package com.qsp.day14;
import java.util.Arrays;

class UpdateArrayElement {
	public static void main(String[] args) {
		int a []= { 9,2,6,0,4,2,6,1 };
		System.out.println(Arrays.toString(a));
		replace( a ,2, 10);
		System.out.println(Arrays.toString(a));
		
	}
	  static void replace( int a[], int oldElement, int newElement) {
		  for(int i=0; i<a.length;i++) {
			  if(a[i]==oldElement) {
				  a[i]=newElement;
			  }
		  }
	  }
/*
[9, 2, 6, 0, 4, 2, 6, 1]
[9, 10, 6, 0, 4, 10, 6, 1]
 */
}

