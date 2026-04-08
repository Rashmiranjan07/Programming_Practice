package com.qsp.day23;

class SumOfDiagonal {
	public static void main(String[] args) {
		int a[][]= {
				{4,2,6,1},
				{9,2,5,1},
				{2,3,9,1},
				{8,3,5,4}
				};
		int k=0; 
		int j=a.length-1;
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i][k];
			sum = sum + a[i][j];
			k++;
			j--;
		}
		System.out.println(sum);
	}
/*
36
 */
}


class SumOfMatrixDiagonals {
	public static void main(String[] args) {
		int a[][]= {
				{4,2,6},
				{9,2,5},
				{2,3,9}
				};
		int k=0; 
		int j=a.length-1;
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i][k];
			if (a.length % 2 == 1 && k == a.length / 2) {
				k++;
				j--;
				continue;
			}
			sum = sum + a[i][j];
			k++;
			j--;
		}
		System.out.println(sum);
	}
/*
23
 */
}