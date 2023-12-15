package arrayAndArrayList;

import java.util.ArrayList;

public class ColorListTest {

	public static void main(String[] args) {

		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("green");
		colorList.add("yellow");
		colorList.add("black");
		colorList.add("white");
		colorList.add("ping");
		for (String colors : colorList) {
			System.out.println(colors);
		}
		System.out.println("*********** 2 no assignment **********");
//specified index
		System.out.println(colorList.get(0));
		
		System.out.println("**** 3 no assignment ********");
		colorList.set(1, "Purple");
		System.out.println(colorList);
		System.out.println("****** 4 no assignment ********** ");
		colorList.remove(2);
		System.out.println(colorList);
		
		System.out.println("****** 5 no assignment *********");
		for(String element:colorList) {
			if(element.equals("black")) {
				System.out.println("element got found is " +element);
			}
		}
		
	}
}
