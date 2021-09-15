package com.dsMain;

import com.datastructures.UnOrderedList;

public class UnOrderedMain {

	public static void main(String[] args) {

		UnOrderedList o = new UnOrderedList();
		o.readFile();
		o.display();
		o.getUserInput();
		o.display();
		o.writeFile();
	}

}
