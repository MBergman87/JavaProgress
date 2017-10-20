package basics1;

public class ContinueOneToTen {

	public static void main(String[] args) {
		for (int i=10; i>=1; i--) {
		if (i==3||i==4||i==6)
		continue;
		System.out.println(i);
		}
	

	}

}