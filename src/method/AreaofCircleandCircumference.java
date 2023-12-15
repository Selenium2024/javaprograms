package method;

public class AreaofCircleandCircumference {

	public double areaOfCircle(int radius) {

		return 22 / 7 * radius * radius;
	}

	public double circumferenceOfCircle(int radius) {

		return 2 * 22 / 7 * radius;
	}

	public static void main(String[] args) {

		AreaofCircleandCircumference AC = new AreaofCircleandCircumference();
		double Area = AC.areaOfCircle(4);
		System.out.println("Area of Cicle=: " + Area);
		double circum = AC.circumferenceOfCircle(4);
		System.out.println("Circumference of Circle=: " + circum);

	}

}
