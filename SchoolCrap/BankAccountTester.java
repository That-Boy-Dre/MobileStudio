/**
   This program tests the BankAccount class.
*/
public class BankAccountTester
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      BankAccount harrysAccount = new BankAccount(1000);
      harrysAccount.deposit(500); 
      harrysAccount.withdraw(200);  
    
      System.out.printf("%.2f\n", harrysAccount.getBalance());
         
   }
}