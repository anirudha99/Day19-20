package com.algorithm;

import java.util.Scanner;

public class InsertionSort {

	static String arr[];
	static int n;
	static Scanner sc = new Scanner(System.in);

	public static void read() {
		System.out.println("Enter the number of elements in the array");
		n = sc.nextInt();
		arr = new String[n];
		System.out.println("Enter the  elements of array");
		for(int i = 0;i < n;i++) {
			arr[i] = sc.next();
		}
		System.out.println("Before Sorting");
		print();
	}

	public static void insertionSort() {

		for(int i=1;i<n;i++) {
			String item=arr[i];
			int j=i-1;

			while(j>=0 && arr[j].compareTo(item)>0) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=item;
		}
		System.out.println("After Sorting");
		print();
	}
	
	private static void print() {
		for (String string : arr) {
			System.out.print(string+" ");
		}
		System.out.println();
	}
	

}
