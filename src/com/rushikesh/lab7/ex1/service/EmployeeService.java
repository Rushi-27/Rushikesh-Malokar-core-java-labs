package com.rushikesh.lab7.ex1.service;

import java.util.HashMap;

import com.rushikesh.lab7.ex1.bean.Employee;


public interface EmployeeService {

	    public void addEmployee(Employee emp);

	    public String findInsuranceScheme(Employee emp);

	    public void displayEmployeesByScheme(String scheme);

	    public void deleteEmployee(int empId);

	    public void displayAllEmployees();

	    public HashMap<Integer, Employee> getAllEmployees();
}


