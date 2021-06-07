

import java.util.Scanner;
public class OnlyAllowInts {

  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int digits;
    int numbers = 0;

    System.out.println("Enter 3 integers");

    for(int i = 1; i <= 3; i++){// start of for loop

              while(!scan.hasNextInt()){  // code that only allow ints
                //System.out.println();
                scan.nextLine();
              }

      digits = scan.nextInt();
      numbers = numbers + digits;
    }// end of for loop

    System.out.println("This is your sum: "+numbers);
    scan.close();
  }
}

// todo: I need to remember this
// ! remember this code!!!
// ? where am i
// * go there right now
