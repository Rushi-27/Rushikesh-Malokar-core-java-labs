package com.rushikesh.lab2.ex1;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	
	static int secondlargest(int[] arr) {
		Arrays.sort(arr);
		
		return arr[1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		
		int[] arr= new int[n]; 
		
		System.out.println("Enter Elements: ");
		
		for (int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = secondlargest(arr);
		
		System.out.println("Second largest element: "+result);
		
		sc.close();
	}
	
}
