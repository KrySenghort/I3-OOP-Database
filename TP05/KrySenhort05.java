package TP05;

import java.util.Scanner;

public class KrySenhort05 {
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

  // ================ Exercise 01:
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
    // ========================== Exercise 02:
    // Write a program in Java to display odd numbers (ex: 1, 3, 5, 7, etc.) located
    // between 0 and 500.
    System.out.print("The even number are such as : ");
    for (int i = 0; i <= 500; i++) {
      if (i % 2 != 0) {
        System.out.print(i + ", ");
      } else {
        continue;
      }
    }
    // ========================== Exercise 03:
    // Write a program in Java to display even numbers (ex: 2, 4, 6, 8, etc.)
    // located between A and 500. Where A is given by user (0<A<500).
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
    // ========================== Exercise 04:
    // Write a program in Java to calculate company profits for 12 months.
    int total = 0;
    for (int i = 1; i <= 12; i++) {
      System.out.print("Enter profit for month#" + "[" + i + "] : ");
      int x = scan.nextInt();
      total = total + x;
    }
    System.out.print("The total profit for 12 month is equal to : " + total);
    // ========================== Exercise 05:
    // Write a program in Java to check whether a given string is a palindrome().
    // Palindrome are words or phrases that the same when reading from left to right
    // or from right to left. The check method is chosen by user.
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
    // ============================== Exercise 06:
    // Write a method makePalindrome() that creates a reverse copy of given String,
    // and then join them to make a Palindrome.
    // Then, write a program in Java to create a reverse copy of given String.
    System.out.print("Enter string : ");
    String string1 = scan.next();
    String string2 = "";
    for (int i = 0; i < string1.length(); i++) {
      string2 = string1.charAt(i) + string2;
    }
    System.out.println("After processing makePalindrome(): " + string1 + string2);
    // ============================== Exercise 07:
    // Write a program in Java to read a sentence from keyboard. Then replaces all
    // escape characters follow below table:
    // \n : new line
    // \t : tab
    // \\ : slash
    // // : comment
    // :) : smile
    System.out.print("Enter statement : ");
    String statement1 = scan.next();
    System.out.print("Enter statement : ");
    String statement2 = scan.next();
    System.out.print("Enter statement : ");
    String statement3 = scan.next();
    System.out.println("\n\t" + statement1 + "\n\\t" + statement2 + "//" + statement3 + "\n");
  }
}
