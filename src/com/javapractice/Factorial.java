package com.javapractice;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prod = 1;
		while(n>0) {
			prod *= n;
			n--;
		}
		System.out.println(prod);
	}

}
