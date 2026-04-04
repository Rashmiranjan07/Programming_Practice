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
       for(int i=0; i<s.length();i++) {
    	   for(int j=i+1; j<=s.length();j++) {
    		   System.out.println(s.substring(i,j));
    	   }
       }
        
    }
    /*
m
ma
mal
mala
malay
malaya
malayal
malayala
malayalam
a
al
ala
alay
alaya
alayal
alayala
alayalam
l
la
lay
laya
layal
layala
layalam
a
ay
aya
ayal
ayala
ayalam
y
ya
yal
yala
yalam
a
al
ala
alam
l
la
lam
a
am
m

     */
}



