
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
  
  public Car(int fuel_efficiency, int mileage, double fuel_tank_capacity, String color, String brand, int year){ //Car constructor 
    this.fuel_efficiency = fuel_efficiency;
    this.mileage = mileage;
    this.fuel_tank_capacity = fuel_tank_capacity;
    fuel_level = 0;
    this.color = color;
    this.brand = brand;
    this.year = year;
  } //Car constructor

  public void addGas(double gallons){ //Begining of addGas method
  boolean repeat1 = true;
          while(repeat1){
            if(gallons >= 0 && gallons <= fuel_tank_capacity){
              fuel_level = fuel_level + gallons;
              repeat1 = false;
            } else{
              System.out.println("That amount of gasoline is invalid for the cpacity of the fuel tank,");
              System.out.print("please re-enter the amount you would wish to enter: ");
              double fuel = scan.nextDouble();
              gallons = fuel;
            }
          }
  } //End of addGas method
  
  public static double getFuelLevel(){ //Begining of getFuelLevel method
    return fuel_level;
  } //End of getFuelLevel method
  
  
  public void drive(double milesDriven){ //Begining of drive method
  boolean repeat2 = true;
        while(repeat2){
          if(milesDriven >= 0 && milesDriven <= (fuel_efficiency * fuel_tank_capacity)){
            fuel_level = fuel_level - (milesDriven / fuel_efficiency);
            mileage = mileage + milesDriven;
            repeat2 = false;
          } else{
            System.out.println("The max range of your vehicle is "+(fuel_efficiency * fuel_tank_capacity)+" miles");
            System.out.println("your miles driven is either too far below or over the maximum");
            System.out.print("range capable of your vehicle, Please re-enter how far you have driven: ");
            double distance = scan.nextDouble();
            milesDriven = distance;
          }
        }
  } //End of drive method



  public void displayCar(){ //Begining of displayCar method
    String fuel = (fm.format(getFuelLevel()));
    System.out.println("fuel level: "+fuel + " gallons");
    System.out.println("fuel efficiency: "+fuel_efficiency+" mpg");
    System.out.println("fuel tank capacity: "+fuel_tank_capacity+" gallons");
    System.out.println("mileage: "+mileage+" miles");
    System.out.println("Your vehicle's color: "+color);
    System.out.println("Your vehicle's brand is: "+brand);
    System.out.println("Your vehicle's manufactured year is: "+year);
  } //End of displayCar method

}