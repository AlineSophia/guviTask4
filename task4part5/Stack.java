package com.guvi.task4part5;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
	// Declaring the stack array
	private ArrayList<Integer> stackArr = new ArrayList<>();
	String value;

	// method to push the element
	private void push(int num) {
		stackArr.add(num);

	}

	// method to pop the element
	private void pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			value = "n";
		} else {
			stackArr.remove(stackArr.size() - 1);
		}
	}

	// method to check boolean
	private boolean isEmpty() {
		return stackArr.isEmpty();
	}

	public static void main(String[] args) {
		// scanner to get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int size = scan.nextInt();
		Stack s = new Stack();
		// Iterating and adding the input to the stack
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter the element on the stack");
			int input = scan.nextInt();
			// Calling the method to push element to the stack
			s.push(input);
		}
		System.out.println("The stack after adding the element are " + s.stackArr);

		System.out.println("Do you wish to pop the last element Y/N");
		s.value = scan.next();
		if (s.value.equalsIgnoreCase("y")) {
			// Looping until the stack is empty
			while (s.value.equalsIgnoreCase("y")) {
				// Calling the method to pop element to the stack
				s.pop();
				if (s.value.equalsIgnoreCase("y")) {
					System.out.println("The stack after popping an element is " + s.stackArr);
					System.out.println("Do you wish to pop the last element again Y/N");
					s.value = scan.next();
				}
			}
		}
		//The final array stack object
		System.out.println("The final stack is " + s.stackArr);

	}

}
