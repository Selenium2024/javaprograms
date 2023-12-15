package method;

public class EligibleVote {

	public boolean isEligibleVote(int age) {
		if (age >= 18) {

			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		EligibleVote eligible = new EligibleVote();
		boolean isEligiblePerson = eligible.isEligibleVote(18);
		System.out.println("Person is eligible for vote or not : " + isEligiblePerson);
	}

}
