package asgmt_two;
/**
 * @author Richard Croft
 * Simple guessing game to guess number from one to one hundred.
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Random rndNumGen = new Random(); // Random object to produce random numbers
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		
		int numToGuess =  1 + rndNumGen.nextInt(99); // random number generation (1 - 100)
		int userGuess = 0; // stores user input
		System.out.println("Guess an integer from one to one hundred.");
		System.out.println("You have five guesses to guess the number, plus or minus ten."); // User greeting. Asks for guess and explains rules
		
		while(true) { // loop to repeat guessing
			counter++; // increments guess counter
			System.out.println("This is guess number " + counter + "."); // announces which guess the game is on
			
			try{ // try/catch block to force numeric input
				userGuess = scan.nextInt();
				} catch (Exception e) {
					if(counter < 5) {
						System.out.println("The guess must be an integer. Try again.");
						} else {
							System.out.println("That was five tries, Sorry.");
							break;
						}
					scan.nextLine();
					continue;
				}
		
			if(userGuess <= numToGuess + 10 && userGuess >= numToGuess - 10) { // evaluates guess
				System.out.println("You got it within ten!!!");
				System.out.println("The number is " + numToGuess + ".");
				break;
				} else if(userGuess > numToGuess + 10) {
					System.out.println("Too high!");
				} else {
					System.out.println("Too low!");
				}
			
			if(counter < 5) { // breaks out after fifth try
				continue;
				} else {
					System.out.println("That was five tries, sorry.");
					break;
				}
			}			
		scan.close();
	}
}
