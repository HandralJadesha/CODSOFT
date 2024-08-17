package com.ai.java;

public class Main {

	public static void main(String[] args) {
		
		BankAccount account=new BankAccount(700.0);
		ATM atm=new ATM(account);
		
		atm.run();

	}

}
