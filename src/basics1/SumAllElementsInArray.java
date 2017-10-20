package basics1;

public class SumAllElementsInArray {
	// No User input Just write the program in Main method
	// write a program that sums(adds) all the elements in an integer array
	// Int[]

	public static void main(String[] args) {
		int[] numberList = { 247, 1058, 274, 942 };
		double ave = numberList.length;

		int sum = 0;
		for (int num : numberList) {
			// sum += num; (short and nifty version)
			sum = sum + num;
		}
		System.out.println("The Average of Elements Is " + sum / ave);

	}

}
