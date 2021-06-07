
import java.util.Scanner;
public class LoopPracticeGradesP1 {
  
  public static void main(String[] args) {
    double sum = 0;
    double average = 0;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Input your 5 grades below:");

    for(int x = 1; x <= 5; x++){
      double grades = input.nextDouble();

      sum = sum + grades;
      average = sum / 5.0;
    }
    input.close();

    if(average >= 60){
      System.out.println("\nPassed");
      System.out.println("Your average is"+" "+average);
    } else{
      System.out.println("\nDid not pass");
      System.out.println("Your average is"+" "+average);
    }
    

  }
} 