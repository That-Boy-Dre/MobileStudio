

import java.util.Scanner;
public class PayRoll3 {

//==============================================================================================================================================================================

	public static double computeGrossPay(double hoursWorked, double hourlyRate) {//variable names can be different, but need same order
		double grossPay;
			if(hoursWorked<=40) {
				grossPay = hoursWorked * hourlyRate;
			}
			else {
				grossPay = 40*hourlyRate + (hoursWorked-40)*hourlyRate*1.5;
			}
		return grossPay;
		}
	
	public static double computeTaxAmount(double grossPay, String status) {
		double taxAmount;
		if(status.equalsIgnoreCase("single")||status.equalsIgnoreCase("s")){	 //makes it not case sensitive
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
		else { //if not single, has to be married
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
			 }//if statements
		}//end of the married case
		return taxAmount;
	}
	public static double computeNetPay(double grossPay, double taxAmount) {
		double netPay;
		netPay = grossPay - taxAmount;
		return netPay;
  }
  
	public static void displayEmployee(String id, String firstName, String lastName, double hoursWorked, double hourlyRate, double grossPay, double taxAmount, double netPay) {
	 System.out.println("Payroll Summary for Employee ID: " + id);
	 System.out.println("First Initial and Last Name: " + firstName.charAt(0) + ". " + lastName);
	 System.out.printf("%20s%10.2f\n", "Hours Worked: ", hoursWorked);
	 System.out.printf("%20s%10.2f\n", "Hourly Rate: ", hourlyRate);
	 System.out.printf("%20s%10.2f\n", "Gross Pay: ", grossPay);
	 System.out.printf("%20s%10.2f\n", "Tax Amount: ", taxAmount);
	 // whenever you have "\n" it skips a line or you can just do System.out.println() in between
	 System.out.printf("%20s%10.2f\n", "Net Pay: ", netPay);
	}
	
//==============================================================================================================================================================================


	public static void main(String[] args) {
// include variable declarations
		String id, firstName, lastName;
		double hoursWorked, hourlyRate, grossPay, taxAmount=0, netPay; //needs to initialize as =0 for if statement
		//final double TAXRATE = 0.3; //constant variable - declare and initialize at the same time
		String status;
		Scanner in = new Scanner(System.in);

		 System.out.println("Welcome to St. John's Student Payroll System");

		 System.out.println("Please enter the following information.");
		 System.out.println("Employee id: ");
		 id = in.next();

		 
		 System.out.println("First Name: ");
		 firstName = in.next();
		 
		 System.out.println("Last Name: ");
		 lastName = in.next();
		 
		 System.out.println("Enter single or married: ");
		 status = in.next();
		 
		 System.out.println("Hours worked: ");
// get user input
		 hoursWorked = in.nextDouble();
		 while(hoursWorked<0) {
			System.out.println("Hours worked cannot be negative.");
			System.out.println("Enter hours worked: ");
			 hoursWorked = in.nextDouble();
		 }

		 System.out.println("Hourly rate: ");
		 hourlyRate = in.nextDouble();
		 while(hourlyRate<0) {
				System.out.println("Hourly rate cannot be negative.");
				System.out.println("Enter hours rate: ");
				hourlyRate = in.nextDouble();
		 }
		

// compute grossPay
		 grossPay = computeGrossPay(hoursWorked, hourlyRate);//make sure it matches the order
		 //method call added
		 
// compute taxAmount
		taxAmount = computeTaxAmount(grossPay, status);
		 
// compute netPay
		 netPay = computeNetPay(grossPay, taxAmount);

// display all employee information
		 displayEmployee(id, firstName, lastName, hoursWorked, hourlyRate, grossPay, taxAmount, netPay);		 
		 in.close();
	}// main method
}// Payroll class
