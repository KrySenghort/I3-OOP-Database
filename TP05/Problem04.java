package TP05;

import java.util.Scanner;

public class Problem04 {
  // Write a program in Java to calculate company profits for 12 months.
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int total = 0;
    for (int i = 1; i <= 12; i++) {
      System.out.print("Enter profit for month#" + "[" + i + "] : ");
      int x = scan.nextInt();
      total = total + x;
    }
    System.out.print("The total profit for 12 month is equal to : " + total);
  }
}
