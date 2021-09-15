package com.datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnOrderedList {
	Node head;

	private class Node<T>{
		T data;
		Node next;

		Node(T data){
			this.data=data;
			next=null;
		}
	}

	/**
	 * Read the input file
	 * @param <T>
	 */
	public  <T> void readFile() {
		Scanner sc;
		try {
			sc = new Scanner(
					new File("/Users/anirudhasm/Desktop/eclipse-yml_training_workspace/Day19-20-DS-Algo/Inputfile/unordered.txt"));

			String whole = "";
			while (sc.hasNext()) {
				whole = whole + sc.next()+" ";
			}
			T[] array =(T[]) whole.split(" ");
			//add(array);
			for (T t : array) {
				add(t);

			}
			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Add the element
	 * @param <T>
	 * @param data
	 */
	public <T> void add(T data) {

		Node newNode = new Node(data);

		if(head==null)
			head=newNode;
		else {
			Node temp;
			temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}

	/**
	 * display the elements
	 * @param <T>
	 */
	public <T> void display() {
		Node temp= head;
		while(temp.next!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

	/**
	 * Get the user input
	 * @param <T>
	 */
	public  <T> void getUserInput() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter word you wanna search");
		T input=(T) r.next();
		search(input);

	}

	/**
	 * Search the element
	 * @param <T>
	 * @param input
	 */
	private <T> void search(T input) {
		Node temp;
		temp=head;
		while(temp!=null) {
			if(temp.data.equals(input)) {
				remove(input);
				break;
			}
			else {
				temp=temp.next;
			}
		}
		if(temp==null) {
			add(input);
		}
	}

	/**
	 * Remove the element
	 * @param <T>
	 * @param input
	 */
	private <T> void remove(T input) {
		if(input.equals(head.data)) { //Removing the first element
			head=head.next;
			return;
		}
		Node temp=head.next;
		Node q=head;
		while(temp!=null) {
			if(temp.data.equals(input)) {
				if(temp.next==null) {
					temp=temp.next;
					q.next=null;
				}
				else {
					q.next=temp.next;

					temp=temp.next;
				}
			}
			else {
				q=temp;
				temp=temp.next;
			}
		}
	}

	/**
	 * Write into output file
	 */
	public void writeFile() {
		try {
			FileWriter writer = new FileWriter("/Users/anirudhasm/Desktop/eclipse-yml_training_workspace/Day19-20-DS-Algo/Outputfile/unorderedouput");
			Node temp;
			temp=head;
			while(temp.next!=null) {
				writer.write(temp.data+" ");
				temp=temp.next;
			}
			writer.write(temp.data+"");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
