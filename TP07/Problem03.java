import java.util.Arrays;

public class Problem03 {
  // Write a java program to find the third highest element in the array.
  public static void main(String[] args) {
    int a[] = { 3434343, 6765554, 54545454, 3343434, 4343435, 63435, 734367, 87756, 334343, 5656, 673434, 76343, 3435,
        43454, 54345 };
    String b[] = { "R", "C", "C++", "Java", "Python", "Jquery", "Mysql", "Ruby", "HTML", "Css", "C#", "JavaScript",
        "Assembly" };
    Problem03 p3 = new Problem03();
    System.out.println(
        "=====================================================================================================");
    System.out.println("Original array1 : " + Arrays.toString(a));
    Arrays.sort(a);
    System.out.println("After sorted\t: " + Arrays.toString(a));
    System.out.println("Third largest in the array1 a[] is : " + p3.getThirdLargest(a, 15));
    System.out.println(
        "=====================================================================================================");
    System.out.println("Original array2 : " + Arrays.toString(b));
    Arrays.sort(b);
    System.out.println("After sorted\t: " + Arrays.toString(b));
    System.out.println("Third largest in the array2 b[] is : " + b[10]);
    System.out.println(
        "=====================================================================================================");
  }

  int getThirdLargest(int a[], int total) {
    int temp;
    for (int i = 0; i < total; i++) {
      for (int j = i + 1; j < total; j++) {
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    return a[total - 3];
  }

}
