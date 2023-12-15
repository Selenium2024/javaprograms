package stringTest;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Maheshea";
		
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(name.charAt(j)==name.charAt(i)) {
					System.out.println(name.charAt(j));
				}
			}
			
		}

	}

}
