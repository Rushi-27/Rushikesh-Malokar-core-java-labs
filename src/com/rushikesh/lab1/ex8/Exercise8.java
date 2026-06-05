package com.rushikesh.lab1.ex8;
import java.util.Scanner;

public class Exercise8 {
	
	static boolean checkNumber(int n) {

        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        boolean result = checkNumber(num);

	        if (result) {
	            System.out.println("Power of 2");
	        } else {
	            System.out.println("Not a power of 2");
	        }

	        sc.close();
	    }
	}

