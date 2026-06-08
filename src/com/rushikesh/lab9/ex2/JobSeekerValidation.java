package com.rushikesh.lab9.ex2;


import java.util.Scanner;

public class JobSeekerValidation {

    public static boolean validateUsername(String username) {

        // Check null or empty
        if (username == null) {
            return false;
        }

        // Check required suffix
        if (!username.endsWith("_job")) {
            return false;
        }

        // Remove "_job"
        String namePart = username.substring(0, username.length() - 4);

        // Check minimum length before "_job"
        if (namePart.length() >= 8) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = sc.nextLine();

        boolean result = validateUsername(username);

        System.out.println("Is valid username? " + result);

        sc.close();
    }
}
