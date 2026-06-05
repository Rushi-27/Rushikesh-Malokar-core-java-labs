package com.rushikesh.lab1.ex7;
import java.util.Scanner;

public class Exercise7 {
	
	static boolean checknumber(int n) {
		int lastdigit = n % 10;
		n = n/10;
		
		while (n>0) {
			int currentdigit = n%10;
			
			if (currentdigit > lastdigit) {
				return false;
			}
			lastdigit = currentdigit;
			n = n/10;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean result = Exercise7.checknumber(num);
		if (result) {
			System.out.println("Increasing");
		} else {
			System.out.println("Not");
		}
		sc.close();
	}
	

}
