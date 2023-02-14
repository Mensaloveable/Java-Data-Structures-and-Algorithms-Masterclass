package com.loveable.array.interviewQuestion;

public class IsUnique {
    public static boolean unique(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j)
                    continue;
                if (array[i] == array[j])
                    return false;
            }
        }
        return true;
    }
}
