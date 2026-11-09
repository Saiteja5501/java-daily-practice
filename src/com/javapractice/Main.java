package com.javapractice;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		int rev = 0;
		System.out.println("Menu:");
		System.out.println("Count of digits:");
		System.out.println("Sum of digits:");
		System.out.println("reverse a number:");
		System.out.println("palindrome:");
		System.out.println("prime number:");
		System.out.println("Exit");
		System.out.println("Select any option:");
		int choice = sc.nextInt();
		boolean isExit = true;
		switch(choice) {
		case 1 ->{
			while(num>0) {
				int dig = num%10;
				count++;
				num /= 10;
			}
			System.out.println("Count: " + count);
		}
		case 2 ->{
			while(num>0) {
				int dig = num%10;
				sum += dig;
				num /= 10;
			}
			System.out.println("Sum: " + sum);
		}
		case 3 ->{
			 rev = 0;
			while(num>0) {
				int dig = num%10;
				rev = rev*10+dig;
				num /= 10;
			}
			System.out.println("Reverse: " + rev);
		}
		case 4 ->{
			int orig = num;
			rev = 0;
			while(num>0) {
				int dig = num%10;
				rev = rev*10+dig;
				num /= 10;
			}
				if(rev==orig) {
					System.out.println(orig + " is a palindrome number");
				}
				else {
					System.out.println(orig + " is not a palindrome number");
				}
			
		}
		case 5 ->{
			boolean isPrime = true;
			if(num<=1) {
				return;
			}
			else {
				for(int i=2;i*i<=num;i++) {
					if(num%i==0) {
						isPrime = false;
						break;
					}
				}
			}
			if(isPrime) {
				System.out.println(num + " is a prime number");
			}
			else {
				System.out.println(num + " is not a prime number");
			}
		}
		case 6 ->{
			isExit = false;
		}
		default ->{
			System.out.println("Invalid choice");
		}
		}
	}

}
