package com.algorithm;

import java.util.Scanner;

public class Generics {

	static Scanner sc = new Scanner(System.in);

	/**
	 * Bubble sort method
	 * @param <T>
	 * @param arr
	 * @return
	 */
	public static <T extends Comparable<T>> T[] bubbleSort(T[] arr) {

		int len = arr.length;
		T temp;

		for(int i = 0;i < len-1;i++) {
			for(int j = 0;j < len-1-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array : ");
		printArray(arr);
		return arr;
	}

	/**
	 * Insertion sort method
	 * @param <T>
	 * @param arr
	 * @return
	 */
	public static <T extends Comparable<T>> T[] insertionSort(T[] arr) {
		T item;
		for(int i = 1;i < arr.length;i++) {
			item = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j].compareTo(item) > 0) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = item;
		}
		System.out.println("Sorted array : ");
		printArray(arr);
		return arr;
	}

	/**
	 * Binary search method
	 * @param <T>
	 * @param arr
	 * @param key
	 */
	public static <T extends Comparable<T>> void binarySearch(T[] arr,T key) {

		System.out.println("Input for binary search is");
		printArray(arr);

		T[] a = bubbleSort(arr); //use bubble sort the list
		int first = 0,last = a.length-1;
		while(first <= last) {
			int mid = (first+last) / 2;
			if(a[mid].compareTo(key) == 0) {
				System.out.println(key+" found at position "+(mid + 1));
				return;
			}
			if(a[mid].compareTo(key)>0)
				last = mid - 1;
			else
				first = mid + 1;
		}
		System.out.println("Not found!");
	}

	/**
	 * Print method
	 * @param <T>
	 * @param arr
	 */
	public static <T> void printArray(T[] arr) {
		for (T t : arr) {
			System.out.print(t+" ");

		}
		System.out.println();
	}

}
