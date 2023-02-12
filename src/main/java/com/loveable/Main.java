package com.loveable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int i = countWays(3);
        System.out.println(i);
    }

    public static int countWays(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return countWays(n-1) + countWays(n-2) + countWays(n-3);
        }
    }
}
