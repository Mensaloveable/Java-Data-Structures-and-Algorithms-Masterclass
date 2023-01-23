package com.loveable.recursion.interviewQuestion;

public class SumOfDigitsInPositiveInteger {

    public static Integer sumOfDigitsInPositiveInteger(Integer number) {
        if (number < 10)
            return number;
        return sumOfDigitsInPositiveInteger(number % 10 + sumOfDigitsInPositiveInteger(number / 10));
    }
}
