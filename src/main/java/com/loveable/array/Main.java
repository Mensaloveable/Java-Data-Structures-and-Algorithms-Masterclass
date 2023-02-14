package com.loveable.array;

import com.loveable.array.interviewQuestion.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Find The Missing Number***");
        int[] array1 = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11};
        int[] array2 = {30, 5, 90, 6, 80, 82, 58, 3};
        int[] array3 = {30, 5, 90, 6, 80, 6, 82, 58, 3};
        int missing = FindTheMissingNumber.missingNumber(array1);
        System.out.println("Missing number is: " + missing);

        System.out.println("***Two Sum***");
        int target = 18;
        int[] pair = TwoSum.pair(array1, target);
        System.out.println("Elements at indexes " + Arrays.toString(pair) + " summed up equals " + target);

        System.out.println("***Search In Array***");
        target = 6;
        int search = SearchInArray.search(array1, target);
        System.out.printf("Element %d is at index %d%n", target, search);
        // another example
        target = 5;
        int search2 = SearchInArray.search(array1, target);
        System.out.printf("Element %d is at index %d%n", target, search2);

        System.out.println("***Max Product Of Two Integers***");
        int max1 = MaxProductOfTwoIntegers.maxProduct(array1);
        int max2 = MaxProductOfTwoIntegers.maxProduct(array2);
        System.out.println("The maximum product in array " + Arrays.toString(array1) + " is " + max1);
        System.out.println("The maximum product in array " + Arrays.toString(array2) + " is " + max2);

        System.out.println("***Is Unique***");
        boolean unique1 = IsUnique.unique(array1);
        boolean unique2 = IsUnique.unique(array3);
        System.out.println("Array " + Arrays.toString(array1) + " is " + (unique1 ? "" : "not ") + "unique");
        System.out.println("Array " + Arrays.toString(array3) + " is " + (unique2 ? "" : "not ") + "unique");

        System.out.println("***Permutation***");
        array1 = new int[]{4, 6, 7, 8, 9, 10, 11};
        array2 = new int[]{9, 4, 10, 6, 8, 11, 7};
        array3 = new int[]{9, 4, 5, 5, 6, 8, 11, 7};
        boolean permute1 = Permutation.permute(array1, array2);
        boolean permute2 = Permutation.permute(array1, array3);
        System.out.println("Array " + Arrays.toString(array1) + " and " + Arrays.toString(array2) + " " + (permute1 ? "permute" : "does not permute"));
        System.out.println("Array " + Arrays.toString(array1) + " and " + Arrays.toString(array3) + " " + (permute2 ? "permute" : "does not permute"));
    }
}
