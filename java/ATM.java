package com.ai.java;
import java.util.*;
public class ATM {
		private BankAccount bankAccount;
		private Scanner sc;
		
		public ATM(BankAccount bankAccount) {
			this.bankAccount=bankAccount;
			this.sc=new Scanner(System.in);

		}
		
		public void showMenu() {
			System.out.println(" ***Welcome To XYZ ATM***");
			System.out.println("\n ATM Menu:");
			System.out.println(" 1: Check Account Balance");
			System.out.println("2: Deposit Amount");
			System.out.println("3: Withdraw Amount");
			System.out.println("4: Exit");
		}
		
		
		public void run() {
			boolean exit=false;
			while(!exit) {
				showMenu();
				System.out.println("Choose an option from 1 to 4 :");
				String choice=sc.nextLine();
				
				switch(choice) {
				case "1":
					double balance=bankAccount.getBalance();
					System.out.printf("Your Current Account Balance is:INR %.2f%n",balance);
					break;
					
				case "2":
					System.out.print("Enter the Deposit Amount In Numbers: INR ");
					try {
						double depositAmount=Double.parseDouble(sc.nextLine());
						bankAccount.deposit(depositAmount);
					}catch(NumberFormatException e) {
						System.out.println("Invalid Input!!.Enter the Amount in Numbers");
					}
					break;
				case "3":
					System.out.print("Enter the Amount to Withdraw : INR ");
					try {
						double withDrawAmount=Double.parseDouble(sc.nextLine());
						bankAccount.withDraw(withDrawAmount);
					}catch(NumberFormatException e) {
						
						System.out.println("Invalid Input!!. Please Enter A Numerical Value.");
					}
					break;
					
				case "4":
					System.out.println("Thank You For Visiting XYZ ATM, Have a Nice Day!!");
					exit=true;
					break;
				default:
					System.out.println("Invalid Choice!!,Please enter a choice between 1 to 4");
				}
			}
			sc.close();
		}
	
}
