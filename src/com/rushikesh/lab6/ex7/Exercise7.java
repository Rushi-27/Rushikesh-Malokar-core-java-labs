package com.rushikesh.lab6.ex7;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise7 {

    // Method to reverse numbers and return sorted array
    public int[] getSorted(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        // Reverse each number
        for (int num : arr) {

            String str = Integer.toString(num);

            String reversed = new StringBuilder(str).reverse().toString();

            int revNum = Integer.parseInt(reversed);

            list.add(revNum);
        }

        // Sort the reversed numbers
        Collections.sort(list);

        // Convert list back to array
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {

        int[] arr = {12, 45, 63, 98};

        Exercise7 obj = new Exercise7();

        int[] result = obj.getSorted(arr);

        System.out.println("Sorted Reversed Array:");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
