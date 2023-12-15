package arrayAndArrayList;

import java.util.Arrays;

public class CricketTeam {

	public static void main(String[] args) {
		
		String name=null;
		int age=0;
		String teamName=null;
		String DOB;
		String gender;
		int strikeRate;
		
		Object crick []= {"Sachin",29,"India","24-Jun-1990","Male",200};
				
		Object crick1 []= {"Mahesh",29,"India","24-Jun-1990","Male",200};
		
		Object crick2 []= {"Pooja",29,"India","24-Jun-1990","Female",200};
		
		System.out.println(Arrays.toString(crick));
		System.out.println(Arrays.toString(crick1));
		System.out.println(Arrays.toString(crick2));
	}

}
