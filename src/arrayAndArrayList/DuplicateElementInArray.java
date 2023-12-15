package arrayAndArrayList;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 24, 45, 56, 24, 56, 34, 24, 34 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (b[i] != a[j]) {
					if (a[j] == a[i]) {
						System.out.println(a[i]);
						b[i] = a[i];

					}
				}
				// System.out.println(a[i]+" "+counter);
			}

		}

	}

}