package TP05;

import java.util.Scanner;

public class Problem03 {
  // Write a program in Java to display even numbers (ex: 2, 4, 6, 8, etc.)
  // located between A and 500. Where A is given by user (0<A<500).
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter A : ");
    int A = scan.nextInt();
    System.out.println("The even numbers are such that : ");
    for (int i = A; i <= 500; i++) {
      if (i % 2 == 0) {
        System.out.print(i + ", ");
      } else {
        continue;
      }
    }
  }
}
