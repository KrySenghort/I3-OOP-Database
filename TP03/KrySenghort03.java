import java.util.Scanner;

public class KrySenghort03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // // ============= Exercise 01:
    // // Implement an application Java that take a given number of seconds for
    // // converting into time with format hours:minutes:seconds.
    System.out.print("Input the number of seconds: ");
    int second = scan.nextInt();
    int hour = (second / 3600) % 24;
    second = second % 3600;
    int minute = second / 60;
    second = second % 60;
    System.out.printf("%02d:%02d:%02d", hour, minute, second);
    // *******************************************************************************************************************************
    // // ============= Exercise 02:
    // // Write a program in Java to a Time (hours, minutes, seconds) to number of
    // seconds. Hours, minutes and seconds are inputted from keyboard
    System.out.print("Program for converting time to seconds.");
    System.out.print("\ninput hours : ");
    int hour = scan.nextInt();
    System.out.print("\ninput minutes : ");
    int minute = scan.nextInt();
    System.out.print("\ninput seconds : ");
    int second = scan.nextInt();
    int sum = hour * 3600 + minute * 60 + second;
    System.out.print("\nNumber of seconds = " + hour + " x 3600 + " + minute + "x 60 + " + second + " = " + sum);
    *******************************************************************************************************************************
    // // ============= Exercise 03:
    // Write a program in Java to calculate cost of calling with given Time Start
    // (hours, minutes, and seconds) and Time End (hours, minutes, and seconds). The
    // cost of call per minute is 0.05$. The program will display total number of
    // minutes called and total cost of the call.
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
    // *******************************************************************************************************************************
    // // ============= Exercise 04:
    // // Write a program in Java to money in Riels to Dollar. Suppose that
    // conversion
    // // rate is 1$ = 4000៛. Example:
    System.out.print("Enter money in riel : ");
    float moneyRiel = scan.nextFloat();
    float moneyDollar = (float) (moneyRiel / 4000);
    System.out.println(moneyRiel + "Riel = " + moneyDollar + "$");
    // ******************************************************************************************************************************
    // // ============= Exercise 05:
    // Write a program in Java to calculate duration of travel from ITC to Airport.
    // The distance is 7 km and the average speed is 30km/h. The traffic jam factor
    // is given as percentages of the average speed. After the calculation, display
    // duration in format HH:mm:ss.
    System.out.print("input traffic jam factor (in percentage [0-100]): ");
    int percentage = scan.nextInt();
    int distance = 7;
    int velocity = 30;
    int hour = (1 + percentage / 100) * (distance / velocity);
    int minute = (1 / 60) * hour;
    int second = minute % 60;
    System.out.print("The time duration is in format " + hour + ":" + minute + ":" + second);
  }
}