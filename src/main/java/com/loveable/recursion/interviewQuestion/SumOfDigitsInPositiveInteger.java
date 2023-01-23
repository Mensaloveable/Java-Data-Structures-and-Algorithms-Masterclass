package com.loveable.recursion.interviewQuestion;

public class SumOfDigitsInPositiveInteger {

    public static Integer sumOfDigitsInPositiveInteger(Integer number) {
        if (number <= 0)
            return 0;
        return number % 10 + sumOfDigitsInPositiveInteger(number / 10);
    }
}
