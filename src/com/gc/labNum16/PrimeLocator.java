package com.gc.labNum16;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeLocator {
	public static void main(String[] args) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		
		for (int i = 2; i < 1000000; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		while (cont.equalsIgnoreCase("y")) {
		//primeNumbers.forEach(System.out::println);
		System.out.println("Let's locate some primes!");
		System.out.println("\nThis application will find you any prime, in order, from the first prime number on.");
		int userNum = getInt(scan, "Which prime number are you looking for?", 0, 74100);
		int primeNum = primeNumbers.get(userNum-1);
		
		System.out.println("In the list of prime numbers the number " + userNum + "th prime is " + primeNum + ".");
		
		System.out.print("\nDo you want to find another prime number? (y/n) ");
		cont = scan.next();
		System.out.println("");
		if (!cont.equalsIgnoreCase("y")) {
			System.out.println("Goodbye!");
		} 
		}

	} // end main

	public static String getEven(int num) {
		if (num % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}

	public static String getOdd(int num) {
		if (num % 2 != 0) {
			return "Odd";
		} else {
			return "Even";
		}
	}

	public static Boolean findPrimes(int num) {
		if (num == 2 || num == 3 || num == 5 || num == 7) {
			return true;
		} else if (num % 2 != 0) {
			if (num % 3 != 0) {
				if (num % 5 != 0) {
					if (num % 7 != 0) {
						if (num % 11 != 0) {
							if (num % 13 != 0) {
								if (num % 17 != 0) {
									if (num % 19 != 0) {
										if (num % 23 != 0) {
											return true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	public static boolean isPrime(int num) {
		if (num == 2) {
			return true;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}

		}
		return true;
	}

	public static boolean MuskosIsPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}
	
	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}
	
}
