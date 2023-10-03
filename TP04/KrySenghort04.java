import java.util.Scanner;

public class KrySenghort04 {
  public static void main(String[] args) {
    // *******************************************************************************************************************************
    // // =================== Exercise 01:
    // // Implement an application Java that let user input a number then determine
    // if it is a prime number using PrimeNumber
    // class which is previously defined.
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number : ");
    int number = scan.nextInt();
    if (isPrime(number)) {
      System.out.print(number + " is prime number.");
    } else {
      System.out.println(number + " is non-prime number");
    }
  }

  static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  // *******************************************************************************************************************************
  // // ============= Exercise 02:
  // // Lucky number is a 6 digits number that sum of first 3 digits equals to sum
  // of
  // // last 3 digits.
  Scanner scan = new Scanner(System.in);System.out.print("Enter number : ");
  int num = scan.nextInt();
  int digit1 = num % 10;num=num/10;
  int digit2 = num % 10;num=num/10;
  int digit3 = num % 10;num=num/10;
  int digit4 = num % 10;num=num/10;
  int digit5 = num % 10;num=num/10;
  int digit6 = num % 10;
  int sum1 = digit6 + digit5 + digit4;
  int sum2 = digit1 + digit2 + digit3;if(sum1==sum2)
  {
    System.out.print("it is a lucky number.");
  }else
  {
    System.out.print("it is not a lucky number.");
  }
  // *******************************************************************************************************************************
  // // ============= Exercise 03:
  // Create class and write a program in Java to read a 4 digits number from
  // keyboard. Then the program will reverse given
  // number, and display it. If user input number other than 4 digits number,
  // display error message.
  Scanner scan = new Scanner(System.in);System.out.print("Enter number : ");
  int num = scan.nextInt();
  int reversed = 0;
  int count = 0;System.out.print("Before Reversing : "+num);while(num!=0)
  {
    int digit = num % 10;
    reversed = reversed * 10 + digit;
    num = num / 10;
    count++;
  }if(count==4)
  {
    System.out.print("\nAfter Reversing : " + reversed);
  }else
  {
    System.out.print("\nError: invalid number, please input only 4 digits number");
  }
  // *******************************************************************************************************************************
  // // // ============= Exercise 04:
  // // Create classes to support each currency. Write a program in Java to
  // exchange
  // // money in Riels to Dollar, Riels to Thai Baht,
  // // Dollar to Riels, Dollar to Thai Baht, and Thai Baht to Riels. Suppose that
  // // conversion rate is 1$ = 4000៛, and 1$ = 30B.
  // // Welcome to program Money Exchanges!
  // // 1. Riels to Dollar
  // // 2. Riels to Thai Baht
  // // 3. Dollar to Riels
  // // 4. Dollar to Thai Baht
  // // 5. Thai Baht to Riels
  // // 6. Exit
  System.out.print("Welcome to program money exchanges !");System.out.print("\n1. Riels to Dollar");System.out.print("\n2. Riels to Baht");System.out.print("\n3. Dollar to Riels");System.out.print("\n4. Dollar to Baht");System.out.print("\n5. Baht to Riels");System.out.print("\n6. Exit");
  Scanner scan = new Scanner(System.in);System.out.print("\nSelect an option : ");
  int choice = scan.nextInt();switch(choice)
  {
      case 1:
        System.out.print("Enter money(Riels) : ");
        float Riels = scan.nextFloat();
        float Dollar = Riels / 4000;
        System.out.print(Riels + " Riels = " + Dollar + " USD");
        break;
      case 2:
        System.out.print("Enter money(Riels) :");
        Riels = scan.nextFloat();
        float Baht = 30 * Riels / 4000;
        System.out.print(Riels + " Riels = " + Baht + " Baht");
        break;
      case 3:
        System.out.print("Enter money(Dollar) :");
        Dollar = scan.nextFloat();
        Riels = Dollar * 4000;
        System.out.print(Dollar + " USD = " + Riels + " Riels");
        break;
      case 4:
        System.out.print("Enter money(Dollar) :");
        Dollar = scan.nextFloat();
        Baht = Dollar * 30;
        System.out.print(Dollar + " USD = " + Baht + " Baht");
        break;
      case 5:
        System.out.print("Enter money(Baht) :");
        Baht = scan.nextFloat();
        Riels = Baht * 4000 / 30;
        System.out.print(Baht + " Baht = " + Riels + " Riels");
      case 6:
        break;
      default:
        System.out.println("invalid choice");
        break;
    }
  // *******************************************************************************************************************************
  // // ============= Exercise 05:
  // // Write a program in Java to read 8 integers from keyboard. Then find
  // maximum number.
  Scanner scan = new Scanner(System.in);
  int max;System.out.print("Enter a : ");
  int a = scan.nextInt();System.out.print("Enter b : ");
  int b = scan.nextInt();System.out.print("Enter c : ");
  int c = scan.nextInt();System.out.print("Enter d : ");
  int d = scan.nextInt();System.out.print("Enter e : ");
  int e = scan.nextInt();System.out.print("Enter f : ");
  int f = scan.nextInt();System.out.print("Enter g : ");
  int g = scan.nextInt();System.out.print("Enter h : ");
  int h = scan.nextInt();max=a;if(max<b)
  {
    max = b;
  }if(max<c)
  {
    max = c;
  }if(max<d)
  {
    max = d;
  }if(max<e)
  {
    max = e;
  }if(max<f)
  {
    max = f;
  }if(max<g)
  {
    max = g;
  }if(max<h)
  {
    max = h;
  }System.out.printf("The maximum number is %d",max);
  // *******************************************************************************************************************************
  // // ============= Exercise 06:
  // // A shipping ship need to transport goods from point A to point C. This ship
  // // capable to store maximum 5000 liters of
  // // Petrol. The ship can stop only one time to refill, it is point B. The
  // // distance between A to B, between B to C, and weight
  // // are given by user. The number of liters of petrol used by the ship is
  // depend
  // // on the weight of goods loaded. The number
  // // of liters used is described a below:
  // // - Up to 5000Kg, uses 10L/Km
  // // - Up to 10000Kg, uses 20L/Km
  // // - Up to 20000Kg, uses 25L/Km
  // // - Up to 30000Kg, uses 35L/Km
  // // - More than 30000Kg, cannot be loaded
  // // Write a program in Java to calculate the minimum amount of liters needed
  // to
  // // refill at point B in order to reach point C.
  Scanner scan = new Scanner(System.in);System.out.print("Enter weight of goods : ");
  int weight = scan.nextInt();System.out.println("Enter distance from B to C : ");
  int distance = scan.nextInt();
  int liters;if(weight>0&&weight<=5000)
  {
    liters = distance * 10;
    System.out.print("We need " + liters + " liters to reach point C");
  }else if(weight>5000&&weight<=10000)
  {
    liters = distance * 20;
    System.out.print("We need " + liters + " liters to reach point C");
  }else if(weight>10000&&weight<=20000)
  {
    liters = distance * 25;
    System.out.print("We need " + liters + " liters to reach point C");
  }else if(weight>20000&&weight<=30000)
  {
    liters = distance * 35;
    System.out.print("We need " + liters + " liters to reach point C");
  }else if(weight>30000)
  {
    System.out.print("it cannot be loaded.");
  }else
  {
    System.out.print("Invalid");
  }
  // *******************************************************************************************************************************
  // // ============= Exercise 07:
  // Write a program in Java to tell whether inputted year is Leap year. Leap year
  // is a year that is divisible by 4 but not
  // divisible by 100, or a year that divisible by 400. In case user input number
  // less than 1, the program will display error
  // message.
  Scanner scan = new Scanner(System.in);System.out.print("Enter year : ");
  int year = scan.nextInt();if((year%4==0&&year%100!=0)||year%400==0)
  {
    System.out.print("It is a leap year.");
  }else if(year<1)
  {
    System.out.print("Error let try again!!");
  }else
  {
    System.out.print("It is not a leap year.");
  }
}}
