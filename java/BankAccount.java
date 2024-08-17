package com.ai.java;
import java.util.*;
public class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
		if(initialBalance<0) {
			System.out.println("Initial Balance In account Cannot be Negative. Setting it to 0");
			this.balance=0;
		}
		else {
			this.balance=initialBalance;
		}
	}
	
	public boolean deposit(double amount) {
		if(amount <=0) {
			System.out.println("Deposit Amount Must be postive.");
			return false;
		}
		balance+=amount;
		System.out.printf("Deposited:INR %.2f%n",amount);
		System.out.printf("Your Current Account Balance is:INR %.2f%n",balance);
		return true;
	}
	
	public boolean withDraw(double amount) {
		if(amount<=0) {
			System.out.println("Withdrawal amount must be positive.");
			return false;
		}
		if(amount>balance) {
			System.out.println("WithDrawal of Amount is not Possible due to Insuffient Balance.");
			return false;
		}
		balance-=amount;
		System.out.printf("The Withdrawal Amount  is: INR %.2f%n",amount);
		System.out.printf("The Account Balance Amount is: INR %.2f%n",balance);
		return true;
	}
	
	public double getBalance() {
		return balance;
	}
}
