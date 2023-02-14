package com.loveable.array.interviewQuestion;

public class SearchInArray {
    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == target)
                return i;
        }
        return -1;
    }
}
