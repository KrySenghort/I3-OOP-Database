package TP05;

import java.util.Scanner;

public class Problem05 {
  // Write a program in Java to check whether a given string is a palindrome().
  // Palindrome are words or phrases that the same when reading from left to right
  // or from right to left. The check method is chosen by user.
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter string : ");
    String string = scan.next();
    System.out.print("1. Reversed method");
    System.out.print("\n2. Loop method");
    System.out.print("\nEnter method to process : ");
    int choice = scan.nextInt();
    if (choice == 1) {
      loop(string);
    } else if (choice == 2) {
      reversed(string);
    } else {
      System.out.print("Invalid choice !!!");
    }
  }

  // ===================================== Reversed method:
  static void reversed(String string) {
    String reverse = new StringBuffer(string).reverse().toString();
    if (string.equals(reverse)) {
      System.out.println("It is a palindrome");
    } else {
      System.out.println("It is not a palindrome");
    }
  }

  // ===================================== Loop method:
  static void loop(String string) {
    boolean flag = true;
    string = string.toLowerCase();
    for (int i = 0; i < string.length() / 2; i++) {
      if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
        flag = false;
        break;
      }
    }
    if (flag)
      System.out.println("Given string is palindrome");
    else
      System.out.println("Given string is not a palindrome");
  }
}