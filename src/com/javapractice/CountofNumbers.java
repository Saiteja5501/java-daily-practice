package com.javapractice;

import java.util.*;
public class CountofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		for(;n>0;n=n/10) {
			int dig = n%10;
			c++;
		}
		System.out.println(c);

	}

}
