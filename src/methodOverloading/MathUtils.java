package methodOverloading;

public class MathUtils {

	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}

	public int difference(int num1, int num2) {
		return num1 - num2;
	}

	public double difference(double num1, double num2, double num3) {
		return num1 - num2 - num3;
	}

	public int product(int num1, int num2) {
		return num1 * num2;
	}

	public double product(double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}

	public int quotient(int num1, int num2) {
		return num1 / num2;
	}

	public double quotient(double num1, double num2, double num3) {
		return num1 / num2 / num3;
	}
}