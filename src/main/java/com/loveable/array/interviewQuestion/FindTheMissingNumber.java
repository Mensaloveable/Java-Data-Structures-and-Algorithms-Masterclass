package com.loveable.array.interviewQuestion;

public class FindTheMissingNumber {
    public static int missingNumber(int[] array) {
        int length = array.length;
        int normalSum = (length +1) * (length + 2) / 2;
//        int normalSum = 0;
        int currentSum = 0;
        for (int num : array) {
            currentSum += num;
        }
        return normalSum-currentSum;
    }
}
