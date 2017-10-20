package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NoDuplicates {

	public static void main(String[] args) {
		
		//Given a list with duplicate elements for example the list shown below, return a list without duplicate elements.
		//Hint: convert list to another class in collections framework that does not allow duplicate elements
		
		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
		
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("J2EE");
		listWithDuplicateElements.add("JSP");
		listWithDuplicateElements.add("SERVLETS");
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("STRUTS");
		listWithDuplicateElements.add("JSP");
		
	

		Set<String> duplicate = new HashSet<String>(listWithDuplicateElements);
		System.out.println(duplicate);
		
		
	}
}

