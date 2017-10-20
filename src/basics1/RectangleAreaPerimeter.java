package basics1;

import java.util.Scanner;

public class RectangleAreaPerimeter {
	
	//Write a Java program to print the area
	//and perimeter of a rectangle by taking width and height
	//of rectangle from the user.
	
	//Area = height + width)

	public static void main(String[] args) {
		System.out.println("Please Enter Height: ");
		double height = new Scanner(System.in).nextDouble();
		System.out.println("Please Enter Width: ");
		double width = new Scanner(System.in).nextDouble();
		
		System.out.println("The Area Is: " + calculateArea(height + width, width));
		System.out.println("The Perimeter Is: " + calculatePerimeter(height, width));

	}

	static double calculateArea(double height, double width) {
		return height * width;
	}
	static double calculatePerimeter(double height, double width) {
		return height + width;
	}

}
