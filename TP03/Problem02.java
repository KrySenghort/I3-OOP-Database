import java.util.Scanner;

public class Problem02 {
  // ============= Exercise 02:
  // Write a program in Java to a Time (hours, minutes, seconds) to number of
  // seconds.Hours, minutes and seconds are inputted from
  // keyboard
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Program for converting time to seconds.");
    System.out.print("\ninput hours : ");
    int hour = scan.nextInt();
    System.out.print("\ninput minutes : ");
    int minute = scan.nextInt();
    System.out.print("\ninput seconds : ");
    int second = scan.nextInt();
    int sum = hour * 3600 + minute * 60 + second;
    System.out.print("\nNumber of seconds = " + hour + " x 3600 + " + minute + " x 60 + " + second + " = " + sum);

  }

}
