import java.util.Scanner;

public class Problem06 {
  // A shipping ship need to transport goods from point A to point C. This ship
  // capable to store maximum 5000 liters of
  // Petrol. The ship can stop only one time to refill, it is point B. The
  // distance between A to B, between B to C, and weight
  // are given by user. The number of liters of petrol used by the ship is depend
  // on the weight of goods loaded. The number
  // of liters used is described a below:
  // - Up to 5000Kg, uses 10L/Km
  // - Up to 10000Kg, uses 20L/Km
  // - Up to 20000Kg, uses 25L/Km
  // - Up to 30000Kg, uses 35L/Km
  // - More than 30000Kg, cannot be loaded
  // Write a program in Java to calculate the minimum amount of liters needed to
  // refill at point B in order to reach point C.
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter weight of goods : ");
    int weight = scan.nextInt();
    System.out.println("Enter distance from B to C : ");
    int distance = scan.nextInt();
    int liters;
    if (weight > 0 && weight <= 5000) {
      liters = distance * 10;
      System.out.print("We need " + liters + " liters to reach point C");
    } else if (weight > 5000 && weight <= 10000) {
      liters = distance * 20;
      System.out.print("We need " + liters + " liters to reach point C");
    } else if (weight > 10000 && weight <= 20000) {
      liters = distance * 25;
      System.out.print("We need " + liters + " liters to reach point C");
    } else if (weight > 20000 && weight <= 30000) {
      liters = distance * 35;
      System.out.print("We need " + liters + " liters to reach point C");
    } else if (weight > 30000) {
      System.out.print("it cannot be loaded.");
    } else {
      System.out.print("Invalid");
    }
  }
}
