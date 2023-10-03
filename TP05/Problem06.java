package TP05;

import java.util.Scanner;

public class Problem06 {
  // Write a method makePalindrome() that creates a reverse copy of given String,
  // and then join them to make a Palindrome.
  // Then, write a program in Java to create a reverse copy of given String.
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter string : ");
    String string1 = scan.next();
    String string2 = "";
    for (int i = 0; i < string1.length(); i++) {
      string2 = string1.charAt(i) + string2;
    }
    System.out.println("After processing makePalindrome(): " + string1 + string2);
  }
}
