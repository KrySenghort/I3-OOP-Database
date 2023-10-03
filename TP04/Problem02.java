import java.util.Scanner;

public class Problem02 {
  public static void main(String[] args) {
    // ============= Exercise 02:
    // Lucky number is a 6 digits number that sum of first 3 digits equals to sum of
    // last 3 digits.
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = scan.nextInt();
    int digit1 = num % 10;
    num = num / 10;
    int digit2 = num % 10;
    num = num / 10;
    int digit3 = num % 10;
    num = num / 10;
    int digit4 = num % 10;
    num = num / 10;
    int digit5 = num % 10;
    num = num / 10;
    int digit6 = num % 10;
    int sum1 = digit6 + digit5 + digit4;
    int sum2 = digit1 + digit2 + digit3;
    if (sum1 == sum2) {
      System.out.print("it is a lucky number.");
    } else {
      System.out.print("it is not a lucky number.");
    }
  }
}
