package com.rushikesh.lab3.ex5;
import java.util.Scanner;

public class Exercise5 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter text:");
		
		String text = "";
		
		while (true) {
			
			String line = sc.nextLine();
			
			if (line.isEmpty()) {
				break;
			}
			
			text+= line + "\n";
		}
		
		int characters = text.length();
		
		String[] lines = text.split("\n");
		int lineCount = lines.length;
		
		String[] words = text.trim().split("\\s+");
		int wordCount = words.length;
		
		System.out.println("Number of Characters: "+ characters);
		System.out.println("Number of words: "+ wordCount);
		System.out.println("Number of lines: "+ lineCount);
		
		sc.close();
	}

}
