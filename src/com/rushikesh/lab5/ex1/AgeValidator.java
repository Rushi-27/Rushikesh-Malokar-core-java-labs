package com.rushikesh.lab5.ex1;


import java.util.Scanner;

public class AgeValidator {

    // Method to validate age
    public static void validateAge(int age)
            throws InvalidAgeException {

        if (age <= 15) {
            throw new InvalidAgeException(
                    "Age should be above 15.");
        } else {
            System.out.println(
                    "Valid age. Access granted.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter Age:");
            int age = sc.nextInt();

            validateAge(age);

        } catch (InvalidAgeException e) {

            System.out.println(
                    "Exception Occurred: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid Input.");

        } finally {

            sc.close();
        }
    }
}
