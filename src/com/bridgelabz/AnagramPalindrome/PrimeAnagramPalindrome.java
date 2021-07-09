package com.bridgelabz.AnagramPalindrome;

public class PrimeAnagramPalindrome {

	public static void main(String[] args) {
		

		
		//	prime numbers array between 0 and 1000
		String[] primeNumbers = prime(1000);
		
		System.out.println("Anagram and prime numbers are:");
		//	prints prime numbers that are anagrams
		for(int i = 0; i < primeNumbers.length; i++) {
			for(int j = i + 1; j < primeNumbers.length; j++) {
				if(anagram(primeNumbers[i], primeNumbers[j])) {
					System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
				}
			}
		}

		System.out.println("\nPalindrome and prime numbers are:");
		//	prints prime numbers that are palindrome
		for(int i = 0; i < primeNumbers.length; i++) {
			if(palindrome(primeNumbers[i])) {
				System.out.println(primeNumbers[i]);
			}
		}

	}

	private static String[] prime(int i) {
	return null;
	}

	private static boolean palindrome(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean anagram(String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}

}
