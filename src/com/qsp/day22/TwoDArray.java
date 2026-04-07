package com.qsp.day22;

class TwoDArray {
	public static void main(String[] args) {
		int a[][]= {
				{2,3,4},
				{6,2,1,7},
				{5,2,1}
		};
		for(int b[]:a) {
			for(int x:b) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
	/*
2 3 4 
6 2 1 7 
5 2 1 
	 */
}
