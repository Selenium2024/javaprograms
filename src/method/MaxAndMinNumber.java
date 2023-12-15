package method;

public class MaxAndMinNumber {

	public int MaxNumber(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	public int MinNumber(int a, int b, int c) {

		if (a < b && a < c) {
			return a;
		} else if (b < c) {
			return b;
		} else {
			return c;
		}

	}

	public static void main(String[] args) {

		MaxAndMinNumber MaxMin = new MaxAndMinNumber();
		int maxNumber = MaxMin.MaxNumber(12, 155, 18);
		System.out.println("MaxNumber = > : " + maxNumber);
		int minNumber = MaxMin.MinNumber(12, 155, 11);
		System.out.println("MinNumber = > : " + minNumber);

	}

}
