package basics1;

public class ReturnStringsConcatenation {

	public static void main(String[] args) {
		//Given 2 strings, return their concatenation, except omit the first char of each.
		//The strings will be at least length 1
		
		String name; String a; String b; {
		a = "Hello";
		b = "Class";			
	}
		System.out.println(a.substring(1,a.length()) + (b.substring(1,b.length())));
}
}
