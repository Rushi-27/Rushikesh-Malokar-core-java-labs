package com.rushikesh.lab6.ex6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6 {

    // Method to return list of eligible voters
    public List<Integer> votersList(Map<Integer, LocalDate> personMap) {

        List<Integer> voters = new ArrayList<>();

        // Get current date
        LocalDate today = LocalDate.now();

        // Check age for each person
        for (Map.Entry<Integer, LocalDate> entry : personMap.entrySet()) {

            int id = entry.getKey();
            LocalDate dob = entry.getValue();

            int age = Period.between(dob, today).getYears();

            // Check voting eligibility
            if (age > 18) {
                voters.add(id);
            }
        }

        return voters;
    }

    // Main method for testing
    public static void main(String[] args) {

        Map<Integer, LocalDate> personMap = new HashMap<>();

        personMap.put(101, LocalDate.of(2000, 5, 10));
        personMap.put(102, LocalDate.of(2010, 8, 15));
        personMap.put(103, LocalDate.of(1998, 3, 25));

        Exercise6 obj = new Exercise6();

        List<Integer> result = obj.votersList(personMap);

        System.out.println("Eligible Voters IDs: " + result);
    }
}
