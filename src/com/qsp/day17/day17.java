package com.qsp.day17;

class MergeOfArray {
	public static void main(String[] args) {
		int a[]= {9,2,6,0};
		int b[]= {4,5,6,1,3,7};
		 soluction(a,b);

	}

	static int[] soluction(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		int i=0;
		int j=0;
		int k=0;
		while (i<a.length && j<b.length) {
			c[k]=a[i];
			k++; i++;
			c[k]=b[j];
			k++; j++;
		}
		while(i<a.length) {
			c[k]=a[i]; i++; k++;
		}
		while(j<b.length) {
			c[k]=b[j]; j++; k++;
		}
		return c;

	}

}
