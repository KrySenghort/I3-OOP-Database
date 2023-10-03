import java.util.Scanner;

public class Assignment {
  public static void main(String[] args) {
    // 1. Write the java statement that assigns 1 to x if y is greater than 0.
    // int x, y;
    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter y");
    // y = scan.nextInt();
    // if (y > 0) {
    // x = 1;
    // System.out.printf("x = %d", x);
    // } else {
    // System.out.println("Invalid");
    // }

    // //
    // ==================================================================================
    // // 2. Suppose that score is a variable of type double. Write the java
    // statement
    // // that increases the score by 5 marks if score is between 80 and 90.

    // double score;
    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter score : ");
    // score = scan.nextDouble();
    // if (score > 80 && score < 90) {
    // score = score + (float) 5;
    // System.out.printf("your new score is %f", score);
    // } else {
    // System.out.println("Invalid");
    // }

    // //
    // ===================================================================================
    // // 3.Rewrite in java the following statement without using Not(!) operator:
    // // item = !((i<10)||(v>=50))
    // ==> The statement that has no ! operator is item = ((i<10)&&(v>=50)){

    // //
    // ===================================================================================
    // // 4. Write a java statement that print true if x is an odd number and
    // positive.
    // Scanner scan = new Scanner(System.in);
    // System.out.printf("Enter x : ");
    // int x = scan.nextInt();
    // if (x % 2 != 0 && x > 0) {
    // System.out.println("true");
    // } else {
    // System.out.println("false");
    // }

    // //
    // ===================================================================================
    // // 5. Write a java statement that prints true if both x and y are positive
    // // numbers.
    // Scanner input = new Scanner(System.in);
    // System.out.println("Enter x : ");
    // float x = input.nextFloat();
    // System.out.println("Enter y : ");
    // float y = input.nextFloat();
    // boolean choice1 = true;
    // boolean choice2 = false;
    // if (x > 0 && y > 0) {
    // System.out.println(choice1);
    // } else {
    // System.out.println(choice2);
    // }

    // //
    // ===================================================================================
    // // 6.Write a java statement that prints true if x and y has the same
    // sign(+/-).
    // long x;
    // long y;
    // Scanner Input = new Scanner(System.in);
    // System.out.println("Enter x :");
    // x = Input.nextInt();
    // System.out.println("Enter y :");
    // y = Input.nextInt();
    // if (x > 0 && y > 0) {
    // System.out.println("true");
    // } else {
    // System.out.println("false");
    // }

    // //
    // ===================================================================================
    // // 7. Convert the following statement to if-else and if-then statement
    // // String dayString1, dayString2, dayString3;
    // // int day = KB.nextInt();
    // // switch (day) {
    // // case 1: dayString1 = "Saturday";
    // // case 2: dayString2 = "Sunday";
    // // break;
    // // case 3: dayString3 = "Monday";
    // // break;
    // // case 4: dayString1 = "Tuesday";
    // // case 5: dayString2 = "Wednesday";
    // // break;
    // // default: dayString3 = "Invalid day";
    // // break;
    // // }

    // // Method 1 : if-else statement
    // String dayString1, dayString2, dayString3;
    // int day = KB.nextInt();
    // if (day == 1) {
    // dayString1 = "Saturday";
    // }
    // if (day == 2) {
    // dayString2 = "Sunday";
    // }
    // if (day == 3) {
    // dayString3 = "Monday";
    // }
    // if (day == 4) {
    // dayString1 = "Tuesday";
    // }
    // if (day == 5) {
    // dayString2 = "Wednesday";
    // }
    // if (day != 1 && day != 2 && day != 3 && day != 4 && day != 5) {
    // dayString3 = "Invalid day";
    // }

    // // // Method 2 : if-then statement
    // String dayString1, dayString2, dayString3;
    // int day = KB.nextInt();
    // if (day == 1) {
    // dayString1 = "Saturday";
    // } else if (day == 2) {
    // dayString2 = "Sunday";
    // } else if (day == 3) {
    // dayString3 = "Monday";
    // } else if (day == 4) {
    // dayString1 = "Tuesday";
    // } else if (day == 5) {
    // dayString2 = "Wednesday";
    // } else {
    // dayString3 = "Invalid day";
    // }

    // //
    // ===========================================================================
    // // 8. Body Mass Index (BMI) is a measure of health on weight. It can be
    // // calculated by taking your weight in
    // // kilograms and dividing by the square of your height in meters. Write a
    // // program that prompts the user to
    // // enter a weight in kilograms and height in meters and displays the BMI.

    // float weight, height, BMI;
    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter weight in kilogram : ");
    // weight = scan.nextFloat();
    // System.out.println("Enter height in meter : ");
    // height = scan.nextFloat();
    // BMI = weight / (height * height);
    // System.out.printf("BMI = %f", BMI);

    // //
    // ========================================================================================
    // // 9. . Write a program that reads the performance level of an employee
    // (between
    // // 0 and 100) and his salary.
    // // Then it increases the salary by 3% if performance level is grater than or
    // // equal to 90.

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter performance level :");
    // int Perforlevel = scan.nextInt();
    // System.out.println("Enter your base salary :");
    // float salary = scan.nextFloat();
    // if (Perforlevel >= 90) {
    // salary = salary * (float) 1.03;
    // System.out.printf("Salary is %f", salary);
    // } else {
    // System.out.printf("Salary is %f", salary);
    // }
  }
}