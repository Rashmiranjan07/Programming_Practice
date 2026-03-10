package com.qsp.day2;

class pattern {

}
//package com.qsp.day2.pattern;

class Pattern1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print("*"); // *****
		}

	}
}

class Pattern2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Pattern3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

class Pattern4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 1 || i == 7 || j == 1 || j == 7 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}

class Pattern5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 1 || i == 7 || j == 1 || j == 7 || i + j == 7 + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
