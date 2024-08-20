/*
*****************************************
 *  File : TestTransportation.java
 *  Author : Celia Ho   
 *  Last Modified : Sun Mar 24 2024
 *  Description : Create TestTransportation that has a printTransportation method that prints a single instance of Transportation.  Instantiate an array of Transportation with 2 Cars and 3 Bicycles. Exercise all your goForward, etc. methods. Print each element of the array using printTransportation.
 ******************************************/

public class TestTransportation {

  // MAIN SECTION
  public static void main(String[] args) {
    // Create TestTransportation that has a printTransportation method that prints a single instance of Transportation. 

    // Instantiate an array of Transportation with 2 Cars and 3 Bicycles. 
    Transportation[] transportation = new Transportation[5];

    transportation[0] = new Car("Mazda", "CX-5", 50, 0); // Miles set to 0 to trigger default of 1 - works. Year deliberately set low to trigger default of 1911 - works.
    transportation[1] = new Car("McLaren", "Artura", 2020, 23000);
    transportation[2] = new Bicycle("Masi", "Aldrinator", 2020);
    transportation[3] = new Bicycle("Schwinn", "Black Commute", 2024);  // Year deliberately set low to trigger default year of 1811 - works.
    transportation[4] = new Bicycle("Dahon Mariner", "D8", 50);
    
    // Exercise all vehicle movement methods. 
    System.out.println("Vroom vroom, time to drive our hybrid sports car, the " + transportation[1].getMake() + " " + transportation[1].getModel() + "!"); 
    System.out.println("Now starting: " + transportation[1].start() + ".");
    System.out.println("Now reversing: " + transportation[1].goReverse() + ".");
    System.out.println("Now turning left: " + transportation[1].turnLeft() + ".");
    System.out.println("Now going forward: " + transportation[1].goForward() + ".");
    transportation[1].goFaster();
    transportation[1].goFaster();
    transportation[1].goFaster();
    transportation[1].goFaster();
    transportation[1].goFaster();
    transportation[1].goFaster();
    transportation[1].goFaster();
    transportation[1].goFaster();
    transportation[1].goFaster();
    transportation[1].goFaster();
    transportation[1].goFaster();
    transportation[1].goFaster();
    transportation[1].goFaster();
    System.out.println("Now accelerated to " + transportation[1].getCurrentSpeed() + " MPH.");
    transportation[1].goSlower();
    System.out.println("Now decelerated to " + transportation[1].getCurrentSpeed() + " MPH.");
    System.out.println("Now turning right: " + transportation[1].turnRight() + ".");
    System.out.println("Now stopping: " + transportation[1].stop() + ".\n");

    System.out.println("Zoom zoom, time to ride our collapsible commuter's dream, the " + transportation[4].getMake() + " " + transportation[4].getModel() + "!");
    // Test code to check that reversing a bicycle outputs an empty string
    System.out.println("Now reversing: " + transportation[4].goReverse() + ".");
    System.out.println("Now turning left: " + transportation[4].turnLeft() + ".");
    System.out.println("Now going forward: " + transportation[4].goForward() + ".");
    transportation[4].goFaster();
    System.out.println("Now accelerated to " + transportation[4].getCurrentSpeed() + " MPH.");
    transportation[4].goFaster();
    transportation[4].goFaster();
    transportation[4].goFaster();
    System.out.println("Now accelerated to " + transportation[4].getCurrentSpeed() + " MPH.");
    transportation[4].goSlower();
    System.out.println("Now decelerated to " + transportation[4].getCurrentSpeed() + " MPH.");
    System.out.println("Now turning right: " + transportation[4].turnRight() + ".");
    System.out.println("Now stopping: " + transportation[4].stop() + ".\n");
    
    // Print each element of the array using printTransportation.
    System.out.println("Our garage holds the following vehicles: ");
    printTransportation(transportation[0]); // Miles should default to 1 - works. Year should default to 1911 - works.
    printTransportation(transportation[1]); 
    printTransportation(transportation[2]);
    printTransportation(transportation[3]); 
    printTransportation(transportation[4]); // Year should default to 1811 - works.

  // MAIN ENDS
  }


  // METHOD DEFINITION SECTION
  // printTransportation method that prints a single instance of Transportation
  public static void printTransportation(Transportation object) {
    System.out.println(object);
  }

// TestTransportation CLASS ENDS
}