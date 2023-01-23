package com.loveable.recursion;

import com.loveable.recursion.interviewQuestion.SumOfDigitsInPositiveInteger;

public class Recursion {
    public static void main(String[] args) {

        //Factorial
        int factorial5 = Factorial.factorial(5);
        System.out.println("The factorial of 5 is " + factorial5);

        //Fibonacci
        int fibonacci8 = Fibonacci.fibonacci(8);
        System.out.println("Fibonacci of 8 = " + fibonacci8);

        //Sum of Digits of a positive integer
        int sum = SumOfDigitsInPositiveInteger.sumOfDigitsInPositiveInteger(54);
        System.out.printf("Sum of digits of %d is %d%n", 54, sum);
    }

}