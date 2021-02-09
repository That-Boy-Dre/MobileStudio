
import java.util.Scanner;
public class TestCar {
  

  public static void main(String[] args) {
  

    Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the related information for your vehicle");
        System.out.print("Enter fuel efficiency (in mpg): ");
        int FE = scan.nextInt();
        System.out.print("Enter mileage (max distance the car has driven): ");
        int M = scan.nextInt();
        System.out.print("Enter fuel tank capacity (in gallons): ");
        double FTC = scan.nextInt(); 

    System.out.println("Initiliazing car...\n");

    Car vehicle = new Car(FE,M,FTC);

    while(true){
      System.out.println("Car Menu");
      System.out.println("1 - Add gas");
      System.out.println("2 - Drive");
      System.out.println("3 - Display car info");
      System.out.println("4 - Exit");

      System.out.print("\nEnter your choice: ");
      int choice = scan.nextInt();
  
    }

  }
}


