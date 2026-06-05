package com.rushikesh.lab1.ex4;
import java.util.Scanner;


public class Exercise4 {
	
	static void prime(int n) {
		for (int i=2;i<=n;i++) {
			boolean isprime = true;
			
			for (int j=2;j<=i/2;j++) {
				if (i%j==0) {
					isprime= false;
					break;
				}
				
			}
			
			if (isprime) {
				System.out.print(i+" ");
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number= sc.nextInt();
		
		System.out.println("Prime numbers are:");
		Exercise4.prime(number);
		
		sc.close();
	}

}
