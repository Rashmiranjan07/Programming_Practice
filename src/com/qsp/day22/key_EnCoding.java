package com.qsp.day22;

class key_EnCoding {
	public static void main(String[] args) {
		String s = "abcdefuvwxyz";
		String res = sol(s, 4);
		System.out.println(res);
	}

	static String sol(String s, int key) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			char temp = (char) (ch + key);
			if (temp > 'z') {
				int used = 'z' - ch; // calculate how many used
				int pending = key - used; // calculate how many pendinng
				temp = (char) (96 + pending);
			}
			res = res + temp;
		}
		return res;
	}

}
