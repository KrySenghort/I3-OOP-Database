public class Quiz03 {
  // What is wrong with this piece of code ?
  public static void main(String[] args) {
    int count = 0;
    while (count < 100) {
      if (count % 5 == 0) {
        System.out.println(count);
        // count++; it is the wrong point. It means that we need to assign increment of
        // count outside if-statement.
      }
      count++;
    }
  }
}
