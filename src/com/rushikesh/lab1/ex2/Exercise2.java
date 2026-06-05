package com.rushikesh.lab1.ex2;

import java.util.Scanner;

public class Exercise2 {
	
	static void trafficLight(String light) {
		if (light.equals("green")){
			System.out.println("go");
		}else if (light.equals("red")) {
			System.out.println("stop");
		}else if (light.equals("yellow")) {
			System.out.println("ready");
		}else {
			System.out.println("Invalid Signal");
			}
		}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose your light red, green and yellow");
		String light = sc.next();
		
		Exercise2.trafficLight(light);
		sc.close();
		
	}
	
}
