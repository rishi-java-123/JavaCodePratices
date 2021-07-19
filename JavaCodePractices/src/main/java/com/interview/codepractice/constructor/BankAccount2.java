package com.interview.codepractice.constructor;

public class BankAccount2 {
	private double balance;
	private double interest;

	public BankAccount2() {

		this(0);
		// TODO Auto-generated constructor stub
	}

	// constructor chaining to support object creation to keep it DRY
	public BankAccount2(double balance) {
		this(balance, 0.01);
		/*
		 * super(); if (balance < 0) { throw new
		 * IllegalArgumentException("Starting balance can't be less than 0"); }
		 * this.balance = balance;
		 */

	}

	public BankAccount2(double balance, double interest) {
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
