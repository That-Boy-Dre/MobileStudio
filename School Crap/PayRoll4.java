


import java.util.Scanner;
public class PayRoll4{ //PayRoll class



	public static void main(String[] args){ //main method

		String id, firstName, lastName, status;
		double hoursWorked, hourlyRate, grossPay, taxAmount=0, netPay; 
		//final double TAXRATE = 0.3; 
		Scanner in = new Scanner(System.in);
    Scanner open = new Scanner(System.in);


    Employee theWorker = new Employee();//Employee Object

     while(true){//start of while loop
     
		            System.out.println("Welcome to St. John's Student Payroll System");

		            System.out.println("Please enter the following information.");
                System.out.println("Employee id: ");
                id = in.next();

                
                System.out.println("First Name: ");
                firstName = in.next();
                while(!firstName.matches("[a-zA-Z]+")){ //error checking for non strings
                  System.out.println("Please enter a valid name!");
                  firstName = in.next();
                }

                System.out.println("Last Name: ");
                lastName = in.next();
                while(!lastName.matches("[a-zA-Z]+")){ //error checking for non strings
                  System.out.println("Please enter a valid name!");
                  lastName = in.next();
                }
                
                System.out.println("Enter single or married: ");
                status = in.next();
                while(!status.matches("[a-zA-Z]+")){ //error checking for non strings
                  System.out.println("Please enter a valid name!");
                  status = in.next();
                }

                System.out.println("Hours worked: ");
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
              grossPay = theWorker.computeGrossPay(hoursWorked, hourlyRate);//make sure it matches the order
                //method call added
                
              // compute taxAmount
              taxAmount = theWorker.computeTaxAmount(grossPay, status);
                
              // compute netPay
              netPay = theWorker.computeNetPay(grossPay, taxAmount);

              // display all employee information
              theWorker.displayEmployee(id, firstName, lastName, hoursWorked, hourlyRate, grossPay, taxAmount, netPay);		 
              
              System.out.println("If you wish to end the program now enter -1 or quit");  
              String answer = open.next();
                  if(answer.equalsIgnoreCase("quit")||answer == "-1"){
                    System.out.println("The program has ended, have a good day");
                    break;
                  }

    
                  
    } // end of while loop



	}// main method
}// Payroll class



