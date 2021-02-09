
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

    Car vehicle = new Car()
    
  }
}


