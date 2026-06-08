package com.rushikesh.lab5.ex3.pl;
import java.util.Scanner;

import com.rushikesh.lab5.ex3.exception.EmployeeException;

public class EmployeeSalaryValidator {
	

	    // Method to validate salary
	    public static void validateSalary(double salary)
	            throws EmployeeException {

	        if (salary < 3000) {

	            throw new EmployeeException(
	                    "Salary is below 3000.");

	        } else {

	            System.out.println(
	                    "Salary is valid.");
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {

	            System.out.println("Enter Employee ID:");
	            int empId = sc.nextInt();

	            sc.nextLine();

	            System.out.println("Enter Employee Name:");
	            String empName = sc.nextLine();

	            System.out.println("Enter Employee Salary:");
	            double salary = sc.nextDouble();

	            // Validate salary
	            validateSalary(salary);

	            System.out.println("\nEmployee Details");
	            System.out.println("---------------------");

	            System.out.println("Employee ID     : " + empId);
	            System.out.println("Employee Name   : " + empName);
	            System.out.println("Employee Salary : " + salary);

	        } catch (EmployeeException e) {

	            System.out.println(
	                    "Exception Occurred: " + e.getMessage());

	        } catch (Exception e) {

	            System.out.println("Invalid Input.");

	        } finally {

	            sc.close();
	        }
	    }
	}

