package com.loveable.recursion.interviewQuestion;

public class GCD {
    public static Integer gcd(Integer a, Integer b) {
        if (a < 0 || b < 0)
            return -1;
        if (a == 0 || b == 0)
            return a + b;
        return gcd(b, a % b);
    }
}
