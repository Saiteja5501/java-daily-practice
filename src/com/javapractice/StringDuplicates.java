package com.javapractice;

import java.util.*;
public class StringDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		boolean[] vis = new boolean[ch.length];
		String res = "";
		for(int i=0;i<ch.length;i++) {
			if(vis[i]) {
				continue;
			}
			res = res+ch[i];
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					vis[j] = true;
				}
			}
		}
		System.out.println(res);
	}

}
