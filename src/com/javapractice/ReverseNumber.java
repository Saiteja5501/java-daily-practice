package com.javapractice;

import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  rev = 0;
		while(n>0) {
			int dig = n%10;
			rev = rev*10+dig;
			n /= 10;
		}
		System.out.println(rev);
		

	}

}
