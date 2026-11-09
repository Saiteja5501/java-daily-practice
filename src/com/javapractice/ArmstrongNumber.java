package com.javapractice;

import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int orig = n;
		int temp = n;
		int sum = 0;
		int count = 0;
		while(temp>0) {
			int dig = temp%10;
			count++;
			temp /= 10;
		}
		while(n>0) {
			int dig = n%10;
			sum += Math.powExact(dig, count);
			n /= 10;
		}
		if(sum==orig) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
	}

}
