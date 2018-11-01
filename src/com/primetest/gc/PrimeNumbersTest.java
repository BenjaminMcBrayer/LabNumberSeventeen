package com.primetest.gc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.prime.gc.PrimeNumber;

/**
 * @author BenjaminMcBrayer
 *
 */
class PrimeNumbersTest {

	@Test
	void test1() {
		assertEquals(PrimeNumber.getPrimeNumber(1), 2);
	}

	@Test
	void test2() {
		assertEquals(PrimeNumber.getPrimeNumber(2), 3);
	}

	@Test
	void test3() {
		assertEquals(PrimeNumber.getPrimeNumber(3), 5);
	}

	@Test
	void test4() {
		assertEquals(PrimeNumber.getPrimeNumber(4), 7);
	}

	@Test
	void test5() {
		assertEquals(PrimeNumber.getPrimeNumber(5), 11);
	}

	@Test
	void test6() {
		assertEquals(PrimeNumber.getPrimeNumber(25), 97);
	}

	@Test
	void test7() {
		assertEquals(PrimeNumber.getPrimeNumber(50), 229);
	}

	@Test
	void test8() {
		assertEquals(PrimeNumber.getPrimeNumber(100), 541);
	}

	@Test
	void test9() {
		assertEquals(PrimeNumber.getPrimeNumber(1000), 7919);
	}
}
