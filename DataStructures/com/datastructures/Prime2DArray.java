package com.datastructures;

public class Prime2DArray<T> {

	public void primeArray() {
		int array[][] = new int[10][100];
		int prime[][] = new int[10][100];
		int temp = 1;
		
		//Add and increment temp
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j] = temp;
				temp++;
			}
		}
		//Check prime
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				// System.out.print(array[i][j]+" ");
				if (checkPrime(array[i][j])) {
					prime[i][j] = array[i][j];
				} else {
					prime[i][j] = 0;
				}
			}
		}
		
		//Print the prime in 2D
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (prime[i][j] != 0) {
					System.out.print(prime[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * To check the prime
	 * @param num
	 * @return
	 */
	private boolean checkPrime(int num) {

		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		/*
		 * if(flag) { return true; } else { return false; }
		 */
		return flag;
	}

}
