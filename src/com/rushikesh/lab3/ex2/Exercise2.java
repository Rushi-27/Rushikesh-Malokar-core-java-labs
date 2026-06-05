package com.rushikesh.lab3.ex2;
import java.util.Scanner;

public class Exercise2 {
	
	static String getImage(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		
		String reverse = sb.reverse().toString();
		
		return str+"|"+reverse;
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a string");
		
		String str = sc.next();
		
		String result = getImage(str);
		
		System.out.println("mirror Image: "+ result);
		
		sc.close();
		
	}

}
