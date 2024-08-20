/* *****************************************
 *  File : Bicycle.java
 *  Author : Celia Ho   
 *  Last Modified : Sun Mar 24 2024
 *  Description : Create the following:
 *  	Bicycle 	
- 	make: String 	
- 	model: String 	
- 	year: int 	year > 1810,
- 	currentSpeed: int 	start at 0
+ 	Bicycle() 	
+ 	Bicycle(make:String, model:String, year: int) 	
+ 	setters & getters 	
+ 	toString 	
+ 	goForward(): String 	
+ 	goReverse(): String 	return empty string
+ 	stop(): String 	
+ 	start(): String 	
+ 	turnLeft():String 	
+ 	turnRight():String 	
+ 	goFaster() 	increase speed by 1
+ 	goSlower() 	decrease speed by 1
 ******************************************/

public class Bicycle extends Transportation {

  private int
    year;         // > 1810

  // No-argument constructor
  public Bicycle() {
  }
  
  // Parameterized constructor
  public Bicycle(String make, String model, int year) {
    super (make, model);
    setYear(year);
  }

  // Getters and setters to follow:
  public int getYear() {
      return year;
  } 

  public void setYear(int year) { // > 1810
    if (year <= 1810)
      this.year = 1811;
    else
      this.year = year;
  }

  // Override methods for vehicle movement
  @Override
  public String goReverse() { // Return empty string
    return "";
  }

  // Override toString
  @Override
  public String toString() {
    return "Bicycle [Make=" + getMake() + ", Model=" + getModel() + ", Year=" + year + ", Current Speed=" + getCurrentSpeed() + "]";
  }

// Bicycle CLASS ENDS
}