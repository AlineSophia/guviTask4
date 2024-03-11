package com.guvi.task4part2;

import java.util.Scanner;

import com.guvi.task4part1.NameNotValidException;

public class Voter {

	//Declaring variables
	private static int id;
	private static String name;
	private static int age;

	//Creating a constructor
	public Voter(int id, String name, int age) throws InvalidVoterAge {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		if (age <= 18) {
			throw new InvalidVoterAge("Invalid age for voter");
		}
	}

	public static void main(String[] args) {
		//To get the input from the user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Voter details");
		System.out.println("Voter Id: ");
		id = s.nextInt();
		System.out.println("Voter name: ");
		name = s.next();
		System.out.println("Voyer age: ");
		age = s.nextInt();
		try {
			Voter v = new Voter(id, name, age);
		} catch (InvalidVoterAge e) {
			e.printStackTrace();
		}
	}

}
