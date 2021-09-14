package com.algorithm;

public class PermutationString {

	/**
	 * permutation function
	 * To get all permutated options
	 * @param str string to calculate permutation for
	 * @param l starting index
	 * @param r end index
	 */
	public static void permutation(String str, int l, int r)
	{
		if (l == r)
			System.out.println(str);
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permutation(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}

	/**
	 * Swap method to swap elements
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	
	
}
