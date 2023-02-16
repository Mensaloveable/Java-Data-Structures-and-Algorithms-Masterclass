package com.loveable.string.interviewQuestion;

public class OneAway {
/**
 * {@code @Question:}One Away: There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 */
    public static boolean hasOneOrZeroEdit (String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len2 - len1 > 1 || len1 - len2 > 1)
            return false;

        String[] strArray1 = str1.split("");
        String[] strArray2 = str2.split("");

        int diff = 0;
        for (int i = 0; i < len2; i++) {
            if(!str1.contains(strArray2[i])) {
                diff++;
            }
        }

        return diff==1 || diff == 0;
    }
 }
