package com.algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenericMain {

	public static void main(String[] args) {

		String[] arr1= {"banana","pineapple","peach","apple"};
		Integer[] arr2= {4,6,54,34,89,5,9,24};
		Float[] arr3= {12.1f,65.4f,78f,54.8f,65.4f,7.3f,98f};

		Generics.bubbleSort(arr1);		//bubble sort	
		Generics.insertionSort(arr2);	//insertion sort
		Generics.bubbleSort(arr3);
		Integer a = GenericMain.getKey();
		Integer b[] = GenericMain.getInput();
		Generics.binarySearch(b,a);		//binary search

	}

	/**
	 * Get key from user
	 * @return key
	 */
	private static Integer getKey() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to search");
		Integer key = sc.nextInt();
		return key;

	}

	/**
	 * Get file from location
	 * @param <T>
	 * @return
	 */
	private static <T> Integer[] getInput() {
		Scanner x;
		try {
			x = new Scanner(
					new File("/Users/anirudhasm/Desktop/eclipse-yml_training_workspace/Day19-20-DS-Algo/Inputfile/binarysearch.txt"));
			String whole = "";
			while (x.hasNext()) {
				whole = whole + x.next()+" ";
			}
			String[] array = whole.split(" ");
			Integer[] a=new Integer[array.length];
			for(int i=0;i<array.length;i++) {
				a[i]=Integer.parseInt(array[i]);
			}
			x.close();
			return a;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
