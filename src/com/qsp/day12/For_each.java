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
/*
432
*/
}


class x {
	public static void main(String[] args) {
		int a[] = { 5, 2, 9, 6, 2, 7 };
		 System.out.println(diffSum(a));
	}
	static int diffSum(int a[]) {
		int evenSum = 0;
		int oddSum = 0;
		for (int x : a) {
			if (x % 2 == 0) {

				evenSum += x;
			} else {
				oddSum += x;
			}
		}
		return oddSum - evenSum;
	}
	/*
11
	 */
}

class PrimeNumber {
	public static void main(String[] args) {
		int a[] = { 5, 2, 9, 6, 2, 7 };
		for (int x : a) {
			if (isPrime(x)) {
				System.out.println(x + " ");
			}
		}
	}
	static boolean isPrime(int n) {
		if (n <= 1)
			return false; // 1 and below are not prime
		for (int i = 2; i*i<=n; i++) {
			if (n % i == 0)
				return false; // Found a divisor
		}
		return true;
	}
/*
5 
2 
2 
7 
*/
}
