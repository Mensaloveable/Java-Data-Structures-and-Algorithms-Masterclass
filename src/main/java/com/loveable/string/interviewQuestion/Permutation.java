package com.loveable.string.interviewQuestion;

import java.util.Collections;

public class Permutation {
    /**
     * {@code @Question:} Check Permutation: Given two strings,write a method to decide if one is a permutation of the
     * other
     */
    public static boolean permute(String word1, String word2) {
//        Collections.sort();
        String [] strArray = word1.split("");
        boolean flag = false;

        if(word1.length() != word2.length())
            return false;

        for (int i = 0; i < word1.length(); i++) {
            if (word2.contains(strArray[i])) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
