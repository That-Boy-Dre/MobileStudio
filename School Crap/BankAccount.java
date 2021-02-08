/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/


public class BankAccount{  

  private double balance = 0; // an instance field


  //public  BankAccount(){ // Constructs a bank account with a zero balance.
     //balance = 0;
  //}

  /**
     Constructs a bank account with a given balance.
     @param initialBalance the initial balance
  */
  public BankAccount(double initialBalance){   
     balance = initialBalance;
  }

  /**
     Deposits money into this account.
     @param amount the amount to deposit
  */
  public void deposit(double amount){  
     if(amount >= 0){
     balance = balance + amount;
     } else {
        System.out.println("Amount cannot be negative");
     }
  }

  /**
     Makes a withdrawal from this account
     @param amount the amount of the withdrawal
  */
  public void withdraw(double amount){   
   if(amount >= 0){
    if(amount > balance){
      System.out.println("This amount is too much to withdraw, your current balance will remain");
    } else{
        balance = balance - amount;
      }
   } else {
      System.out.println("Amount cannot be negative");
   }
  }

  
  /**
     Gets the current balance of this account.
     @return the current balance
  */
  public double getBalance(){
     return balance;
  }

}
