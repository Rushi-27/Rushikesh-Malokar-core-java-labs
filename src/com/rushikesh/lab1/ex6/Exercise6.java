package com.rushikesh.lab1.ex6;
import java.util.Scanner;

public class Exercise6 {
	
	static int difference(int n) {
		
		int sum=0, sumofsquares=0;
		
		for (int i=1;i<=n;i++) {
			sumofsquares+=i*i;
			sum+=i;
		}
		int squareofsum= sum*sum;
		
		return sumofsquares-squareofsum;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("Difference betn sum of squares and Square of sum is"+Exercise6.difference(num));
		sc.close();
	}

}
