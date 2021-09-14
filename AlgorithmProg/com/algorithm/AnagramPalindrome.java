package com.algorithm;

public class AnagramPalindrome {

	/**
	 * Method to check prime number
	 */
	public static void primeNumber() {

		for (int i = 2; i <= 1000; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				palindrome(i);
			}
		}
	}
	
	/**
	 * Method to check palindrome
	 * @param i
	 */
	private static void palindrome(int i) {
		int rem, num, reverseNum = 0;
		num = i;
		int count = 0;
		while (i != 0) {
			rem = i % 10;
			reverseNum = reverseNum * 10 + rem;
			i = i / 10;
			count++;

		}
		if (num == reverseNum && count > 1) {
			System.out.print(num + " ");
		}

	}
}
