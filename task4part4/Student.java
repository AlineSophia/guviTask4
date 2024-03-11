package com.guvi.task4part4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {

	// save method to add a student
	private void saveStudent(String name, String grade, Map map) {
		// Puuting the value inside a map
		map.put(name, grade);
		System.out.println("The student " + name + " has been added successfully");

	}

	// remove method to delete a student
	private void removeStudent(String name, Map map) {
		// removing the value
		map.remove(name);
		System.out.println("The student " + name + " has been removed successfully");
	}

	public static void main(String[] args) {
		// Creating a hashmap
		Map<String, String> map = new HashMap<String, String>();
		// Creating an object
		Student student = new Student();
		// Creating scanner class to get input from the user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Students");
		int size = s.nextInt();
		// itering the loop to get the input from the user
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter the name of student : ");
			String name = s.next();
			System.out.println("Enter the grade of student : ");
			String grade = s.next();
			// Calling the save method to add the student
			student.saveStudent(name, grade, map);
		}
		System.out.println("Do you want to remove a student Y/N");
		String remove = s.next();
		if (remove.equalsIgnoreCase("y")) {
			System.out.println("Enter the name of student to remove : ");
			String name = s.next();
			// Calling the remove method to delete a student
			student.removeStudent(name, map);
		}

		System.out.println("Do you want to display a student Y/N");
		String display = s.next();
		// Logic to display the details
		if (display.equalsIgnoreCase("y")) {
			System.out.println("The name of the students are displayed along with their grade");
			// iterating the hash map
			for (Map.Entry<String, String> set : map.entrySet()) {
				System.out.println("Student name = " + set.getValue() + ", Grade = " + set.getKey());
			}
		}

	}

}
