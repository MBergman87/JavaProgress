package basics1;

import java.util.Scanner;

public class DaysOfWeek {
//Write a program that scans a number from the user
//and prints the corresponding day of the week
//example: if user entered 1, print Monday
	//Default condition invalid day of the week
	//Note: Solve using switch case
	public static void main(String[] args) {
		System.out.println("Please Enter Number Between 1-7: ");
		int num = new Scanner(System.in).nextInt();
		switch(num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Invalid Number");
		}

	

	}

}
