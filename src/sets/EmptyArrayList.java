package sets;

import java.util.ArrayList;

public class EmptyArrayList {

	public static void main(String[] args) {
	//Create an array list with few words, 
	//print the the list of words and then remove words and print an empty list.
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Lou");
		list.add("AJ");
		
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
		
}