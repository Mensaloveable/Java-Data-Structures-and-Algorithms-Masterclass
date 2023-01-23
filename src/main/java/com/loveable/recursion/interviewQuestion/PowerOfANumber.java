package com.loveable.recursion.interviewQuestion;

public class PowerOfANumber {
    public static Integer power(Integer base, Integer exp) {
        if(exp < 0)
            return -1;
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }
}
