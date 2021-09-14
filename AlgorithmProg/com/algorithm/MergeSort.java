package com.algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {
	
	static Scanner sc = new Scanner(System.in);
	
    /**
     * set size
     * Get user input
     */
    public static void getArray() {
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    String values[] = new String[n];
    System.out.println("Enter the array");
    for(int i = 0;i<n;i++) {
    	values[i] = sc.next();
    }
        mergeSort(values, 0, values.length - 1);
        
        System.out.println("Result " + Arrays.toString(values));
    }
    
    /**
     * Sort function
     * @param arr
     * @param start
     * @param end
     */
    public static void mergeSort(String[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);

			merge(arr, start, mid, end);
		}
	}
    
    /**
     * Merge method to combine the array
     * @param arr
     * @param start
     * @param mid
     * @param end
     */
    private static void merge(String[] arr, int start, int mid, int end) {
		int p = start, q = mid + 1;
		String[] newArr = new String[end - start + 1];
		int j = 0;
		for (int i = start; i <= end; i++) {
			if (p > mid)
				newArr[j++] = arr[q++];
			else if (q > end)
				newArr[j++] = arr[p++];
			else if (arr[p].compareTo(arr[q]) < 0)
				newArr[j++] = arr[p++];
			else
				newArr[j++] = arr[q++];
		}
		for (int k = 0; k < j; k++) {
			arr[start++] = newArr[k];
		}

	}

}
