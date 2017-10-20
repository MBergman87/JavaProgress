package basics1;

import java.util.Scanner;

public class MultiplcationTable {

	public static void main(String[] args) {
		//Write a program in Java to display the multiplication table of a given integer.
		//- Take the integer that you want multiplication table for from the user(use scanner)
		//- out put multiplication up to 10
		int j, n;
		System.out.println("Enter Number to be Multiplied: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

	      System.out.println("Multiplication table of "+n+" is :");
			for(j=1; j<=10; j++) {
			System.out.println(n+"*"+j+" = "+(n*j));

			}
	}

}
