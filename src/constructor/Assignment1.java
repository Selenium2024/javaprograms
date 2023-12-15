package constructor;

public class Assignment1 {
	String name;
	int age;
	char gender;
	double height;

	public Assignment1(String name, int age, char gender, double height) {
		
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
		
		System.out.println(name+ " "+age+ " " +gender +" " +height);

	}

	public static void main(String[] args) {
		
		new Assignment1("Pooja", 26, 'F',5.5);
		new Assignment1("Mahesh", 32, 'M',6.5);

	}

}
