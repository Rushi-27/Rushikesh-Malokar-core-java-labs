package com.rushikesh.lab2.ex2;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise2 {
	
	static String[] sort(String[] arr) {
		
		Arrays.sort(arr);
		int n = arr.length;
		int mid = (n%2==0) ? n/2:(n/2)+1;
		
		for (int i=0;i<mid;i++) {
			arr[i]=arr[i].toUpperCase();
		}
		
		for (int i=mid;i<n;i++) {
			arr[i]=arr[i].toLowerCase();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings");
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		System.out.println("Enter Strings:");
		for (int i =0;i<n;i++) {
			arr[i]=sc.next();
		}
		
		String[] result = Exercise2.sort(arr);
		for (String str: result) {
			System.out.println(str);
		}
		sc.close();
		
	}

}
