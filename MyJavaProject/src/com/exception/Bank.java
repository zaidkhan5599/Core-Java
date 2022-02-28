package com.exception;

public class Bank {
	private int acc_nm;
	private double balance;
	private int pin=2580;
	
	double withDraw(double amount) {
		if(amount> balance) {
			throw new AmountExceedException();
		}
		else {
			balance=balance-amount;
			return balance;
		}
	}

	public int getAcc_nm(int pin) {
		if(this.pin==pin) {
		return acc_nm;
		}
		System.out.println("Pin Incorrect");
		throw new PinIncorrectException();
	}


	public double getBalance(int pin) {
		if(this.pin==pin) {
		return balance;
		}
		System.out.println("Pin Incorrect");
		throw new PinIncorrectException();
	}

	public void setBalance(double balance) {
		this.balance = this.balance+balance;
	}
	
}
