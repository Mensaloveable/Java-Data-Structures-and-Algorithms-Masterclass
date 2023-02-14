package com.loveable.array.interviewQuestion;

public class Permutation {
    public static boolean permute(int[] array1, int[] array2) {
        int sumArray1 = 0, sumArray2 = 0;
        int productArray1 = 1, productArray2 = 1;

        for (int num : array1) {
            sumArray1 += num;
            productArray1 *= num;
        }

        for (int num : array2) {
            sumArray2 += num;
            productArray2 *= num;
        }

        return sumArray1 == sumArray2 && productArray1 == productArray2;
    }
}
