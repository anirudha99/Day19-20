package com.algorithm;

import java.util.Scanner;

public class FindYourNumber {

	static int num;
	static Scanner sc = new Scanner(System.in);

	public static void getInput(int N) {
		System.out.println("Enter a number between 0 and " + (N - 1));
		num = sc.nextInt();
		find(0, N - 1);
	}

	private static void find(int low, int high) {
		if (low == high) {
			System.out.println("Your number is " + low);
			System.out.println("Intermediary numbers is " + (low - 1) + " and " + (low + 1));
			return;
		}
		int mid = (low + high) / 2;
		String choice;
		System.out.println("Is your number between " + low + " and " + mid);
		choice = sc.next();
		if (choice.equalsIgnoreCase("yes")) {
			find(low, mid);
		} else {
			find(mid + 1, high);
		}
	}



}