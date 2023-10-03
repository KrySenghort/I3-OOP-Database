import java.util.Arrays;

public class Problem02 {
  // Write a java program to reverse the array element.
  public static void main(String[] args) {
    double array[] = new double[] { 2.33, 480.55, 95.44, 4.5, 6, 6.6, 8, 3, 90 };
    System.out.println("==========================================================================");
    System.out.println("Original array : " + Arrays.toString(array));
    System.out.print("After reverse  : [");
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.print(array[i] + ",");
    }
    System.out.print("]");
    System.out.println("\n==========================================================================");
  }
}
