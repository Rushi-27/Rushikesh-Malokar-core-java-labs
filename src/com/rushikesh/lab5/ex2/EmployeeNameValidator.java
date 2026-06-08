package com.rushikesh.lab5.ex2;
import java.util.Scanner;

public class EmployeeNameValidator {
	
	   public static void validateName(String firstName,
               String lastName)
throws InvalidNameException {

if (firstName == null || firstName.trim().isEmpty()
|| lastName == null || lastName.trim().isEmpty()) {

throw new InvalidNameException(
"First Name and Last Name cannot be blank.");
}

System.out.println("Valid Employee Name.");
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

try {

System.out.println("Enter First Name:");
String firstName = sc.nextLine();

System.out.println("Enter Last Name:");
String lastName = sc.nextLine();

validateName(firstName, lastName);

System.out.println(
"Employee Name: "
       + firstName + " " + lastName);

} catch (InvalidNameException e) {

System.out.println(
"Exception Occurred: " + e.getMessage());

} finally {

sc.close();
}
}

}
