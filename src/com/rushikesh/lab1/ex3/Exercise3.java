package com.rushikesh.lab1.ex3;

public class Exercise3 {
	
	static int recursive(int num) {
		
		if (num == 1 || num == 2) {
			return 1;
		}
		
		return recursive(num-1)+recursive(num-2);
		
	}
	
	static int nonrecursive(int num){
		if (num==1 || num==2) {
			return 1;
		}
		
		int a=1,b=1,c=0;
		
		for (int i=3;i<=num;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Exercise3.recursive(6));
		System.out.println(Exercise3.nonrecursive(6));
	}
}
