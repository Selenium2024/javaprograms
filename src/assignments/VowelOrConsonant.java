package assignments;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
		
		String name="Mahesh Manohar Bhalla";
		String name2=name.split(" ")[1];
		System.out.println(name.split(" ")[0]);
		System.out.println(name2);
		String name3="";
		for(int i=0;i<3;i++) {
			name3=name3+name2.charAt(i);
			System.out.println(name2.charAt(i));
		}
		System.out.println(name3);
		
//		// TODO Auto-generated method stub
//		char ch = 'E';
//
//		switch (ch) {
//
//		case 'a', 'A': {
//			System.out.println(ch + " is Vowel");
//
//			break;
//		}
//
//		case 'e', 'E': {
//			System.out.println(ch + " is Vowel");
//
//			break;
//		}
//
//		case 'i', 'I': {
//			System.out.println(ch + " is Vowel");
//
//			break;
//		}
//		case 'o', 'O': {
//			System.out.println(ch + " is Vowel");
//
//			break;
//		}
//		case 'u': {
//			System.out.println(ch + " is Vowel");
//
//			break;
//		}
//
//		default: {
//			System.out.println(ch + " is Consonant");
//			break;
//
//		}
//
//		}
//		int i[]= {0,1,2,3};
//		
//		for(int k=1;k<=4;k++) {
//			System.out.println(i[k]);
//		}
	}

}
