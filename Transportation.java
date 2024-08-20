/* *****************************************
 *  File : Transportation.java
 *  Author : Celia Ho   
 *  Last Modified : Sun Mar 24 2024
 *  Description : Refactor (redesign) the classes so that you have a super (base) class called Transportation that have the subclasses Car and Bicycle.  The idea here is to minimize repeated code. 
 * ******************************************/

public class Transportation {

  // Member attributes to follow:
  private String 
      make, 
      model;
  
  private int
  //    year,         
      currentSpeed; // start at 0
      
  // No-argument constructor
  public Transportation() {
  }

  // Parameterized constructor
  public Transportation(String make, String model) {
    this.make = make;
    this.model = model;
    currentSpeed = 0; // Start at 0 MPH
  }

  // Getters and setters to follow:
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getCurrentSpeed() {
    return currentSpeed;
  }

  public void setCurrentSpeed(int currentSpeed) {
    this.currentSpeed = currentSpeed;
  }

  @Override
  public String toString() {
    return "Transportation [Make=" + make + ", Model=" + model + ", Year=" + year + ", Current Speed="
        + currentSpeed + "]";
  }

  public String goForward() {
    return "Forward";
  }

  public String goReverse() {
    return "Reverse";
  }

  public String stop() {
    return "Stop";
  }

  public String start() {
    return "Start";
  }

  public String turnLeft() {
    return "Turn left";
  }

  public String turnRight() {
    return "Turn right";
  }

  public void goFaster() { 
    currentSpeed += 1;
  }

  public void goSlower() {
    currentSpeed -= 1;
  }

// Transportation CLASS ENDS
}
