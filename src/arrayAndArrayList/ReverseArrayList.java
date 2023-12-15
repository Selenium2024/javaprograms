package arrayAndArrayList;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {

		ArrayList<String> studentNames = new ArrayList<String>();

		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");
		System.out.println("Original ArrayList");

		System.out.println(studentNames);

		System.out.println("Reverse ArrayList");
		for (int i = studentNames.size() - 1; i >= 0; i--) {
			System.out.print(studentNames.get(i) + " , ");
		}
		
		System.out.println();
		System.out.println("***************");
		int count = studentNames.size() - 1;
		for (String names : studentNames) {
			System.out.println(studentNames.get(count));
			// System.out.println(names.));
			count--;
		}
	}

}
