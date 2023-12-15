package assignments;

public class VowelusingForandwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****** For Loop ************");
		for (char ch = 'a'; ch <= 'z'; ch++) {

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(" " + ch);
			}
		}
		System.out.println();
		System.out.println("****** While Loop ************");
		System.out.println();
		char ch = 'a';
		while (ch <= 'z') {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(" " + ch);
			}
			ch++;
		}

		System.out.println("Multiplication of 7");

		for (int i = 1; i <= 10; i++) {

			if (i % 7 != 0) {
				System.out.println(i);
			} else {
				System.out.println("bye, see you tomorrow");
				break;
			}
		}

	}

}
