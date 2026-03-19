package com.qsp.day9;

class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println(isArmStrong(153));
	}
	
	static boolean isArmStrong(int n) {
		int digitCount=numberOfDigit(n); // method call number of digits
		int temp=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+power(rem,digitCount); // power sum
			n=n/10;
		}
		return temp==sum;
	}
	
	static int numberOfDigit(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	
	static int power(int x, int y) {
		
		
			
		}
	}

}
