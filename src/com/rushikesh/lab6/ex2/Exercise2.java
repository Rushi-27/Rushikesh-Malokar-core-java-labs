package com.rushikesh.lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {

    // Method to count occurrences of characters
    public Map<Character, Integer> countChars(char[] arr) {

        Map<Character, Integer> map = new HashMap<>();

        // Count each character
        for (char ch : arr) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }

    // Main method for testing
    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c', 'a', 'b', 'a'};

        Exercise2 obj = new Exercise2();

        Map<Character, Integer> result = obj.countChars(arr);

        System.out.println("Character Counts: " + result);
    }
}