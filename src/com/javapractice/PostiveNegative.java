package com.javapractice;
import java.util.*;
public class PostiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0) {
			System.out.println(n + " is zero");
		}
		else if(n>0) {
			System.out.println(n + " is a postive number");
		}
		else {
			System.out.println(n + " is a negative number");
		}

	}

}
