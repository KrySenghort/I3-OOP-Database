public class TP01 {
  public static void main(String[] args) {
    // 1. Write a program in java to display shape below:
    // A.) *************************
    // * *
    // * *
    // * *
    // * *
    // *************************
    // for (int i = 1; i < 25; i++) {
    // System.out.printf("*");
    // }
    // int x = 0;
    // while (x <= 4) {
    // System.out.println("*\t\t\t*");
    // x++;
    // }
    // for (int j = 1; j <= 25; j++) {
    // System.out.printf("*");
    // }

    // B.)
    // *
    // ***
    // *****
    // *******
    // *********
    for (int y = 1; y <= 5; y++) {
      for (int z = 1; z <= 2 * y + 1; z++) {
        System.out.printf(" ");
      }
      System.out.println("");
      for (int w = 1; w <= 2 * y - 1; w++) {
        System.out.printf("*");
      }
    }
  }
}
