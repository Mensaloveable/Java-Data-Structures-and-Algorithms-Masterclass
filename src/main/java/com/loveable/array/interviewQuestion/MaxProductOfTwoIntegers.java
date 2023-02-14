package com.loveable.array.interviewQuestion;

public class MaxProductOfTwoIntegers {
    public static int maxProduct(int[] array) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j)
                    continue;
                int temp = array[i] * array[j];
                if(temp > maxProduct)
                    maxProduct = temp;
            }
        }
        return maxProduct;
    }
}
