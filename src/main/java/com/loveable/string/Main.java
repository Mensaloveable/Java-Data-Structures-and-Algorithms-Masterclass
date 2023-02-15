package com.loveable.string;

import com.loveable.string.interviewQuestion.UniqueString;

public class Main {
    public static void main(String[] args) {
        String str1 = "question";
        String str2 = "banana";

        boolean unique1 = UniqueString.unique(str1);
        boolean unique2 = UniqueString.unique(str2);

        System.out.println(str1 + " is " + (unique1 ? "" : "not ") + "Unique");
        System.out.println(str2 + " is " + (unique2 ? "" : "not ") + "Unique");
    }

}
