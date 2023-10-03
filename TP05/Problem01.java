package TP05;

import java.util.Scanner;

public class Problem01 {
  // Write an application Java that let user input a number then list prime
  // numbers from 2 to inputted number. Prime number is positive number greater
  // than 2 and divisible only to its own and 1. Implements using while loop
  public static void main(String[] args) {
    int n, counter;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Required packages have been imported");
    System.out.println("A reader object has been defined ");
    System.out.print("Enter the n value : ");
    n = scanner.nextInt();
    System.out.print("Prime numbers between 1 to " + n + " are : ");
    for (int j = 2; j <= n; j++) {
      counter = 0;
      for (int i = 1; i <= j; i++) {
        if (j % i == 0) {
          counter++;
        }
      }
      if (counter == 2)
        System.out.print(j + " ");
    }
  }
}
