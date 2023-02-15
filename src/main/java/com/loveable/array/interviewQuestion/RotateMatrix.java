package com.loveable.array.interviewQuestion;

public class RotateMatrix {
    public static int[][] rotate(int[][] array) {
        if (array.length == 0 || array.length != array[0].length)
            throw new IllegalArgumentException("Cannot rotate non-square array");
        int len = array.length;
        int[][] ans = new int[len][len];
        for (int i = len - 1, x = 0; i >= 0; i--, x++) {
            for (int j = len - 1, y = 0; j >= 0; j--, y++) {
                ans[x][y] = array[i][j];
            }
        }
        return ans;
    }
}
