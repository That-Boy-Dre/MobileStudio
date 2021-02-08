
import java.util.Scanner;
import java.lang.Math;

public class Q2a {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 5 integers:");
    int sum = 0;
    double average = 0;

    for (int x = 1; x <= 5; x++) {

      while(!input.hasNextInt()){// start of code for making sure every input is a int
        System.out.println("Invalid input, try again!");
        input.nextLine();
      }// end of code for making sure every input is a int

      int num = input.nextInt();
      int posNum = Math.abs(num);
      
      sum = sum + posNum;
      average = sum / 5.0;
      
  }
  input.close();

  System.out.println("\nThe sum of all given integers:");
  System.out.println(sum);
  System.out.println("The average of all given integers:");
  System.out.println(average);
  
  } 
}   

