

import java.util.Scanner;
public class ATM {


  public static void main(String[] args) {
    
    BankAccount DondresAccount = new BankAccount(2700);
    int pinNumber = 4567;
    boolean codeNotValid = true;
    int x = 0;

    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to SJU ATM service! ");
    System.out.println("Please enter a valid pin number:");
    

    while(codeNotValid){
      x++;
      int usernumb = input.nextInt();
        if(usernumb == pinNumber){
          codeNotValid = false;
        } else{
          System.out.println("Invalid pin, please re-enter.");

          if(x >= 3){
            System.out.println("Too many failed attempts, the program has now eneded");
            break;
          }
        }
    }
    
    // ==========================================================================The menu loop begins here.
    while(codeNotValid == false){ //Begining of while loop

      System.out.println("\nPlease select from the following options:");
      System.out.println("1 – View Balance ");
      System.out.println("2 – Make a Deposit");
      System.out.println("3 – Withdraw Cash ");
      System.out.println("4 – Exit ");

      int choice = input.nextInt();


      switch (choice) { //Begining of switch statement
        case 1:
             System.out.println("your balance is "+DondresAccount.getBalance());
             break;
        case 2:
             System.out.println("Enter the amount to deposit:");
              double amount = input.nextDouble();
              DondresAccount.deposit(amount);
              break;
        case 3:
             System.out.println("Enter the amount to withdraw:");
              amount = input.nextDouble();
              DondresAccount.withdraw(amount);
              break;
        case 4:
              System.out.println("Thank you for using our ATM!");
              codeNotValid = true;
              input.close();
              break; 
        default:
              System.out.println("Error! Invalid input.");
              break;
    } //End of switch statement

  } //End ofwhile loop 

  
  }
}

/*  Welcome to SJU ATM service! 
    Please enter a valid pin number:
    2345565
    Invalid pin, please re-enter.
    2345
    Invalid pin, please re-enter.
    4567

    Please select from the following options:
    1 – View Balance
    2 – Make a Deposit
    3 – Withdraw Cash
    4 – Exit
    1
    your balance is 2700.0

    Please select from the following options:
    1 – View Balance
    2 – Make a Deposit
    3 – Withdraw Cash
    4 – Exit
    2
    Enter the amount to deposit:
    300

    Please select from the following options:
    1 – View Balance
    2 – Make a Deposit
    3 – Withdraw Cash
    4 – Exit
    1
    your balance is 3000.0

    Please select from the following options:
    1 – View Balance
    2 – Make a Deposit
    3 – Withdraw Cash
    4 – Exit
    4
    Thank you for using our ATM!
*/


