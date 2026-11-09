package com.javapractice;
import java.util.*;
public class Sai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int min = n%10;
		while(n>0) {
			int dig = n%10;
			if(dig>max) {
				max = dig;
			}
			if(dig<min) {
				min = dig;
			}
			n /= 10;
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

	}

}
