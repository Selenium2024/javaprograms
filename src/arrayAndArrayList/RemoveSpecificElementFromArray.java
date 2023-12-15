package arrayAndArrayList;

import java.util.Arrays;

public class RemoveSpecificElementFromArray {

	public static void main(String[] args) {

		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int q[] = new int[p.length - 1];
		int j = 0;
		for (int i = 0; i < p.length; i++) {

			if (p[i] != 22) {

				q[j] = p[i];
				System.out.print(q[j] + " ");
				j++;

			}
			// System.out.println("got element " + q[j]);
		}
		System.out.println();
		System.out.println(Arrays.toString(q));

	}

}
