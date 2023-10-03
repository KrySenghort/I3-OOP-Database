import java.util.Scanner;

public class Problem01 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // ============= Exercise 01:
    // Implement an application Java that take a given number of seconds for
    // converting into time with format hours:minutes:seconds.
    System.out.print("Input the number of seconds: ");
    int second = scan.nextInt();
    int hour = (second / 3600) % 24;
    second = second % 3600;
    int minute = second / 60;
    second = second % 60;
    System.out.printf("%02d:%02d:%02d", hour, minute, second);
  }
}
