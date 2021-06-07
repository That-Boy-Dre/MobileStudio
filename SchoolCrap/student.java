
public class student {
	public String name;
	public double totalScore;
	public int quizCount;
	public double totalGPA;
	public int gradeCount;

	public student() {
		name = "0";
		totalScore = 0;
		quizCount = 0;
		totalGPA = 0;
		gradeCount=0;
	}
	public student(String name) { //total and count start at 0
		this.name = name;
		this.totalScore = 0;
		this.quizCount = 0;
		this.totalGPA = 0;
		this.gradeCount=0;
	}
/**need set and get for private classes
 * get methods always have return type 
 * set methods are always void (not showing anything)
 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addQuiz(double score) {
		totalScore = totalScore + score; //totalScore += score;
		quizCount++;
	}
	public double getTotalScore() {
		return totalScore;
	}
	public double getAverageScore() {
		if(quizCount > 0) {
			return totalScore/quizCount;
		}else {
			return 0; //no scores were entered
		}
	}
	public void addGrade(String grade) {
		if(grade.equals("A")) {
			totalGPA = totalGPA + 4;
		}else if(grade.equals("A-")){
			totalGPA = totalGPA + 3.7;
		}else if(grade.equals("B+")) {
			totalGPA = totalGPA +3.3;
		}else if(grade.equals("B")) {
			totalGPA = totalGPA + 3;
		}else if(grade.equals("B-")) {
			totalGPA = totalGPA + 2.7;
		}else if(grade.equals("C+")) {
			totalGPA = totalGPA + 2.3;
		}else if(grade.equals("C")) {
			totalGPA = totalGPA + 2;
		}else if(grade.equals("C-")) {
			totalGPA = totalGPA + 1.7;
		}else if(grade.equals("D+")) {
			totalGPA = totalGPA + 1.3;
		}else if(grade.equals("D")) {
			totalGPA = totalGPA + 1;
		}else if(grade.equals("F")) {
			totalGPA = totalGPA + 0;
		}
		gradeCount++;
	}
	public double getGPA() {
		if(gradeCount > 0) {
			return totalGPA/gradeCount;
		}else {
			return 0; //no scores were entered
		}
	
	}
}
