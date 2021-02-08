
public class Car {

  double fuel_efficiency;
  double mileage;
  double fuel_tank_capacity;
  static double fuel_level;
  double milesDriven;
  
  
  public Car(double fuel_efficiency, double mileage, double fuel_tank_capacity){
    this.fuel_efficiency = fuel_efficiency;
    this.mileage = mileage;
    this.fuel_tank_capacity = fuel_tank_capacity;
    fuel_level = 0;
  }

  public void drive(double milesDriven){
    fuel_level = (this.fuel_efficiency * this.fuel_tank_capacity) - milesDriven;
   
  }

  public static double getFuelLevel(){
    return fuel_level;
  }

  public void addGas(double gallons){
    fuel_level = fuel_level + gallons;
  }

  public void displayCar(){
    System.out.println("fuel level: "+getFuelLevel());
    System.out.println("fuel efficiency: "+this.fuel_efficiency);
    System.out.println("fuel tank capacity: "+this.fuel_tank_capacity);
    System.out.println("mileage: "+(mileage + milesDriven));

  }

}