package basics1;

import java.util.Scanner;

public class CircleAreaCircumference {

	public static void main(String[] args) {
		// Write a program that takes radius from the user
		// and calculates the circumference and area

		// Hint:
		// Area = Math.PI * r * r
		// Circumference = 2 * Math.PI * r

		// Create a class named CircleAreaCircumference
		// Create a method that takes radius of type double that user entered and
		// returns area
		// Create a method that takes radius of type double that user entered and
		// returns circumference
		// Main Method
		// Take users input
		// pass that input into a method that calculates circumference

		System.out.println("Please Enter Radius: ");
		double radius = new Scanner(System.in).nextDouble();

		System.out.println("The Area Is " + calculateArea(radius));
		System.out.println("The Circumference Is " + calculateCircumference(radius));
	}


	

	static double calculateArea(double radius) {
		return Math.PI * radius * radius;

	}
	static double calculateCircumference(double radius) {
		return Math.PI * 2 * radius;
		
}
}