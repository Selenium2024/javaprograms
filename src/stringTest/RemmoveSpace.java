package stringTest;

public class RemmoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello   Everyone";
		// String str2=null;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch != ' ') {
				System.out.print(ch);
				// str2=str.charAt(i);
			}
			//str.lastIndexOf(i);
			
			
		}
		
		
		// System.out.println(str);

	}

}
