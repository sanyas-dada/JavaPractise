package com.sanyasdada.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerClass {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String name = in.readLine();
		System.out.println("what is your current aim?");
		String aim = in.readLine();
		System.out.println("What is your Age, age matter ");
		int age = in.read();
		System.out.println("my name is:" + name + "\n" + "at" + age + "My current target is: " + aim);
		 
		/*
		 * Scanner in = new Scanner(System.in); // get first input
		 * System.out.println("What is your name?"); String name = in.next();
		 * 
		 * 
		 * System.out.println("Enter your surname?"); String surname = in.next();
		 * 
		 * System.out.println("your name:" + name + "and surname:" + surname);
		 * 
		 * // Get second input
		 * 
		 * System.out.println("How old are you"); int age = in.nextInt();
		 */

		// Display the output on console
		System.out.println("hello," + name + ".Next year, you will be " + (age + 1));

	}
}
