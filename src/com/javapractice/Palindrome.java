package com.javapractice;

import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int orig = n;
		int rev =  0;
		while(n>0) {
			int dig = n%10;
			rev = rev*10+dig;
			n /= 10;
		}
		if(rev==orig) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}

	}

}
