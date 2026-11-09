package com.javapractice;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}

	}

}
