package method;

public class Factorial {

	public void factorialNumber(int number) {

		if (number > 0) {
			for (int i = number - 1; i >= 1; i--) {

				number = number * i;// 12,24
			}
			System.out.println(number);
		} else if (number == 0) {
			System.out.println(1);
		}
	}

	public static void main(String[] args) {

		Factorial fact = new Factorial();
		fact.factorialNumber(3);

	}

}
