/**
 * 
 */
package com.primetest.gc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.prime.gc.PrimeNumber;

/**
 * @author BenjaminMcBrayer
 *
 */
class PrimeNumbersTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test1() {
		PrimeNumber primeNum = new PrimeNumber();
		int expected = 2;
		int actual = primeNum.getPrimeNumber(1);

		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		PrimeNumber primeNum = new PrimeNumber();
		int expected = 3;
		int actual = primeNum.getPrimeNumber(2);

		assertEquals(expected, actual);
	}

	@Test
	void test3() {
		PrimeNumber primeNum = new PrimeNumber();
		int expected = 5;
		int actual = primeNum.getPrimeNumber(3);

		assertEquals(expected, actual);
	}

	@Test
	void test4() {
		PrimeNumber primeNum = new PrimeNumber();
		int expected = 7;
		int actual = primeNum.getPrimeNumber(4);

		assertEquals(expected, actual);
	}

	@Test
	void test5() {
		PrimeNumber primeNum = new PrimeNumber();
		int expected = 11;
		int actual = primeNum.getPrimeNumber(5);

		assertEquals(expected, actual);
	}

	@Test
	void test6() {
		PrimeNumber primeNum = new PrimeNumber();
		int expected = 97;
		int actual = primeNum.getPrimeNumber(25);

		assertEquals(expected, actual);
	}

	@Test
	void test7() {
		PrimeNumber primeNum = new PrimeNumber();
		int expected = 229;
		int actual = primeNum.getPrimeNumber(50);

		assertEquals(expected, actual);
	}

	@Test
	void test8() {
		PrimeNumber primeNum = new PrimeNumber();
		int expected = 541;
		int actual = primeNum.getPrimeNumber(100);

		assertEquals(expected, actual);
	}

	@Test
	void test9() {
		PrimeNumber primeNum = new PrimeNumber();
		int expected = 7919;
		int actual = primeNum.getPrimeNumber(1000);

		assertEquals(expected, actual);
	}
}
