/**

        * File: Problem Set Unit 4

        * Author: Peter Zheng

        * Date Created: April, 25, 2026

        * Date Last Modified: April, 26, 2026

        */

import java.util.Scanner;

public class ProblemSet {

	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);

		// welcome message
	System.out.println("Welcome to the Higher or Lower guessing game.");

		//how many rounds ~ input
	System.out.print("How many rounds would you like to play: ");
		
		int rounds = 0;
		

		//round validation
		while (rounds <= 0) {
			if (s.hasNextInt()) {
				rounds = s.nextInt();

				if (rounds <= 0) {
					System.out.println("Invalid input!");
					System.out.print("How many rounds would like you like to play: ");
				}
			}
			else {
				System.out.println("Invalid input!");
				s.nextLine();
				System.out.print("How many rounds would you like to play: ");
			}
		}

		// validation
	while (rounds <= 0) {
		System.out.println("Invalid input!");
		System.out.print("How amany rounds would to like to play: ");
		rounds = s.nextInt();
	}
		int score = 0;

		// goes through rounds
		for (int f = 1; f<= rounds; f++){
			System.out.println("\nRound" + f + ":");
		
		// seperation line
		System.out.println("--------------------------");

		int choice = 0;

		// options 
		while (choice < 1 || choice > 3) {
			System.out.println("Please select High, Low or Even: ");
			System.out.println("1. High (11 - 20)");
			System.out.println("2. Low (0 - 9");
			System.out.println("3. Even (10)");

			if (s.hasNextInt()){
				choice = s.nextInt();
			
				if (choice < 1 || choice > 3) {
					System.out.println("Invalid input!");
			}
		}

		else {
			System.out.println("\nInvalid Input!");
			s.nextLine();
		}

		}

		//randomizing number 1-20
		int chosen = (int)(Math.random() * 21);
		
		
		//checking which option
		int userchoice;
		if (chosen >= 11){
			userchoice = 1; // high
		}
		else if (chosen <= 9) {
			userchoice = 2; // low
		}
		else {
			userchoice = 3; // even
		}

		// result
		System.out.print("The number was " + chosen + ". ");

		if (choice == userchoice){
			System.out.println("You were correct");
			score++;
		}
		else {
			System.out.println("You were incorrect.");
		}

		}

		System.out.println("\nTotal score: " + score);

	
		//final output

		if (score >= rounds / 2.0) {
			System.out.println("Congratulations you got " + score + " out of " + rounds + " rounds right!");
		}
		else {
			System.out.println("Better luck next time!");
		}
	}
	
}


