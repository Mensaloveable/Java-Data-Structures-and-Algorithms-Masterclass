package com.loveable.string.interviewQuestion;

import java.util.Arrays;

public class Permutation {
    /**
     * {@code @Question:} Check Permutation: Given two strings,write a method to decide if one is a permutation of the
     * other
     */
    public static boolean permute(String word1, String word2) {

        if (word1.length() != word2.length()) return false;

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
