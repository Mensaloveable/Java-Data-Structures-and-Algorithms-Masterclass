package com.loveable.recursion;

import com.loveable.recursion.interviewQuestion.DecimalToBinary;
import com.loveable.recursion.interviewQuestion.GCD;
import com.loveable.recursion.interviewQuestion.PowerOfANumber;
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
        int sum = SumOfDigitsInPositiveInteger.sumOfDigitsInPositiveInteger(112);
        System.out.printf("Sum of digits of %d is %d%n", 112, sum);

        //Power of a number
        int ans = PowerOfANumber.power(2,0);
        System.out.println(ans);

        //GCD
        int gdc = GCD.gcd(48, 18);
        System.out.println(ans);

        //Decimal to Binary
        int binary = DecimalToBinary.decimalToBinary(4);
        System.out.println(ans);
    }

}