package com.guvi.task4part1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

	private static int rollNo;
	private static String name;
	private static int age;
	private static String course;

	
	void checkAge(int studentAge) throws AgeNotWithinRangeException {

		if (studentAge < 15 || studentAge > 21) {
			throw new AgeNotWithinRangeException("Age is not within the range");
		}

	}

	void checkName(String studentName) throws NameNotValidException {
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(studentName);
		boolean b = m.find();
		if (b) {
			throw new NameNotValidException("Name contains special characters");
		}
	}

	public static void main(String[] args) {
		Student stud = new Student();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Student details");
		System.out.println("Roll Number: ");
		rollNo = s.nextInt();
		System.out.println("Student name: ");
		name = s.next();
		System.out.println("Student age: ");
		age = s.nextInt();
		System.out.println("Student course: ");
		course = s.next();

		try {
			stud.checkName(name);
		} catch (NameNotValidException e) {
			e.printStackTrace();
		}
		
		try {
			stud.checkAge(age);
		} catch (AgeNotWithinRangeException e) {
			e.printStackTrace();
		}

	}

}
