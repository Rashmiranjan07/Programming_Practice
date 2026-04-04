package com.qsp.day20;

import java.util.Arrays;

class ReverseSentense {
	public static void main(String[] args) {
		String s = "java is easy";
		System.out.println(reverse(s));
	}

	static String reverse(String s) {
		String sa[] = s.split(" ");
		System.out.println(Arrays.toString(sa));
		String res = " ";
		for (int i = sa.length - 1; i >= 0; i--) {
			res = res + sa[i];
			if (i == 0) {
				continue;
			}
			res = res + " ";
		}
		return res;
	}
	/*
[java, is, easy]
 easy is java
	 */
}


class ReverseWordInString {
	public static void main(String[] args) {
		String s = "Java full stack course";
		String res=reverse(s);
		System.out.println(res);
		

	}

	static String reverse(String s) {
		String sa[] = s.split(" ");
		System.out.println(Arrays.toString(sa));
		String res = "";
		for (int i = 0; i < sa.length; i++) {
			String temp = reverseWords(sa[i]);
			res = res + temp;
			res = res + " ";
		}
		return res;
	}

	static String reverseWords(String word) {
		char ch[] = word.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}

		return new String(ch);

	}
/*
[Java, full, stack, course]
avaJ lluf kcats esruoc 
 */
}



class AllSubstrings {
    public static void main(String[] args) {
        String s = "malayalam";
        printSubstrings(s);
    }

    static void printSubstrings(String s) {
        int n = s.length();

        for (int len = 1; len <= n; len++) {   // substring length
            System.out.print(len + " ln substring - ");
            
            for (int i = 0; i <= n - len; i++) {
                String sub = s.substring(i, i + len);
                System.out.print(sub + " ");
            }
            
            System.out.println();
        }
    }
}

