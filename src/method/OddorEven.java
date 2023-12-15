package method;

public class OddorEven {

	public boolean OddEven(int number) {
		boolean flag = false;
		if (number % 2 == 0) {
			flag = true;
			return flag;
		} else {
			return flag;
		}
	}

	public static void main(String[] args) {
		
		OddorEven oddeven = new OddorEven();
		boolean flag = oddeven.OddEven(66);
		System.out.println("Number  is Even : " + flag);

	}

}
