package basics1;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		//Create input user will enter manually
		System.out.println("Enter a Password");
		//Assign new scanner input to be entered as an integer
		String input = new Scanner(System.in).nextLine();
		//if input meets requirements(below) print a successful entry("is valid")
		if(isValid(input)) {
			System.out.println(input + " is valid");
		}
		//if input does not meet requirements(below) print an unsuccessful entry("is invalid")
		else {
			System.out.println(input + " is invalid");
		}

	}
	//Create a boolean named isValid. It is static because criteria will not change
	static boolean isValid(String input) {
		
		//a password must have at least ten characters
		if (input.length() < 10) {
		//if password does not contain ten characters, we say "Hey, computer! Return false!"
			return false;
		}
		//we want the computer to start checking the character input at place 0 (beginning of input)
		int charCount = 0;
		//we want the computer to start checking the number input at place 0 (beginning of input)
		int numberCount = 0;
		//now we tell the computer to start checking the input
		//the computer will look at the input and check from place 0 (beginning of input)
		//it will now check each character one by one
		for (int i = 0; i < input.length() -1; i++) {
			//assign char input name: eachCharInPassword
			char eachCharInPassword = input.charAt(i);
			//we want the input to print in upper case, so we tell the computer:
			//for each char, change toUpperCase
			eachCharInPassword = Character.toUpperCase(eachCharInPassword);
			//now we tell the computer that each char needs to be between the char "A" and char "Z"
			if (eachCharInPassword >= 'A' && eachCharInPassword <= 'Z') {
			//charCount++ tells the computer "if char0 (beginning of password) meets the criteria,
			//move to next char (char1)
				charCount++;
			}
			//now computer checks if any digits between 0 and 9 are in the input
			else if (eachCharInPassword >= '0' && eachCharInPassword <= '9') {
			//if input meets the criteria, move from char0 to char1
				numberCount++;
			}
			
		}
		//here we tell the computer to check if there are at least two digits in the input
		if (numberCount >= 2 && charCount >= 1) {
			//if there are at least two digits, return true
			return true;
			}else {
				
				return false;
			}
	}
}
