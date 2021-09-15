package com.datastructures;

public class Palindrome {

	public static void palindromeChecker() {

		String str = "madam";
		String revFront = "";
		String revRear = "";

		Deque<Character> deque = new Deque<>(10);
		// inserting element in deque
		for (int i = 0; i < str.length(); i++) {
			deque.insertRear(str.charAt(i));
		}
		// removing element from rear and getting the rear values
		for (int i = 0; i < str.length(); i++) {
			revRear += deque.getRear();
			deque.deleteRear();
		}
		// inserting element again in deque
		for (int i = 0; i < str.length(); i++) {
			deque.insertRear(str.charAt(i));
		}
		// removing element from front and getting the front values
		for (int i = 0; i < str.length(); i++) {
			revFront += deque.getFront();
			deque.deleteFront();
		}
		// System.out.println("Front delete : " + revFront);
		System.out.println("Rear delete : " + revRear);
		System.out.println("Front delete : " + revFront);
		if (revRear.equals(revFront)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
