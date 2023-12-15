package assignments;

public class SeriesPrint {

	public static void main(String[] args) {
		//  Print the following series: 

		//1.0 2.0 3.0  ...... 10.0 

		//0 9 18 27 36 …99
		System.out.println(" ***** 1.0 2.0 3.0  ...... 10.0 *********** ");
		double i=1.0;
		while(i<=10.0) {
			System.out.println(i);
			i++;
		}
		System.out.println("********0 9 18 27 36 …99************ ");
		int j=0;
		while(j<=99) {
			System.out.println(j);
			j=j+9;
		}
	}

}
