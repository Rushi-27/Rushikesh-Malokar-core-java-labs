package com.rushikesh.lab4.ex1;


class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name  = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}

class Account{
	
	private static long accCounter = 1001;
	
	private long accNum;
	protected double balance;
	private Person accHolder;
	
	public Account(Person accHolder, double balance) {
		this.accNum = accCounter++;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	
	public long getAccNum() {
		return accNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount + "deposited successfully");
	}
	
	public boolean withdraw(double amount) {
		
		if(balance - amount >=500) {
			balance -=amount;
			System.out.println(amount+ "withdrawn successfully.");
			return true;
		}else {
			System.out.println("Minimum balance of 500 should be maintained.");
			return false;
		}
	}
	public void display() {
		System.out.println("Account no."+ accNum);
		System.out.println("Account Holder :"+ accHolder.getName());
		System.out.println("Balance: "+balance);
	}
}


class SavingsAccount extends Account {
	private final double minimumBalance = 500;
	public SavingsAccount(Person accHolder, double balance) {
		super(accHolder, balance);
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		if ((balance - amount) >= minimumBalance) {
			balance -= amount;
			
			System.out.println(amount + "withdraw from Savings Account");
			return true;
		}else {
			System.out.println("Cannot withdraw. Minimum balance must be maintained.");
			return false;
		}
	}
}

class CurrentAccount extends Account {
	
	private double overdraftLimit =1000;
	public CurrentAccount(Person accHolder, double balance) {
		super(accHolder, balance);
	}
	
	@Override
	public boolean withdraw(double amount) {
		if ((balance + overdraftLimit)>=amount) {
			balance -=amount;
			System.out.println(amount + "withdrawn from current account");
			return true;
		}else {
			System.out.println("Overdraft limit exceeded.");
			return false;
		}
	}
}

public class Exercise1{
	public static void main(String[] args) {
		
		Person smith = new Person("Smith",30);
		Person kathy = new Person("Kathy",28);
		
		SavingsAccount smithAcc = new SavingsAccount(smith,2000);
		CurrentAccount kathyAcc = new CurrentAccount(kathy, 3000);
		
		smithAcc.deposit(2000);
		
		kathyAcc.withdraw(2000);
		
		System.out.println("Updated Account Details:\n");
		
		smithAcc.display();
		kathyAcc.display();
	}
}