
import java.util.Scanner;
public class randomGame {

  public static void main(String[] args) {
    

    Scanner input = new Scanner(System.in);

    int high = 10;
    int low = 1;
    boolean begin = true;
    int answer;
    boolean validInput;
    String redo;
    
   
    System.out.println("Let's play a guessing game!\n");
    
    
    while(begin){// while loop

                int range = (int)((Math.random()*(high - low + 1))+ low);

                System.out.println("\nI\'m thinking of a number between 1 and 10.");
                System.out.println("What do you think it is?");
                answer = input.nextInt();

                if(answer >= 1 && answer <= 10){// start of outer if
              
                    if(answer == range){// start of inner if
                      System.out.println("Your right!");
                  
                      } else{
                    System.out.println("YOU\'RE WRONG!!! The number was "+range);
                  }// end of inner if
                } else{
                System.out.println("I said, between 1 and 10.");
              }// end of outer if

              
              // This code is brilliant because it's able to keep asking 
              // for a correct input option no matter how many times you enter the wrong one
              do{
                  System.out.println("\nPlay again? (Y or N)");
                  redo = input.next();
                  validInput = true;

                  if(redo.equalsIgnoreCase("Y")||redo.equalsIgnoreCase("N")){
                      if(redo.equalsIgnoreCase("Y")){
                        begin = true;
                      }else if(redo.equalsIgnoreCase("N")){
                        begin = false;
                      }
                  }else{
                      validInput = false; 
                    }   
              } while(!validInput); 

    }// while loop 
    
    System.out.println("\nThank you for playing!");
    input.close();


  }
}


// This program correctly works but it needs to be properly formatted into a cleaner version
 /*
            if (redo.equalsIgnoreCase("Y"));
            else if (redo.equalsIgnoreCase("N"))
            begin = false;
            else
            validInput = false;
            */
          


            
// This is a much more easy to understand version of the while loop
/*
 validInput = true;
        
        while(validInput){
          System.out.println("\nPlay again? (Y or N)");
          redo = input.next();

          if(redo.equalsIgnoreCase("Y")||redo.equalsIgnoreCase("N")){
            if(redo.equalsIgnoreCase("Y")){
              begin = true;
              validInput = false;
            }else if(redo.equalsIgnoreCase("N")){
              begin = false;
              validInput = false;
            }
          }else{
            validInput = true;
          }
        }
*/