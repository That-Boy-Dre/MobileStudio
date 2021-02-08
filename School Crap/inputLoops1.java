

/*Write a fragment of code that will continue to read words from the keyboard until the word "finished"is entered. 
After the loop ends, display the number of words the user entered, excluding  
the "finished" entry.[usea do while loop]
*/


import java.util.Scanner;
public class inputLoops1 {

  public static void main(String[] args) {

  System.out.println("Enter as many words as you want but type the word finished to end the program\n");
  
  Scanner input = new Scanner(System.in);
  String x = "";
  int count = -1;

  do{
      x = input.next(); //The .next input will recognize spaces as seperate words 
      count++;         //meanwhile the .nextLine input will only recognizes any spaced input as 1 word

      if(x.equals("finished")){
        System.out.println("\nThe Program has ended");
        System.out.println("The user has entered "+count+" words");
        break;
      }
      
   }while(true);
    input.close();


  } 
}

