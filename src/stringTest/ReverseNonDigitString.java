package stringTest;

public class ReverseNonDigitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="test12Java34Paython5678";
		String S2="";
		//S.split(12)[1];
		for(int i=S.length()-1;i>=0;i--) {
			if(S.charAt(i)>='a' ||S.charAt(i)<='z') {
			S2=S2+S.charAt(i);
			}
		}
		System.out.println(S2);
	}

}
