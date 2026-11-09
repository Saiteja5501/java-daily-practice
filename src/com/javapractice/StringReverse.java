package com.javapractice;

import java.util.*;
public class StringReverse {

	public static void anagram(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			System.out.println("not a anagram");
			return;
		}
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String str1 = Arrays.toString(ch1);
		String str2 = Arrays.toString(ch2);
		System.out.println(str1);
		System.out.println(str2);
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				System.out.println("not a anagram");
				return;
			}
		}
		System.out.println("anagram");
		
		
	}
	public static void main(String[] args) {
		String s1 = "adbc";
		String s2 = "dcba";
		anagram(s1,s2);
	}

}
