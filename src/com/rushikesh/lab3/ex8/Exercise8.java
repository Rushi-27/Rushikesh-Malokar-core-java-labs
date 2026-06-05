package com.rushikesh.lab3.ex8;
import java.util.Scanner;

public class Exercise8 {
	static boolean checkString(String str) {
		for (int i=0;i<str.length()-1;i++) {
			if (str.charAt(i) > str.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String str = sc.nextLine();
		
		boolean result = checkString(str);
		
		if (result) {
			System.out.println("Positive String");
		}else {
			System.out.println("Not");
		}
	}
	

}
