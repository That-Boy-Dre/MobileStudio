


/*
Rewrite the code in question (4) to use a while loop with a boolean variable to control the loop.
*/
import java.util.Scanner;

public class inputLoops2 {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String x = "";
    int count = -1;

    System.out.println("Enter as many words as you want but type the word finished to end the program\n");

    while(true){

      x = input.next(); //The .next input will recognize spaces as seperate words 
      count++;         //meanwhile the .nextLine input will only recognizes any spaced input as 1 word


     if(x.equals("finished")){
        System.out.println("\nThe Program has ended");
        System.out.println("The user has entered "+count+" words");
        break;
      }
    }

    input.close();
  }
}
