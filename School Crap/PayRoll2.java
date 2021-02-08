


import java.util.Scanner;
public class PayRoll2 {
  
  public static void main(String[] args) {

    
    
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to St. John's Student Payroll System\nPlease enter the following information");

    System.out.print("\nEmployee id: ");
        String id = input.nextLine();

    System.out.print("Enter your first name: ");
        String fN = input.next();

    System.out.print("Enter your last name: ");
        String lN = input.next();

    System.out.print("Enter your Marital Status: ");
        String mS = input.next();

    System.out.print("Hours worked: ");
        int hW = input.nextInt();

    System.out.print("Hourly Rate: ");
        double hR = input.nextDouble();


        double grossPay = (hW * hR);
        double taxAmount = 0;


        if(mS.equalsIgnoreCase("single")||mS.equalsIgnoreCase("s")){ //makes it not case sensitive
            if(grossPay <= 73) {
                taxAmount = 0;
            }
            else if(grossPay <= 260) {
                taxAmount = 0.1*(grossPay - 73);
            }
            else if(grossPay <= 832) {
                taxAmount = 18.70 + 0.12 * (grossPay - 260);
            }
            else if(grossPay <= 1692) {
                taxAmount = 87.34 + 0.22 * (grossPay - 832);
            }
            else if(grossPay <= 3164) {
                taxAmount = 276.54 + 0.24 * (grossPay - 1692);
            }
            else if(grossPay <= 3998) {
                taxAmount = 629.82 + 0.32 * (grossPay - 3164);
            }
            else if(grossPay <= 9887) {
                taxAmount = 896.70 + 0.35 * (grossPay - 3998);
            }
            else{
                taxAmount = 2957.85 + 0.37 * (grossPay - 9887);
            }
       }//end of single case
       else{ 
            if(grossPay <= 227) {
                taxAmount = 0;
            }
            else if(grossPay <= 600) {
                taxAmount = 0.10 * (grossPay - 227);
            }
            else if(grossPay <= 1745) {
                taxAmount = 37.30 + 0.12 * (grossPay - 600);
            }
            else if(grossPay <= 3465) {
                taxAmount = 174.70 + 0.22 * (grossPay - 1745);
            }
            else if(grossPay <= 6409) {
                taxAmount = 553.10 + 0.24 * (grossPay - 3465);
            }
            else if(grossPay <= 8077) {
                taxAmount = 1259.66 + 0.32 * (grossPay - 6409);
            }
            else if(grossPay <= 12003) {
                taxAmount = 1793.42 + 0.35 * (grossPay - 8077);
            }
            else{
                taxAmount = 3167.52 + 0.37 * (grossPay - 12003);
            }
       }//end of the married case
        
       
        double netPay = (grossPay - taxAmount);  


    
    System.out.println("\nPayroll Summary  for Employee ID: "+id);
    System.out.println("Hours Wokred: "+hW);
    System.out.printf("Hourly Rate: "+"%.2f\n",hR);
    System.out.printf("Gross Pay: "+"%.2f\n",grossPay);
    System.out.printf("Tax Amount: "+"%.2f\n",taxAmount);
    System.out.printf("Net Pay: "+"%.2f\n",netPay);
    System.out.println(fN.charAt(0)+"."+lN);
    input.close();
  }
}
