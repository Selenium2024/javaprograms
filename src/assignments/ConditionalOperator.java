package assignments;

public class ConditionalOperator {

	public static void main(String[] args) {

		// greatest number
		int a = 255, b = 788, c = 87, d = 977;

		if (a > b && a > c && a > d) {
			System.out.println("Greatest number is= " + a);
		} else if (b > c && b > d) {
			System.out.println("Greatest number is= " + b);
		} else if (c > d) {
			System.out.println("Greatest number is= " + c);
		} else {
			System.out.println("Greatest number is= " + d);
		}

	}

}
