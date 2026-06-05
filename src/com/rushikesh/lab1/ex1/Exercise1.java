package com.rushikesh.lab1.ex1;

public class Exercise1 {
	
	static int sumofCubes(int num) {
		int sum=0;
		
		while (num!=0) {
			int d= num%10;
			sum += d*d*d;
			num = num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(Exercise1.sumofCubes(123));
	}

}
