package com.loveable.array.interviewQuestion;

public class TwoSum {

    /**
     * {@code @expectation} return the indexes of two elements such that they add up to target
     * <p>
     * {@code @hint} no negative integer in the array
     * <p>
     * {@code @hint} only distinct pair is accepted
     * <p>
     * {@code @hint} the order of the answer does not matter
     */

    public static int[] pair(int[] array, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || array[i] == array[j])
                    continue;
                if (array[i] + array[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}
