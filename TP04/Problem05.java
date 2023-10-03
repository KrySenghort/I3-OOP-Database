import java.util.Scanner;

public class Problem05 {
  public static void main(String[] args) {
    // ============= Exercise 05:
    // Write a program in Java to read 8 integers from keyboard. Then find maximum
    // number.
    Scanner scan = new Scanner(System.in);
    int max;
    System.out.print("Enter a : ");
    int a = scan.nextInt();
    System.out.print("Enter b : ");
    int b = scan.nextInt();
    System.out.print("Enter c : ");
    int c = scan.nextInt();
    System.out.print("Enter d : ");
    int d = scan.nextInt();
    System.out.print("Enter e : ");
    int e = scan.nextInt();
    System.out.print("Enter f : ");
    int f = scan.nextInt();
    System.out.print("Enter g : ");
    int g = scan.nextInt();
    System.out.print("Enter h : ");
    int h = scan.nextInt();
    max = a;
    if (max < b) {
      max = b;
    }
    if (max < c) {
      max = c;
    }
    if (max < d) {
      max = d;
    }
    if (max < e) {
      max = e;
    }
    if (max < f) {
      max = f;
    }
    if (max < g) {
      max = g;
    }
    if (max < h) {
      max = h;
    }
    System.out.printf("The maximum number is %d", max);
  }
}
