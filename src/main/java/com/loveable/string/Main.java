package com.loveable.string;

import com.loveable.string.interviewQuestion.Permutation;
import com.loveable.string.interviewQuestion.UniqueString;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Unique String***");
        String str1 = "question";
        String str2 = "banana";

        boolean unique1 = UniqueString.unique(str1);
        boolean unique2 = UniqueString.unique(str2);

        System.out.println(str1 + " is " + (unique1 ? "" : "not ") + "Unique");
        System.out.println(str2 + " is " + (unique2 ? "" : "not ") + "Unique");

        System.out.println("***Permutation***");
        String str3 = "deal";
        String str4 = "lead";

        boolean permute1 = Permutation.permute(str3, str4);
        boolean permute2 = Permutation.permute(str2, str4);

        System.out.println(str3 + " and " + str4 + (permute1 ? "" : " does not") + " permute");
        System.out.println(str2 + " and " + str4 + (permute2 ? "" : " does not") + " permute");
    }

}
