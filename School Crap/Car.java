
import java.util.Scanner;
import java.text.DecimalFormat;
public class Car {

  int fuel_efficiency;
  double mileage;
  double fuel_tank_capacity;
  static double fuel_level;
  int milesDriven;
  String color;
  String brand;
  int year;
  
  Scanner scan = new Scanner(System.in);
  DecimalFormat fm = new DecimalFormat("0.00");
  
  public Car(int fuel_efficiency, int mileage, double fuel_tank_capacity, String color, String brand, int year){
    this.fuel_efficiency = fuel_efficiency;
    this.mileage = mileage;
    this.fuel_tank_capacity = fuel_tank_capacity;
    fuel_level = 0;
    this.color = color;
    this.brand = brand;
    this.year = year;
  }

  public void addGas(double gallons){ //Sets fuel amount
    boolean repeat = true;
      while(repeat){
        if(gallons >= 0 && gallons <= fuel_tank_capacity){
          fuel_level = fuel_level + gallons;
          repeat = false;
        } else{
          System.out.println("That amount of gasoline is invalid for the cpacity of the fuel tank,");
          System.out.print("please re-enter the amount you would wish to enter: ");
          double fuel = scan.nextDouble();
          gallons = fuel;
        }
      }
  }
  
  public static double getFuelLevel(){ //gets fuel amount
    return fuel_level;
  }
  
  
  public void drive(double milesDriven){
    fuel_level = fuel_level - (milesDriven / fuel_efficiency);
    mileage = mileage + milesDriven;
  }


  public void displayCar(){
    String fuel = (fm.format(getFuelLevel()));
    System.out.println("fuel level: "+fuel + " gallons");
    System.out.println("fuel efficiency: "+fuel_efficiency+" mpg");
    System.out.println("fuel tank capacity: "+fuel_tank_capacity+" gallons");
    System.out.println("mileage: "+mileage+" miles");
    System.out.println("Your vehicle's color: "+color);
    System.out.println("Your vehicle's brand is: "+brand);
    System.out.println("Your vehicle's manufactured year is: "+year);
  }

}