
public class Car {

  double fuel_efficiency;
  double mileage;
  double fuel_tank_capacity;
  static double fuel_level;
  double milesDriven;
  
  
  public Car(double efficiency, double mileage, double tankCap){
    fuel_level = 0;
  }

  public void drive(double milesDriven){
    fuel_level = (fuel_efficiency * fuel_tank_capacity) - milesDriven;
   
  }

  public static double getFuelLevel(){
    return fuel_level;
  }

  public void addGas(double gallons){
    fuel_level = fuel_level + gallons;
  }

  public double displayCar(){
    getFuelLevel();
    return fuel_efficiency;
    return fuel_tank_capacity;
    return mileage + milesDriven;
  }

}