


import java.util.*;
public class StudentTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//Phase 1	
		student Will = new student("Will");
		Will.addQuiz(90);
		Will.addQuiz(100);
		Will.addQuiz(100);
		System.out.println("Name: "+Will.getName());
		System.out.println("Total score: "+Will.getTotalScore());
		System.out.println("Average: "+Will.getAverageScore());
		Will.addGrade("A");
		Will.addGrade("B");
		System.out.println("GPA: "+Will.getGPA());
		
//Phase 2
		System.out.println();

		System.out.println("Enter name: ");
		String student = in.next();
		student x = new student(student);
		System.out.println("Enter grades or -1 to stop");
		String grades = in.next();


		while(!grades.equals("-1")) {
			if(!grades.equals("-1")) {
				x.addGrade(grades);
			}
			grades = in.next(); //if it's before the if statement the input gets erased
		}
		System.out.println("Name: "+ x.getName());
		System.out.println("GPA: "+ x.getGPA());
		
		
		in.close();
	}
}
