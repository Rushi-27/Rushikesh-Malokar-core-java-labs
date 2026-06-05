package com.rushikesh.lab1.ex5;
import java.util.Scanner;

public class Exercise5 {
	
	static int sumofnumbers(int n) {
		int sum=0;
		int count=0;
		int i=1;
		
		while (count<n) {
			
			if (i%3==0 || i%5==0) {
				sum+=i;
				count++;
				
			}
			i++;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a natural number:");
		int num = sc.nextInt();
		System.out.println("sum of n natural numbers:"+Exercise5.sumofnumbers(num));
		sc.close();
	}

}
