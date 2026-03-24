package com.qsp.day12;

class For_each {
	public static void main(String[] args) {
		int a[]= {9,2,0,6,4};
		for( int x: a) {
			System.out.println(x);
		}
	}

}

class SumOfElements {
	public static void main(String[] args) {
		int a[]= {9,2,0,6,4,1};
		int sum = 0;
		for (int num : a) {
		    sum += num;
		}
		System.out.println(sum);
	}
/*
22
*/
}


class multiOfElements{
	public static void main(String[] args) {
		int a[]= {9,2,6,4,1};
		int mult = 1;
		for (int num : a) {
		    mult *= num;
		}
		System.out.println(mult);
	}
}