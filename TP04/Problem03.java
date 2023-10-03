import java.util.Scanner;

public class Problem03 {
  public static void main(String[] args) {
    // // ============= Exercise 03:
    // Create class and write a program in Java to read a 4 digits number from
    // keyboard. Then the program will reverse given
    // number, and display it. If user input number other than 4 digits number,
    // display error message.
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = scan.nextInt();
    int reversed = 0;
    int count = 0;
    System.out.print("Before Reversing : " + num);
    while (num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num = num / 10;
      count++;
    }
    if (count == 4) {
      System.out.print("\nAfter Reversing : " + reversed);
    } else {
      System.out.print("\nError: invalid number, please input only 4 digits number");
    }
  }
}
