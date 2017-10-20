package sets;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import sets.UserService;

public class UIPref {

	public static void main(String[] args) {

		ArrayList<String> userPreferences = new ArrayList<String>();
		userPreferences.add("Hiking");
		userPreferences.add("Football");
		userPreferences.add("Soccer");
		userPreferences.add("Music");
		userPreferences.add("Video Games");
		userPreferences.add("Cooking");

		System.out.println("User 1: Please Enter Two Preferences From the Following Options: ");
		System.out.println(userPreferences);

		Set<String> user1Preferences = collectUserPreferences();
		System.out.println("User 1 Preferences Are " + user1Preferences);

		System.out.println("User 2: Please Enter Two Preferences From the Following Options: ");
		System.out.println(userPreferences);

		Set<String> user2Preferences = collectUserPreferences();
		System.out.println("User 2 Preferences Are " + user2Preferences);

	}

	public static Set<String> collectUserPreferences() {

		Scanner scan = new Scanner(System.in);
		Set<String> userPreferences = new HashSet();
		for (int i = 0; i < 2; i++) {
			userPreferences.add(scan.nextLine());
		}

		return userPreferences;

	}

}
