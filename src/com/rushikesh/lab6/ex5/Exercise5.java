package com.rushikesh.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {

    // Method to find second smallest element
    public int getSecondSmallest(int[] arr) {

        // Convert array to ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        // Sort the list
        Collections.sort(list);

        // Return second smallest element
        return list.get(1);
    }

    // Main method for testing
    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 2, 15};

        Exercise5 obj = new Exercise5();

        int result = obj.getSecondSmallest(arr);

        System.out.println("Second Smallest Element: " + result);
    }
}
