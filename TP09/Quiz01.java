
// write a java application that allows the user enter up 20 integers grades into an array. Stop the loop by typing -1. 
// Your main method should call an average method that return the average of the grades. Use decimal format class to format 
// the average to two decimal places. 
import java.util.Scanner;

public class Quiz01 {
  public static int Average(int[] array, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = sum + array[i];
    }
    return sum / n;
  }

  // public static int InitializeArray(int[] array, int n) {
  // Scanner scan = new Scanner(System.in);
  // for(int i=0;i<n;i++){
  // System.out.println("Enter number : ");
  // array[i] = scan.nextInt();
  // }
  // }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of elements you want to store: ");
    int n = scan.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Enter number[" + i + "]   : ");
      array[i] = scan.nextInt();
    }
    System.out.print("Array elements are: [");
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.print("]");
    System.out.println("\nThe average score is " + Average(array, n));
  }

}
