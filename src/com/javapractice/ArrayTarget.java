package com.javapractice;

import java.util.*;
public class ArrayTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int left = 0, right = n-1;
		int sum = 0;
		while(left<right) {
			sum = arr[left]+arr[right];
			if(sum==target) {
				System.out.println(arr[left] + " " + arr[right]);
				break;
			}
			else if(sum>target) {
				right--;
			}
			else {
				left++;
			}
		}
		

	}

}
