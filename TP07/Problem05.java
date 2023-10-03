import java.util.Arrays;

public class Problem05 {
  // Write a java program to find the sum of all array element using recursion.
  private int Sum(int arr[], int n) {
    if (n <= 0) {
      return 0;
    } else {
      return Sum(arr, n - 1) + arr[n - 1];
    }
  }

  public static void main(String[] args) {
    Problem05 p5 = new Problem05();
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 34, 44, 34, 64, 78, 78, 65 };
    System.out.println("Array : " + Arrays.toString(arr));
    int sum = p5.Sum(arr, arr.length);
    System.out.println("The result of summation all elements in array is : " + sum);
  }
}
