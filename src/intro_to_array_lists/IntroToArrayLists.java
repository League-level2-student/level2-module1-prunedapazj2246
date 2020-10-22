package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String>greetings= new ArrayList<String>();
		//2. Add five Strings to your list
		greetings.add("hello");
		greetings.add("hi");
		greetings.add("good day");
		greetings.add("Whats up?");
		greetings.add("good morning");
		//3. Print all the Strings using a standard for-loop
for (int i = 0; i <greetings.size(); i++) {
		System.out.println(greetings.get(i));
	}
		//4. Print all the Strings using a for-each loop
		for(String s : greetings) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < greetings.size(); i+=2) {
			System.out.println(greetings.get(i));
		}
		//6. Print all the Strings in reverse order.
		for (int i = greetings.size()-1; i >=0; i--) {
			System.out.println(greetings.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(String s : greetings) {
			if(s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
