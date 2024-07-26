package com.gg.java;
import java.util.*;
 class GuessingGame {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int totalRounds=0;
		 int totalScore=0;
		 boolean playAgain=true;
		 Random re=new Random();
		 
		 
		 System.out.println("****-Welcome to the Number Guessing game-****");
		 	while(playAgain) {
		 		int targetNum=re.nextInt(100)+1;
		 		int attempts=0;
		 		boolean correctGuess=false;
		 		int maxAttempts=10;
		 		System.out.println("***ROUND "+(totalRounds+1)+"***");
		 		System.out.println("Guess the Number between 1 to 100!.");
		 		while(attempts<maxAttempts && !correctGuess) {
		 			System.out.print("Enter The Guessed Number: ");
		 			int UGuess=sc.nextInt();
		 			attempts++;
		 			
		 			if(UGuess==targetNum) {
		 				correctGuess=true;
		 				System.out.println("Wow, Congratulations!! You guessed the number Correctly...");
		 			}
		 			else {
		 				System.out.println(" Still you left with " +(maxAttempts-attempts)+" Attempt's, TRY AGAIN.");
		 			}
		 		}
		 		if(!correctGuess) {
		 			System.out.println("Well Tried, You're ran out of attempts!,The Actual Number was:"+targetNum+".");
		 		}else {
		 			totalScore+=(maxAttempts-attempts+1);
		 		}
		 		totalRounds++;
		 		System.out.println("Your Score:"+totalScore);
		 		System.out.println("Do you like play another reound? (yes/No):");
		 		sc.nextLine();
		 		String resp=sc.nextLine();
		 		playAgain=resp.equalsIgnoreCase("yes");
		 	}
		 	
		 	System.out.println("\n Game Over!!!");
		 	System.out.println("You played "+totalRounds+" rounds with a total Score of "+totalScore+".");
		 	sc.close();
	}

}
