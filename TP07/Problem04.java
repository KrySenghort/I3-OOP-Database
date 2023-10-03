import java.util.Arrays;

public class Problem04 {
  // Write a java program to sort even and odd element of array separately.
  private static void sort(int[] arr) {
    int index = 0;
    int n = arr.length;
    while (index < n) {
      if (index == 0) {
        index++;
      }
      if (compare(arr[index], arr[index - 1])) {
        index++;
      } else {
        int temp = arr[index];
        arr[index] = arr[index - 1];
        arr[index - 1] = temp;
        index--;
      }
    }
  }

  private static boolean compare(int a, int b) {
    if (a % 2 == b % 2) {
      return a > b;
    }
    return a % 2 == 1;
  }

  public static void main(String[] args) {
    int a[] = { 3, 22, 5, 6, 4, 9, 11, 7, 54, 67, 34, 78, 456, 778, 89 };
    System.out.println("Original array : " + Arrays.toString(a));
    sort(a);
    System.out.print("After Separate even and odd : [");
    for (int i : a) {
      System.out.print(i + ", ");
    }
    System.out.println("]");
  }

}
