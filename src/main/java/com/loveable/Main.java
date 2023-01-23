package com.loveable;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



    }

    class Pair {
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public ArrayList<Pair> findClosestPair(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        ArrayList<Pair> closestPairs = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int closest = Integer.MAX_VALUE;
            for (int j = -1; j <= 1; j++) {
                int diff = curr + j;
                if (map.containsKey(diff) && Math.abs(diff - curr) < closest) {
                    closest = Math.abs(diff - curr);
                    int index = map.get(diff);
                    if (index != i && closest < minDiff) {
                        minDiff = closest;
                        closestPairs.clear();
                        closestPairs.add(new Pair(curr, diff));
                    }
                }
            }
        }
        return closestPairs;
    }
}