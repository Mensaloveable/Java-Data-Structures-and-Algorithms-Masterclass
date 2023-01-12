package com.loveable.recursion;

public class Recursion {
    public static void main(String[] args) {
        int factorial5 = factorial(5);
        System.out.println(factorial5);

        int fibonacci8 = fibonacci(8);
        System.out.println(fibonacci8);
    }

    public static int factorial(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n<0) {
            return -1;
        }
        if (n==0 || n==1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}