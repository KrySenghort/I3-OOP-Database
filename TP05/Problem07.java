package TP05;

import java.util.Scanner;

//Write a program in Java to read a sentence from keyboard. Then replaces all escape characters follow below table:
// \n : new line
// \t : tab
// \\ : slash
// // : comment
// :) : smile
public class Problem07 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter statement : ");
    String statement1 = scan.next();

    System.out.print("Enter statement : ");
    String statement2 = scan.next();
    System.out.print("Enter statement : ");

    String statement3 = scan.next();

    System.out.println("\n\t" + statement1 + "\n\\t" + statement2 + "//" + statement3 + "\n");
  }
}
