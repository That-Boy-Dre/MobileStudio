

import java.util.Scanner;
public class numberGame {
  
  public static void main(String[] args) {
    
  System.out.println("Welcome to the random number game, the goal to win");
  System.out.println("is to guess a number from a range of 1 to 10, you'll have 3 chances to");
  System.out.println("guess the correct number but if you lose 3 times in a row the game will restart\n");

  Scanner input = new Scanner(System.in);
 
  System.out.println("Guess the number i'm thinking betwen 1 and 10");

  
  int high = 10;
  int low = 1;
  int chance1;

  int digit = (int)((Math.random()*(high - low + 1))+ low);


  for(int i = 1; i <= 3; i++){//beginning of for loop

   
     chance1 = input.nextInt();
   

       if(chance1 == digit){
         System.out.println("congratulations, you got lucky bitch");
         break;
          } else{
             System.out.println("Oops sorry, try again");
            }
      
   }//end of for loop
   input.close();
   
  }
}




//next work on a version that can continue to run even though the wrong request has been inputted
//or make it so that the scaner can only accept integers somehow
//make it so it makes a tally of the 

/*

import java.util.InputMismatchException;
import java.util.Scanner;
public class numberGame {
  
  public static void main(String[] args) {
    
  System.out.println("Welcome to the random number game, the goal to win");
  System.out.println("is to guess a number from a range of 1 to 10, you'll have 3 chances to");
  System.out.println("guess the correct number but if you lose 3 times in a row the game will restart\n");

  Scanner input = new Scanner(System.in);
 
  System.out.println("Guess the number i'm thinking betwen 1 and 10");

  
  int high = 10;
  int low = 1;
  int chance1;

  int digit = (int)((Math.random()*(high - low + 1)) + low);


  for(int i = 1; i <= 3; i++){//beginning of for loop

    try{//try block started
     chance1 = input.nextInt();
    

       if(chance1 == digit){
         System.out.println("congratulations, you got lucky bitch");
         break;
          } else{
             System.out.println("Oops sorry, try again");
            }

    }catch(InputMismatchException e){}//try block finished
      
    

   }//end of for loop


  }
}
*/