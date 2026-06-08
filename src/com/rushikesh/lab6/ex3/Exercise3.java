package com.rushikesh.lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

    // Method to return number and its square
    public Map<Integer, Integer> getSquares(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        // Add number and square to map
        for (int num : arr) {
            map.put(num, num * num);
        }

        return map;
    }

    // Main method for testing
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5};

        Exercise3 obj = new Exercise3();

        Map<Integer, Integer> result = obj.getSquares(arr);

        System.out.println("Number and Squares: " + result);
    }
}
