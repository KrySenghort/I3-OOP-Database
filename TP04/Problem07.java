import java.util.Scanner;

public class Problem07 {
  // Write a program in Java to tell whether inputted year is Leap year. Leap year
  // is a year that is divisible by 4 but not
  // divisible by 100, or a year that divisible by 400. In case user input number
  // less than 1, the program will display error
  // message.
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter year : ");
    int year = scan.nextInt();
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      System.out.print("It is a leap year.");
    } else if (year < 1) {
      System.out.print("Error let try again!!");
    } else {
      System.out.print("It is not a leap year.");
    }
  }
}
