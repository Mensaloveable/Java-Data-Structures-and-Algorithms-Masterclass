package com.loveable.array;

import com.loveable.array.interviewQuestion.FindTheMissingNumber;
import com.loveable.array.interviewQuestion.MaxProductOfTwoIntegers;
import com.loveable.array.interviewQuestion.SearchInArray;
import com.loveable.array.interviewQuestion.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Find The Missing Number***");
        int[] array1 = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11};
        int[] array2 = {30, 5, 90, 6, 80, 82, 58, 3};
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
    }
}
