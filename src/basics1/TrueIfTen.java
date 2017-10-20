package basics1;

public class TrueIfTen {

	public static void main(String[] args) {
		int a= 8;
		int b= 2;
		if (a+b==10) {
			System.out.println(true);
		}
		
		else if (a== 10 || b==10) {
			System.out.println(true);
		}
		else {
		System.out.println(false);
		}

	}
}

