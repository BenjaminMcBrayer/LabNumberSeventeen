package com.prime.gc;

/**
 * @author BenjaminMcBrayer
 */

/*
 * c.f.
 * https://stackoverflow.com/questions/9625663/calculating-and-printing-the-nth-
 * prime-number (further modifications can make the algorithm run much
 * faster--to find the hundred-millionth prime, the methods below might take
 * more than an hour)
 */
public class PrimeNumber {

	// Take userNum and retrieve prime number at that position in the sequence.
	public int getPrimeNumber(int userNum) {
		int i;
		int count;

		// Beginning with the first prime number (2), count prime numbers until userNum.
		for (i = 2, count = 0; count < userNum; ++i) {
			if (isPrime(i)) { // See method below.
				++count;
			}
		}
		return i - 1;
	}

	// Determine whether a number is prime.
	private static boolean isPrime(int n) {
		if (n % 2 == 0) {
			return n == 2;
		}
		if (n % 3 == 0) {
			return n == 3;
		}
		int step = 4, m = (int) Math.sqrt(n) + 1;
		for (int i = 5; i < m; step = 6 - step, i += step) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
