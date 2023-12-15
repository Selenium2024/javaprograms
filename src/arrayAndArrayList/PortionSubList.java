package arrayAndArrayList;

import java.util.ArrayList;

public class PortionSubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> colors = new ArrayList<>();

		colors.add("Red");

		colors.add("Green");

		colors.add("Blue");

		colors.add("Yellow");

		colors.add("Purple");

		ArrayList<String> portion = new ArrayList<>(colors.subList(1, 4));

		System.out.println(portion);
		System.out.println("********for Loop**************");
		for (int i = 0; i < colors.size(); i++) {

			if (i > 0 && i < 4) {
				String subList = colors.get(i);
				System.out.print(subList + ", ");
			}
		}
		System.out.println();
		System.out.println("**********foreach**************");
		int counter = 0;
		for (String colorSubList : colors) {
			if (counter > 0 && counter < 4) {
				String subList = colors.get(counter);
				System.out.print(subList + ", ");

			}
			counter++;
		}
		System.out.println();
		System.out.println("***********Write a Java program to empty an array list.****************");
		ArrayList<String> colors1 = new ArrayList<>();
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
		colors1.add("Yellow");

		colors1.clear();
		System.out.println(colors1);

		System.out.println(colors1);
		System.out.println("********Trim******");

		ArrayList<String> colorsRainbow = new ArrayList<>(10);
		colorsRainbow.add("Red");
		colorsRainbow.add("Green");
		colorsRainbow.add("Blue");
		colorsRainbow.add("Yellow");
		for (int i = 0; i < colorsRainbow.size(); i++) {
			System.out.println(i + "=" + colorsRainbow.get(i));
		}
		colorsRainbow.trimToSize();
		System.out.println("Size=" + colorsRainbow.size());

	}

}
