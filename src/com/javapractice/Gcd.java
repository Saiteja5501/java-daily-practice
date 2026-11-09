package com.javapractice;

import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = 1;
		int c = (a<b)?a:b;
		for(int i=1;i<=c;i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
