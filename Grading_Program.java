import java.util.*;

public class Grading_Program {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("Type the first Midterm:");
		float ExamGrade1 = console.nextInt();

		if (ExamGrade1 < 0 || ExamGrade1 > 100) {
			System.out.print("Please try again. Grade should be in [0,100] interval \n:");
			ExamGrade1 = console.nextInt();
		}
		System.out.print("Type the second Midterm:");
		float ExamGrade2 = console.nextInt();
		if (ExamGrade2 < 0 || ExamGrade2 > 100) {
			System.out.print("Please try again. Grade should be in [0,100] interval \n:");
			ExamGrade2 = console.nextInt();
		}
		System.out.print("Type the Final:");
		float ExamGrade3 = console.nextInt();
		if (ExamGrade3 < 0 || ExamGrade3 > 100) {
			System.out.print("Please try again. Grade should be in [0,100] interval \n:");
			ExamGrade3 = console.nextInt();
		}
		console.close();
		float average = (ExamGrade1 + ExamGrade2 + ExamGrade3) / 3;

		System.out.println("First Midterm Grade : " + ExamGrade1);

		System.out.println("Second Midterm Grade: " + ExamGrade2);

		System.out.println("Final Grade         : " + ExamGrade3);

		System.out.println("-------------------------");

		System.out.println("Average             : " + average);

		System.out.println("Letter Grade        : " + grade(average));

	}

	public static String grade(float grade) {

		if (grade >= 90)
			return "A";
		else if (grade < 90 && grade >= 80)
			return "B";
		else if (grade < 80 && grade >= 70)
			return "C";
		else if (grade < 70 && grade >= 60)
			return "D";
		else if (grade < 60)
			return "F";

		return "null";

	}
}
