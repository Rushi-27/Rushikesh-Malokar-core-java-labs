package com.rushikesh.lab3.ex4;
import java.util.Scanner;

public class Exercise4 {
	
	static int modifyNumber(int number) {
		String str = Integer.toString(number);
		
		StringBuffer sb = new StringBuffer();
		
		for (int i =0;i<str.length()-1;i++) {
			
			int d1 = str.charAt(i) - '0';
			int d2 = str.charAt(i+1) - '0';
			
			int diff = Math.abs(d1-d2);
			
			sb.append(diff);
		}
		
		sb.append(str.charAt(str.length()-1));
		
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		int result = modifyNumber(num);
		
		System.out.println("modified number: "+ result);
		
		sc.close();
		
	}

}
