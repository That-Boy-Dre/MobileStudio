
import java.util.Scanner;
public class MethodsPractice {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value to obtain it's square root: ");
    int value = input.nextInt();

    //printf can only format doubles
    System.out.print("\nThe square root is: ");
    System.out.printf("%.2f\n",Math.sqrt(value));

    input.close();
  }
}
