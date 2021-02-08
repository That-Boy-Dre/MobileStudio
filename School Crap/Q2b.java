
import java.util.Scanner;
public class Q2b {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double digits = 0;
    int nums =0;
    int sum = 0;
    double average = 0;
    
    System.out.println("Enter as many integers as you like below with \nthe exception of -1 as it will end the loop:");
    
    
    while (nums != -1){
        digits++;
        nums = input.nextInt();

        if(nums == -1){
          break;
        }

        sum = sum + nums;
        average = sum / digits; 
    }
    input.close(); // The Scanner is closed at the end of the loop to avoid imature disruptions for the code 

    
   System.out.print("\nThe sum of all given integers: ");
   System.out.print(sum);
   System.out.print("\nThe average of all given integers: ");
   System.out.print(average);
  }
}

 