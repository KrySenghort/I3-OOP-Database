import java.util.Arrays;

public class Problem01 {
  // Write a java program to sort the element of the array can be either numeric
  // or string data.
  public static void main(String[] args) {
    int[] array1 = { 123, 321, 212, 54, 34, 67, 6, 78, 434, 54, 6, 4, 2, 4, 76, 46, 45 };
    System.out.println("============================================================================================");
    System.out.println("Original numeric array : " + Arrays.toString(array1));
    Arrays.sort(array1);
    System.out.println("Sorted numeric array   : " + Arrays.toString(array1));
    System.out.println("============================================================================================");
    String[] array2 = { "apple", "orange", "lemon", "pineapple", "stawbeery", "grape" };
    System.out.println("Original string array : " + Arrays.toString(array2));
    Arrays.sort(array2);
    System.out.println("Sorted string array   : " + Arrays.toString(array2));
    System.out.println("===========================================================================");
  }
}
