package method;

public class AddationSubtractionMultiplicationDivision {

	public int addition(int a, int b) {

		return a + b;

	}

	public int multiplication(int a, int b) {

		return a * b;

	}

	public int subtraction(int a, int b) {

		return a - b;

	}

	public int division(int a, int b) {

		return a / b;

	}

	public static void main(String[] args) {
		
		AddationSubtractionMultiplicationDivision ASMD=new AddationSubtractionMultiplicationDivision();
		
		int sum=ASMD.addition(15, 3);
		System.out.println("Addition of two number is:" +sum);
		
		int sub=ASMD.subtraction(15, 12);
		System.out.println("Subtraction of two number is:" +sub);
		
		int mul=ASMD.multiplication(15, 3);
		System.out.println("Multiplication of two number is:" +mul);
		
		int div=ASMD.division(15, 3);
		System.out.println("Division of two number is:" +div);

	}

}
