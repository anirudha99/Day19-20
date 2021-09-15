package com.datastructures;

class Stack<T>{
	char data[];
	int top = 0;

	Stack(){
		data =  new char[100];
	}

	//Push method
	public void push(char a) {
		data[top] = a;
		top++;
	}

	//Pop method
	public char pop() {
		top--;
		char b = data[top];
		return b;
	}

	//Check top
	public char peek() {
		char c = data[top-1];
		return c;

	}

	//Check if empty
	public boolean isEmpty(){
		if(top == 0)
			return true;
		return false;
	}

	//Get the size
	public int size() {
		return top;
	}
}


public class BalancedParenthesis {

	Stack<Character> stack = new Stack<>();

	/**
	 * To check the balance
	 * @param <T>
	 * @param expr
	 */
	public <T> void isBalanced(String expr) {

		for(int i = 0;i<expr.length();i++) {
			if(expr.charAt(i) == '(') {
				stack.push(expr.charAt(i));
			}
			else if(expr.charAt(i) == ')'){
				stack.pop();
			}
		}

		if(stack.isEmpty()) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not balanced");
		}
	}
}
