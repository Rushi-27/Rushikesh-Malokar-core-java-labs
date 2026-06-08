package com.rushikesh.lab7.ex1.service;

import java.util.HashMap;
import java.util.Map;

import com.rushikesh.lab7.ex1.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    HashMap<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public void addEmployee(Employee emp) {

        String scheme = findInsuranceScheme(emp);

        emp.setInsuranceScheme(scheme);

        employeeMap.put(emp.getId(), emp);

        System.out.println("Employee Added Successfully.");
    }

    @Override
    public String findInsuranceScheme(Employee emp) {

        double salary = emp.getSalary();
        String designation = emp.getDesignation();

        if (salary > 5000 && salary < 20000
                && designation.equalsIgnoreCase("System Associate")) {

            return "Scheme C";
        }

        else if (salary >= 20000 && salary < 40000
                && designation.equalsIgnoreCase("Programmer")) {

            return "Scheme B";
        }

        else if (salary >= 40000
                && designation.equalsIgnoreCase("Manager")) {

            return "Scheme A";
        }

        else if (salary < 5000
                && designation.equalsIgnoreCase("Clerk")) {

            return "No Scheme";
        }

        else {
            return "No Scheme";
        }
    }

    @Override
    public void displayEmployeesByScheme(String scheme) {

        boolean found = false;

        for (Map.Entry<Integer, Employee> entry
                : employeeMap.entrySet()) {

            Employee emp = entry.getValue();

            if (emp.getInsuranceScheme()
                    .equalsIgnoreCase(scheme)) {

                System.out.println(emp);
                found = true;
            }
        }

        if (!found) {
            System.out.println(
                    "No employees found for scheme: " + scheme);
        }
    }

    @Override
    public void deleteEmployee(int empId) {

        if (employeeMap.containsKey(empId)) {

            employeeMap.remove(empId);

            System.out.println(
                    "Employee deleted successfully.");

        } else {

            System.out.println(
                    "Employee ID not found.");
        }
    }

    @Override
    public void displayAllEmployees() {

        if (employeeMap.isEmpty()) {

            System.out.println("No Employees Found.");

        } else {

            for (Employee emp : employeeMap.values()) {

                System.out.println(emp);
            }
        }
    }

    @Override
    public HashMap<Integer, Employee> getAllEmployees() {
        return employeeMap;
    }
}
