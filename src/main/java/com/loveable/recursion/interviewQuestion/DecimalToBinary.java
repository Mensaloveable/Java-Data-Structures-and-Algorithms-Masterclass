package com.loveable.recursion.interviewQuestion;

public class DecimalToBinary {
    public static Integer decimalToBinary(int decimal) {
        if(decimal == 0)
            return 0;
        return (decimal % 2 ) + 10  * decimalToBinary(decimal/2);
    }
}
