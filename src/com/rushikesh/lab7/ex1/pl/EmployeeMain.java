package com.rushikesh.lab7.ex1.pl;

import java.util.Scanner;

import com.rushikesh.lab7.ex1.bean.Employee;
import com.rushikesh.lab7.ex1.service.EmployeeService;
import com.rushikesh.lab7.ex1.service.EmployeeServiceImpl;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeService service =
                new EmployeeServiceImpl();

        int choice;

        do {

            System.out.println("\n===== Employee Insurance System =====");

            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees By Scheme");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");

            System.out.println("Enter Your Choice:");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    Employee emp = new Employee();

                    System.out.println("Enter Employee ID:");
                    emp.setId(sc.nextInt());

                    sc.nextLine();

                    System.out.println("Enter Employee Name:");
                    emp.setName(sc.nextLine());

                    System.out.println("Enter Salary:");
                    emp.setSalary(sc.nextDouble());

                    sc.nextLine();

                    System.out.println("Enter Designation:");
                    emp.setDesignation(sc.nextLine());

                    service.addEmployee(emp);

                    break;

                case 2:

                    sc.nextLine();

                    System.out.println(
                            "Enter Insurance Scheme:");

                    String scheme = sc.nextLine();

                    service.displayEmployeesByScheme(scheme);

                    break;

                case 3:

                    System.out.println(
                            "Enter Employee ID to Delete:");

                    int id = sc.nextInt();

                    service.deleteEmployee(id);

                    break;

                case 4:

                    service.displayAllEmployees();

                    break;

                case 5:

                    System.out.println("Exiting Program...");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}