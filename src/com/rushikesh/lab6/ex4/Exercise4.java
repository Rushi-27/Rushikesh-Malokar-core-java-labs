package com.rushikesh.lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {

    // Method to find medal eligible students
    public HashMap<Integer, String> getStudents(HashMap<Integer, Integer> marksMap) {

        HashMap<Integer, String> medalMap = new HashMap<>();

        // Check marks and assign medals
        for (Map.Entry<Integer, Integer> entry : marksMap.entrySet()) {

            int regNo = entry.getKey();
            int marks = entry.getValue();

            if (marks >= 90) {
                medalMap.put(regNo, "Gold");
            } 
            else if (marks >= 80) {
                medalMap.put(regNo, "Silver");
            } 
            else if (marks >= 70) {
                medalMap.put(regNo, "Bronze");
            }
        }

        return medalMap;
    }

    // Main method for testing
    public static void main(String[] args) {

        HashMap<Integer, Integer> studentMarks = new HashMap<>();

        studentMarks.put(101, 95);
        studentMarks.put(102, 82);
        studentMarks.put(103, 76);
        studentMarks.put(104, 65);

        Exercise4 obj = new Exercise4();

        HashMap<Integer, String> result = obj.getStudents(studentMarks);

        System.out.println("Medal Winners: " + result);
    }
}