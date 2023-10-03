package TP05;

public class Problem02 {
  // Write a program in Java to display odd numbers (ex: 1, 3, 5, 7, etc.) located
  // between 0 and 500.
  public static void main(String[] args) {
    for (int i = 0; i <= 500; i++) {
      if (i % 2 != 0) {
        System.out.print(i + ", ");
      } else {
        continue;
      }
    }
  }
}
