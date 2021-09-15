package com.dsMain;

import com.datastructures.Hashing;
import java.io.*;
import java.util.*;

public class HashingMain {

	public static void main(String[] args) throws FileNotFoundException {
		
		Hashing<Integer> hash = new Hashing<Integer>();
		
		
		 File file =
			      new File("/Users/anirudhasm/Desktop/eclipse-yml_training_workspace/Day19-20-DS-Algo/Inputfile/hashinginput");
			    Scanner sc = new Scanner(file);
			    String str;
				String s = "";
				while (sc.hasNextLine()) {
					str = sc.nextLine();
					s = s + str;
				}
				System.out.println(s);
				sc.close();
				String[] arr = s.split(" ");// to split the string array
				int[] arr2 = new int[arr.length];

				// for converting any String type in file to integer type
				for (int i = 0; i < arr.length; i++) {
					arr2[i] = Integer.parseInt(arr[i]);
				}
				for (int i : arr2) {
					hash.add(i);
					
				}
			hash.write();
		hash.display();
	}
}
