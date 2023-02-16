package com.loveable.string;

import com.loveable.string.interviewQuestion.OneAway;
import com.loveable.string.interviewQuestion.Permutation;
import com.loveable.string.interviewQuestion.URLify;
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

        System.out.println("***URLify***");
        str4 = "i love java ";
        String urlify = URLify.urlify(str4);
        System.out.println(urlify);

        System.out.println("***One Away***");
        boolean b = OneAway.hasOneOrZeroEdit("pale", "ple"); //true
        boolean b1 = OneAway.hasOneOrZeroEdit("pales", "pale"); //true
        boolean b2 = OneAway.hasOneOrZeroEdit("pale", "bale"); //true
        boolean b3 = OneAway.hasOneOrZeroEdit("pale", "bake"); //false
        System.out.println(b + " and " + b1 + " and " + b2 + " and " + b3);
    }
}
