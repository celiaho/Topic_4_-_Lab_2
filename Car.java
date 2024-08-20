/* *****************************************
 *  File : Car.java
 *  Author : Celia Ho   
 *  Last Modified : Sun Mar 24 2024
 *  Description : Create the following:
 *  	Car 	
- 	make: String 	
- 	model: String 	
- 	year: int 	year > 1910,
- 	miles: int 	miles > 0
- 	currentSpeed: int 	start at 0
+ 	Car() 	
+ 	Car(make:String, model:String, year: int, miles:int) 	
+ 	setters & getters 	
+ 	toString 	
+ 	goForward(): String 	
+ 	goReverse(): String 	
+ 	stop(): String 	
+ 	start(): String 	
+ 	turnLeft():String 	
+ 	turnRight():String 	
+ 	goFaster() 	increase speed by 5
+ 	goSlower() 	decrease speed by 5
 ******************************************/

public class Car extends Transportation {

  // Member attributes
  private int
    year,         // > 1910
    miles;        // > 0

  // No-argument constructor
  public Car() {
  }

  // Parameterized constructor
  public Car(String make, String model, int year, int miles) {
    super (make, model);
    setYear(year);
    setMiles(miles);
  }

  // Getters and setters to follow:
  public int getYear() {
    return year;
  }

  public void setYear(int year) { // > 1910
    if (year <= 1910)
      this.year = 1911; 
      // Must be THIS.year, not year: this.year = the variable/member attribute "year" (the year of the car) and not the incoming parameter "year" in the setter (the year to set the car to--the parameter taken by the constructor). If not specified, the parameter takes precedence because it is the most immediate info at hand (is "closer at hand" or "has local scope.")
    else
      this.year = year;
  }

  public int getMiles() {
    return miles;
  }

  public void setMiles(int miles) { // > 0
    if (miles <= 0)
      miles = 1;
    this.miles = miles;
  }

  // Override methods for vehicle movement
  @Override
  public void goFaster() { // increase speed by 5
    setCurrentSpeed(getCurrentSpeed() + 5);
  }

  @Override
  public void goSlower() { // decrease speed by 5
    setCurrentSpeed(getCurrentSpeed() - 5);
  }

  // Override toString
  @Override
  public String toString() {
    return "Car [Make=" + getMake() + ", Model=" + getModel() + ", Year=" + year + ", Miles=" + miles + ", Current Speed="
        + getCurrentSpeed() + "]";
  }

// Car CLASS ENDS
}