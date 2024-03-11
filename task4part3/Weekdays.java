package com.guvi.task4part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		//Adding values to an array
		arr.add("Sunday");
		arr.add("Monday");
		arr.add("Tuesday");
		arr.add("Wednesday");
		arr.add("Thursday");
		arr.add("Friday");
		arr.add("Saturday");

		Scanner s = new Scanner(System.in);
		//Getting the day value from the user
		System.out.println("Enter the day:");
		int day = s.nextInt();

		try {
			System.out.println("The day that you have given is " + arr.get(day));
		} catch (Exception e) {
			//e.printStackTrace(); to print the exception
			//User friendly error message
			System.out.println("You have entered an invalid day. Can you give a day between 0 to 6");
		}

	}

}
