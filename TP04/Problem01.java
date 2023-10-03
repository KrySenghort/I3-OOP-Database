import java.util.Scanner;

public class Problem01 {
  public static void main(String[] args) {
    // =================== Exercise 01:
    // Implement an application Java that let user input a number then determine if
    // it is a prime number using PrimeNumber
    // class which is previously defined.
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number : ");
    int number = scan.nextInt();
    if (isPrime(number)) {
      System.out.print(number + " is prime number.");
    } else {
      System.out.println(number + " is non-prime number");
    }
  }

  static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
