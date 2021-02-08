

import java.util.Scanner;
public class PayRoll {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);


    System.out.println("Welcome to St. John's Student Payroll System\nPlease enter the following information");

    System.out.print("\nEmployee id: ");
        String id = input.nextLine();

    System.out.print("Hours worked: ");
        int hW = input.nextInt();

    System.out.print("Hourly Rate: ");
        double hR = input.nextDouble();

    System.out.print("Enter your first name: ");
        String fN = input.next();
        
    System.out.print("Enter your last name: ");
        String lN = input.next();

    final double taxRate = 0.3;
          double grossPay = (hW * hR);
          double taxAmount = (grossPay * taxRate);
          double netPay = (grossPay - taxAmount);

    //printf can only format doubles 
    System.out.println("\nPayroll Summary  for Employee ID: "+id);
    System.out.println("Hours Wokred: "+hW);
    System.out.printf("Hourly Rate: "+"%.2f\n",hR);
    System.out.printf("Gross Pay: "+"%.2f\n",grossPay);
    System.out.printf("Tax Amount: "+"%.2f\n",taxAmount);
    System.out.printf("Net Pay: "+"%.2f\n",netPay);
    System.out.println(fN.charAt(0)+". "+lN);
    input.close();
    
  }
}


/*
  NumberFormat formatter = new DecimalFormat("#0.00"); //formatter declared

    String HW = (formatter.format(hoursWorked)); //output formatter used for hours worked
    String HR = (formatter.format(hourlyRate)); //output formatter used for the hourly rate
    String GP = (formatter.format(hoursWorked * hourlyRate)); // output formatter used for the gross pay
    String TA = (formatter.format((hoursWorked*hourlyRate)*taxRate)); //output formatter used for the tax amount
    String NP = (formatter.format((hoursWorked*hourlyRate)-(hoursWorked*hourlyRate)*taxRate));

    
    System.out.println("Payroll Summary for Employee ID: "+id);
    System.out.println("Hours Worked: "+HW); 
    System.out.println("Hourly Rate: "+HR);
    System.out.println("Gross Pay: "+GP);
    System.out.println("Tax Amount: "+TA);
    System.out.println("Net Pay: "+NP);
    System.out.println(first.charAt(0)+"."+last); //employee's first initial of first name and last name
    */