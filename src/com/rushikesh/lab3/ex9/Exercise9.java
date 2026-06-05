package com.rushikesh.lab3.ex9;
import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class Exercise9 {
	
	static void findDuration(LocalDate date) {
		
		LocalDate currentDate = LocalDate.now();
		
		Period diff = Period.between(date,currentDate);
		
		System.out.println("Difference is: ");
		System.out.println(diff.getYears()+ "Years");
		System.out.println(diff.getMonths()+ "Months");
		System.out.println(diff.getDays()+ "Days");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter date (y-m-d): ");
		
		String date = sc.nextLine();
		
		LocalDate inputDate = LocalDate.parse(date);
		
		findDuration(inputDate);
		
		sc.close();
	}
	

}
