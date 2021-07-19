package com.interview.codepractice.constructor;

public class BankAccount {

	private double balance;
	private double interest;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(double balance) {
		super();
		if (balance < 0) {
			throw new IllegalArgumentException("Starting balance can't be less than 0");
		}
		this.balance = balance;

	}

	public BankAccount(double balance, double interest) {
		super();
		if (interest < 0) {
			throw new IllegalArgumentException("Interest rate can't be less than 0");
		}
		if (balance < 0) {
			throw new IllegalArgumentException("Starting balance can't be less than 0");
		}
		this.balance = balance;
		this.interest = interest;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		balance = balance;
	}

}
