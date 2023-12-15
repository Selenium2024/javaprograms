package method;

public class MarksGrade {

	public String gradeSystem(int marks) {

		if (marks >= 91 && marks <= 100) {

			return "AA";
		} else if (marks >= 81 && marks <= 90) {

			return "AB";

		} else if (marks >= 71 && marks <= 80) {

			return "BB";

		} else if (marks >= 61 && marks <= 70) {

			return "BC";

		} else if (marks >= 51 && marks <= 60) {

			return "CD";

		} else if (marks >= 41 && marks <= 50) {

			return "DD";

		} else if (marks >= 0 && marks <= 40) {
			return "fail";
		} else if (marks < 0 || marks > 100) {

			return "Invalid marks";
		}
		else
		return null;

	}

	public static void main(String[] args) {

		MarksGrade MG = new MarksGrade();
		String grade = MG.gradeSystem(101);
		System.out.println(grade);

	}

}
