
import java.util.Scanner;
public class LoopsPracticeGradesP2 {
  
  public static void main(String[] args) {
    
  Scanner input = new Scanner(System.in);
  int sum = 0;
  double average = 0;
  int digits = 0;
  String grades = "";
  int posDigits1 = 0;
  int posDigits2 = 0;
 // boolean end = false;
  

  System.out.println("Enter as many grades as you like but enter exit to end the loop");

  while(true){

    // if left without a try catch block a NumberFormatException will arise because
    // what the parseInt method will try to convert wont be a String wriiten in numbers but rather words such as "finish".

    try{
    grades = input.next();
    posDigits1 = Integer.parseInt(grades);
    posDigits2 = Math.abs(posDigits1);
    digits++;
    }catch(NumberFormatException e){}

    if(grades.equalsIgnoreCase("exit")){
      break;
    }

    sum = sum + posDigits2;
    average = sum / digits;
  }

  System.out.println("The sum of all your grades is: "+sum);
  System.out.println("The average of all your grades is: "+average);
  input.close();

  }
}
