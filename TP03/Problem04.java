import java.util.Scanner;

public class Problem04 {
  public static void main(String[] args) {
    // ============= Exercise 04:
    // Write a program in Java to money in Riels to Dollar. Suppose that conversion
    // rate is 1$ = 4000៛. Example:
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter money in riel : ");
    float moneyRiel = scan.nextFloat();
    float moneyDollar = (float) (moneyRiel / 4000);
    System.out.println(moneyRiel + "Riel = " + moneyDollar + "$");

  }

}
