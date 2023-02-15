package com.loveable.string.interviewQuestion;

public class isUnique {
    /**
     * {@code @Question:} Is Unique: Implement an algorithm to determine if a string has all unique characters.
     * <p>
     * {@code @Try} What if you cannot use additional data structures?
     */
    public static boolean unique(String word) {
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (i == j)
                    continue;
                if (charArray[i] == charArray[j])
                    return false;
            }
        }
        return true;
    }
}
