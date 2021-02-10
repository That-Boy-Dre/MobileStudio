
import java.util.Scanner;
public class carTester {
  

  public static void main(String[] args) {
  

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the related information for your vehicle");
    System.out.print("Enter fuel efficiency (in mpg): ");
    int FE = scan.nextInt();
    System.out.print("Enter mileage (max distance the car has driven): ");
    int M = scan.nextInt();
    System.out.print("Enter fuel tank capacity (in gallons): ");
    double FTC = scan.nextDouble();
    System.out.print("Enter your vehicle's color: ");
    String C = scan.next();
    System.out.print("Enter your vehicle's brand: ");
    String B = scan.next();
    System.out.print("Enter your vehicle's manufactured year: ");
    int Y = scan.nextInt();

    System.out.println("Initializing car...\n");

    Car vehicle = new Car(FE,M,FTC,C,B,Y); //vehicle object created for program to use

    while(true){ //Start of while loop
          System.out.println("\nCar Menu");
          System.out.println("1 - Add gas");
          System.out.println("2 - Drive");
          System.out.println("3 - Display car info");
          System.out.println("4 - Exit");

          System.out.print("\nEnter your choice: ");
          int choice = scan.nextInt();

          if(choice == 1){
            System.out.print("How much gas will you like to add (in gallons)? ");
            double G = scan.nextDouble();
            vehicle.addGas(G);
          } else if(choice == 2){
            System.out.print("How far have you driven (in miles)? ");
            double D = scan.nextDouble();
            vehicle.drive(D);
          } else if(choice == 3){
            System.out.println("Displaying all vehicle information");
            vehicle.displayCar();
          } else if(choice == 4) {
            System.out.println("The program has ended");
            break;
          }
    } //End of while loop

    scan.close();
  }
}


