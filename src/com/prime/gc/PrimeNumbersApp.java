package com.prime.gc;

import java.util.Scanner;

/**
 * @author BenjaminMcBrayer
 *
 */
public class PrimeNumbersApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum = 0;
		PrimeNumber primeNum = new PrimeNumber();
		String playAgain;

		System.out.println(
				"Let's locate some primes!\n\nThis application will find any prime, in order, from first prime number on.");

		do {
			userNum = Validator.getInt(scnr, "Which prime number do you seek? ", 1, Integer.MAX_VALUE);

			System.out.println("The number " + userNum + " prime is " + primeNum.getPrimeNumber(userNum) + ".");

			playAgain = Validator.getString(scnr, "Do you want to find another prime number? (y/n): ");

		} while (playAgain.equalsIgnoreCase("y"));

		System.out.println("Thanks for playing!");

		scnr.close();
	}

}
