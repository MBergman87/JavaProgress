package sets;

import java.util.HashSet;
import java.util.Set;

public class PercentageCommonTraits {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		set1.add("Football");
		set1.add("Hiking");
		set1.add("Cooking");
		set1.add("Coding");

		Set<String> set2 = new HashSet<String>();
		set2.add("Cooking");
		set2.add("Soccer");
		set2.add("Snorkling");
		set2.add("Hiking");

		set1.retainAll(set2);

		double commonPreferences = set1.size();
		double totalPreferences = set2.size();

		System.out.println(commonPreferences / totalPreferences * 100 + "%");

	}

}
