import java.util.Scanner;

public class Problem05 {
  public static void main(String[] args) {
    // // ============= Exercise 05:
    // Write a program in Java to calculate duration of travel from ITC to Airport.
    // The distance is 7 km and the average speed is 30km/h. The traffic jam factor
    // is given as percentages of the average speed. After the calculation, display
    // duration in format HH:mm:ss.
    Scanner scan = new Scanner(System.in);
    System.out.print("input traffic jam factor (in percentage [0-100]): ");
    int percentage = scan.nextInt();
    int distance = 7;
    int velocity = 30;
    int hour = (1 + percentage / 100) * (distance / velocity);
    int minute = (1 / 60) * hour;
    int second = minute % 60;
    System.out.print("The time duration is in format " + hour + ":" + minute + ":" + second);

  }
}
