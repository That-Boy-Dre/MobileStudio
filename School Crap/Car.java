
public class Car {

  int fuel_efficiency;
  double mileage;
  double fuel_tank_capacity;
  static double fuel_level;
  int milesDriven;
  
  
  public Car(int fuel_efficiency, int mileage, double fuel_tank_capacity){
    this.fuel_efficiency = fuel_efficiency;
    this.mileage = mileage;
    this.fuel_tank_capacity = fuel_tank_capacity;
    fuel_level = 0;
  }

  public void addGas(int gallons){ //Sets fuel amount
    fuel_level = fuel_level + gallons;
  }
  
  public static double getFuelLevel(){ //gets fuel amount
    return fuel_level;
  }
  
  
  public void drive(double milesDriven){
    fuel_level = fuel_level - (milesDriven / fuel_efficiency);
    mileage = mileage + milesDriven;
  }

  public void displayCar(){
    System.out.println("fuel level: "+getFuelLevel()+" gallons");
    System.out.println("fuel efficiency: "+fuel_efficiency+" mpg");
    System.out.println("fuel tank capacity: "+fuel_tank_capacity+" gallons");
    System.out.println("mileage: "+mileage);

  }

}

