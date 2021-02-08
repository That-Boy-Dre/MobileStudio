

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
    while(codeNotValid == false){

      System.out.println("\nPlease select from the following options:");
      System.out.println("1 – View Balance ");
      System.out.println("2 – Make a Deposit");
      System.out.println("3 – Withdraw Cash ");
      System.out.println("4 – Exit ");

      int choice = input.nextInt();


      switch (choice) {
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
    } 
  } 
  // ==========================================================================The menu loop begins here.
  
  }
}





