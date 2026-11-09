package com.javapractice;
public class Main1 {
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static double cToF(double celsius) {
		double n = (celsius*9/5)+32;
		return n;
	}
	public static int countVowels(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
				count++;
			}
		}
		return count;
	}
	public static String format(double salary) {
		return "$" + salary;
	}
	public static String format(double salary, String currencySymbol) {
		return currencySymbol + salary;
	}
	public static int getMax(int a, int b) {
		if(a>b) {
			return a;
		}
		return b;
	}
	public static int getMax(int a, int b, int c) {
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		return c;
	}
	public static void reverse(int[] arr) {
		int start =  0;
		int end = arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static int getMinIndex(int[] a) {
		if(a==null || a.length==0) {
			return -1;
		}
		int min = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<a[min]) {
				min = i;
			}
		}
		return min;
	}
	
	public static int[] merge(int[] ar, int[] b) {
		int[] temp = new int[ar.length + b.length];
		for(int i=0;i<ar.length;i++) {
			temp[i] = ar[i]; 
		}
			for(int i=0;i<b.length;i++) {
				temp[ar.length+i] = b[i];
			}
		
		return temp;
	}
	
	public static boolean isPalindrome(String text) {
		char[] ch = text.toCharArray();
		int start = 0;
		int end = ch.length-1;
		while(start<end) {
			if(ch[start]!=ch[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static int getFibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int a = 0;
		int b = 1;
		for(int i=2;i<=n;i++) {
			int c = a+b;
			a=b;
			b=c;
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.println(isPrime(5));
		System.out.println(cToF(30));
		System.out.println(countVowels("saiteja"));
		System.out.println(format(50000.0));
		System.out.println(format(50000.0, "₹"));
		System.out.println(getMax(2,3));
		System.out.println(getMax(10,20,30));
		int[] arr = {10,20,30,40,50};
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int[] a = {2,3,4,1};
		System.out.println(getMinIndex(a));
		
		int[] ar = {10,20,30};
		int[] b = {40,50,60};
		int[] temp = merge(ar,b);
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		System.out.println(isPalindrome("madam"));
		System.out.println(getFibonacci(10));
	}
}