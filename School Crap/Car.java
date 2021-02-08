
public class Car {

  int fuel_efficiency;
  int mileage;
  int fuel_tank_capacity;
  static int fuel_level;
  int milesDriven;
  
  
  public Car(int fuel_efficiency, int mileage, int fuel_tank_capacity){
    this.fuel_efficiency = fuel_efficiency;
    this.mileage = mileage;
    this.fuel_tank_capacity = fuel_tank_capacity;
    fuel_level = 0;
  }

  public void drive(int milesDriven){
    this.milesDriven = milesDriven;
    fuel_level = (this.fuel_efficiency * this.fuel_tank_capacity) - this.milesDriven;
   
  }

  public static int getFuelLevel(){
    return fuel_level;
  }

  public void addGas(int gallons){
    fuel_level = fuel_level + gallons;
  }

  public void displayCar(){
    System.out.println("fuel level: "+getFuelLevel());
    System.out.println("fuel efficiency: "+this.fuel_efficiency+" mpg");
    System.out.println("fuel tank capacity: "+this.fuel_tank_capacity+" gallons");
    System.out.println("mileage: "+(this.mileage + milesDriven));

  }

}

