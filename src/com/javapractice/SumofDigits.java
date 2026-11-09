package com.javapractice;

import java.util.*;
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n>0) {
			int dig = n%10;
			sum += dig;
			n /= 10;
		}
		System.out.println(sum);

	}

}
