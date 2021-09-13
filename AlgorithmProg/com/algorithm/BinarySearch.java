package com.algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearch {
	static Scanner sc = new Scanner(System.in);

	public static void readFile() {
		String key = getKey();

		Scanner x;
		try {
			x = new Scanner(
					new File("/Users/anirudhasm/Desktop/eclipse-yml_training_workspace/Day19-20-DS-Algo/Inputfile/binarysearch.txt"));

			String whole = "";
			while (x.hasNext()) {
				whole = whole + x.next() + " ";
			}
			String[] array = whole.split(" ");
			sort(array, key);

			x.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	private static void sort(String[] arr, String key) {
		System.out.println("Unsorted array");

		for (String string : arr) {
			System.out.println(string);
		}
		int len = arr.length;
		String temp;

		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1 ; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		System.out.println("Sorted array");

		for (String string : arr) {
			System.out.println(string);

		}
		binarysearch(arr,key);

	}

	private static String getKey() {
		System.out.println("Enter the key to search");
		String key = sc.nextLine();
		return key;
	}

	private static void binarysearch(String[] arr, String key) {
		int first = 0, last = arr.length - 1;
		while (first <= last) {
			int mid = (first + last) / 2;
			if (key.compareTo(arr[mid]) == 0) {
				System.out.println(key + " found at position " + (mid + 1));
				System.exit(0);
			}
			if (key.compareTo(arr[mid]) > 0) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}

		}
		System.out.println("Not found");

	}

}
