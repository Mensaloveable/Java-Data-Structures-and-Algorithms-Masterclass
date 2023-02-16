package com.loveable.string.interviewQuestion;

public class URLify {

    public static String urlify(String str) {
        str = str.trim();
        return str.replace(" ", "%20");
    }
}
