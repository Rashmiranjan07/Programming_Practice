package com.qsp.day4;

class ActivationRecord {
	public static void main(String[] args) {
		m1();
		System.out.println("main");
	}

	static void m1() {
		m2();
		System.out.println("m1");
	}

	static void m2() {
		m3();
		System.out.println("m2");
	}

	static void m3() {

		System.out.println("m3");
	}
	/*
	 * m3
	 * m2
	 * m1
	 * main
	 */
}
