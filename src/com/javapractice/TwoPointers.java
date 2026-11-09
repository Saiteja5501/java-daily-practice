package com.javapractice;

import java.util.*;
public class TwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		int left = 0, right = ch.length-1;
		boolean isPalindrome = true;
		while(left<right) {
			if(ch[left]!=ch[right]) {
				isPalindrome = false;
				break;
			}
			left++;
			right--;
		}
		if(isPalindrome) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

}
