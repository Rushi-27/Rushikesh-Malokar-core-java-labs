package com.rushikesh.lab2.ex4;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
		    static int[] removeDuplicates(int[] arr) {

		        Arrays.sort(arr);

		        int count = 1;

		        for (int i = 0; i < arr.length - 1; i++) {

		            if (arr[i] != arr[i + 1]) {
		                count++;
		            }
		        }

		        int[] unique = new int[count];

		        unique[0] = arr[0];

		        int j = 1;

		        for (int i = 1; i < arr.length; i++) {

		            if (arr[i] != arr[i - 1]) {
		                unique[j++] = arr[i];
		            }
		        }

		        return unique;
		    }

		    // Function to sort descending
		    static void sortDescending(int[] arr) {

		        for (int i = 0; i < arr.length / 2; i++) {

		            int temp = arr[i];

		            arr[i] = arr[arr.length - 1 - i];

		            arr[arr.length - 1 - i] = temp;
		        }
		    }
		    static int[] modifyArray(int[] arr) {

		        int[] result = removeDuplicates(arr);

		        sortDescending(result);

		        return result;
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter size of array: ");
		        int n = sc.nextInt();

		        int[] arr = new int[n];

		        System.out.println("Enter array elements:");

		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        int[] result = modifyArray(arr);

		        System.out.println("Modified array:");

		        for (int num : result) {
		            System.out.print(num + " ");
		        }

		        sc.close();
		    }
		
	}
	


