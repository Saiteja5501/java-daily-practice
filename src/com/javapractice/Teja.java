package com.javapractice;

import java.util.*;

public class Teja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {

            int a = n % 10;
            boolean isPrime = true;

            if (a <= 1) {
                isPrime = false;
            }
            else {
                for (int i = 2; i * i <= a; i++) {

                    if (a % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(a);
            }

            n = n / 10;
        }
    }
}