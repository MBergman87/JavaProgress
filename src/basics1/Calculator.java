package basics1;

public class Calculator {

	public static void main(String[] args) {
System.out.println(calculateSum(137,82));

	}
static int calculateSum(int a, int b) {
	return a+b;
}
static void divideSum (int a, int b) {
	System.out.println(a/b);
}
static void subtractSum (int a, int b) {
	System.out.println(a-b);
}
static void multiplySum (int a, int b) {
	System.out.println(a*b);
}
}