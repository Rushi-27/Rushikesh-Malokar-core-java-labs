package com.rushikesh.lab3.ex3;
import java.util.Scanner;

public class Exercise3 {
	
	static String alterString(String str) {
		
		String result = "";
		
		for (int i=0;i< str.length();i++) {
			
			char ch = str.charAt(i);
			
			if (ch == 'A' || ch == 'E' || ch == 'I' ||
					ch == 'O' || ch == 'U' || ch == 'a'
					|| ch == 'e' || ch =='i' || ch == 'o'
					|| ch == 'u') {
				result +=ch;
			}else {
				ch = (char)(ch+1);
				
				result +=ch;
			}
			
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a String");
		
		String str = sc.next();
		
		String result = alterString(str);
		
		System.out.println("Modified string: "+ result);
		
		sc.close();
		
	}

}
