package com.rushikesh.lab2.ex3;
import java.util.Scanner;

import java.util.Arrays;

public class Exercise3 {
	
	static int[] reverse(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			
			int num= arr[i];
			int rev=0;
			
			while (num!=0) {
				int d = num%10;
				rev = rev*10 + d;
				num = num/10;
			}
			
			arr[i]=rev;
		}
		
		Arrays.sort(arr);
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter elements");
		
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] result = Exercise3.reverse(arr); 
				
		System.out.println("Sorted array");
		for (int num:result) {
			System.out.println(num+" ");
		}
		
		sc.close();
	}

}
