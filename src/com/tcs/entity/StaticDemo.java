package com.tcs.entity;

public class StaticDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Bank.createAccountNumber();
		Bank.createAccountNumber();
		System.out.println(bank.instanceVariable);
		System.out.println(Bank.createAccountNumber());
		Bank bank1 = new Bank();
		System.out.println(bank1.createAccountNumber());
		System.out.println(bank1.createAccountNumber());
		System.out.println(bank1.instanceVariable);
	}
}

class Bank {
	static int counter;
	int instanceVariable;

	static int createAccountNumber() {
		return ++counter;
	}
}