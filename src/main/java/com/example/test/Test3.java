package com.example.test;

import java.util.Scanner;

public class Test3 {
    public static int count(int n) {
        int[] dp = new int[n + 1];
        if (n <= 2) {
            return n;
        } else {

            dp[0] = 1;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the numer of steps");
        int n = scanner.nextInt();
        int number = count(n);
        System.out.println("Number: " + number);
    }
}
