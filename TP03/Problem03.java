import java.util.Scanner;

public class Problem03 {
  // ============= Exercise 03:
  // Write a program in Java to calculate cost of calling with given Time Start
  // (hours, minutes, and seconds) and Time End (hours, minutes, and seconds). The
  // cost of call per minute is 0.05$. The program will display total number of
  // minutes called and total cost of the call.
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter start hour\t: ");
    int hour1 = scan.nextInt();
    System.out.print("Enter start minute\t: ");
    int minute1 = scan.nextInt();
    System.out.print("Enter start second\t: ");
    int second1 = scan.nextInt();
    System.out.print("Enter finish hour\t: ");
    int hour2 = scan.nextInt();
    System.out.print("Enter finish minute\t: ");
    int minute2 = scan.nextInt();
    System.out.print("Enter finish second\t: ");
    int second2 = scan.nextInt();
    int hour, second, minute;
    if (hour1 >= 0 && hour1 < 24 && hour2 >= 0 && hour2 < 24) {
      if (minute1 >= 0 && minute1 < 60 && minute2 >= 0 && minute2 < 60) {
        if (second1 >= 0 && second1 < 60 && second2 >= 0 && second2 < 60) {
          if (hour1 <= hour2) {
            if (minute1 <= minute2) {
              if (second1 <= second2) {
                hour = hour2 - hour1;
                minute = minute2 - minute1;
                second = second2 - second1;
                System.out.println("The total call duration is " + hour + "h " + minute + "mn" + second + "s");
                float cost = (float) 0.05 * (minute + hour * 60 + second / 60);
                System.out.print("The total call cost is " + cost + "$");
              } else {
                hour = hour2 - hour1;
                minute = minute2 - minute1;
                second = 60 - second1 + second2;
                System.out.println("The total call duration is " + hour + "h " + minute + "mn" + second + "s");
                float cost = (float) 0.05 * (minute + hour * 60 + second / 60);
                System.out.print("The total call cost is " + cost + "$");
              }
            } else {
              if (second1 <= second2) {
                hour = hour2 - hour1;
                minute = 60 + minute2 - minute1;
                second = second2 - second1;
                System.out.println("The total call duration is " + hour + "h " + minute + "mn" + second + "s");
                float cost = (float) 0.05 * (minute + hour * 60 + second / 60);
                System.out.print("The total call cost is " + cost + "$");
              } else {
                hour = hour2 - hour1;
                minute = 60 + minute2 - minute1;
                second = 60 - second1 + second2;
                System.out.println("The total call duration is " + hour + "h " + minute + "mn" + second + "s");
                float cost = (float) 0.05 * (minute + hour * 60 + second / 60);
                System.out.print("The total call cost is " + cost + "$");
              }
            }
          } else {
            if (minute1 <= minute2) {
              if (second1 <= second2) {
                hour = 24 + hour2 - hour1;
                minute = minute2 - minute1;
                second = second2 - second1;
                System.out.println("The total call duration is " + hour + "h " + minute + "mn" + second + "s");
                float cost = (float) 0.05 * (minute + hour * 60 + second / 60);
                System.out.print("The total call cost is " + cost + "$");
              } else {
                hour = 24 + hour2 - hour1;
                minute = minute2 - minute1;
                second = 60 - second1 + second2;
                System.out.println("The total call duration is " + hour + "h " + minute + "mn" + second + "s");
                float cost = (float) 0.05 * (minute + hour * 60 + second / 60);
                System.out.print("The total call cost is " + cost + "$");
              }
            } else {
              if (second1 <= second2) {
                hour = 24 + hour2 - hour1;
                minute = 60 + minute2 - minute1;
                second = second2 - second1;
                System.out.println("The total call duration is " + hour + "h " + minute + "mn" + second + "s");
                float cost = (float) 0.05 * (minute + hour * 60 + second / 60);
                System.out.print("The total call cost is " + cost + "$");
              } else {
                hour = 24 + hour2 - hour1;
                minute = 60 + minute2 - minute1;
                second = 60 - second1 + second2;
                System.out.println("The total call duration is " + hour + "h " + minute + "mn" + second + "s");
                float cost = (float) 0.05 * (minute + hour * 60 + second / 60);
                System.out.print("The total call cost is " + cost + "$");
              }
            }
          }
        } else {
          System.out.println("input incorrect");
        }
      } else {
        System.out.println("input incorrect");
      }
    } else {
      System.out.println("input incorrect");
    }
  }
}
