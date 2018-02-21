/**
 * 
 */
package com.gc.labNum16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author saclauw
 *
 */
class PrimeLocatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		String expected = "Even";
		String actual = PrimeLocator.getEven(2);
		
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		String expected = "Odd";
		String actual = PrimeLocator.getOdd(5);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		
		assertTrue(PrimeLocator.isPrime(881));
	}
	
	@Test
	void test4() {
		
		assertTrue(PrimeLocator.findPrimes(881));
	}
	
	@Test
	void test5() {
		
		assertTrue(PrimeLocator.MuskosIsPrime(881));
	}
	
	
	
}
