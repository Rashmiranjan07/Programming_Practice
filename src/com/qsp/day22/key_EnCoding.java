package com.qsp.day22;

class key_EnCoding {
	public static void main(String[] args) {
		String s = "abcdefuvwxyz";
		sol(s, 4);
	}

	static String sol(String s, int key) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			char temp = (char) (ch + key);
			if (temp > 'z') {
				int used = 'z' - ch;  //calculate how many used
				int pending = key - used; // calculate how many pendinng
				temp = (char) (96 + pending);
			}
			System.out.println(ch + "->" + temp);
		}
		return null;
	}
	/*
a->e
b->f
c->g
d->h
e->i
f->j
u->y
v->z
w->a
x->b
y->c
z->d
	 */

}
