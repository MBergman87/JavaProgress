package basics1;

public class FindTextInString {

	public static void main(String[] args) {
		String announcement = "Attention Students: If you are working too hard, take a nap.";
		String wordIWantToCheck = "you";
		
		System.out.println(announcement.contains(wordIWantToCheck));

	}

}
