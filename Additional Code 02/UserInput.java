import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    // /*
    // * byte(number,1 byte)
    // * short(number,2 bytes)
    // * int(number,4 bytes)
    // * long(number,8 bytes)
    // * float(float number,4 bytes)
    // * double(float number,8 bytes)
    // * char(a character,2 bytes)
    // * boolean(true, or false,1 byte)
    // */
    // short myVariable = 10;
    // float myFloat = (float) 4.5;
    // double myDouble = 2.33;
    // char Mychar = 'A';
    // boolean is_true = false;
    // int x = 12;
    // String name = "Kry Senghort";
    // System.out.println("Hello world");
    // System.out.println("My name is Kry Senghort so nice to meet you dear for this
    // time.");
    // System.out.printf("The variable value is %d", myVariable);
    // System.out.println("\nThe double number is :");
    // System.out.println(myDouble);
    // System.out.println(myFloat);
    // System.out.printf("The first character in the english alphabet is : %c",
    // Mychar);
    // System.out.printf("\n", is_true);
    // System.out.printf("My name is %s", name + "\n");
    // System.out.printf("the value of x is %d", x);
    // // // println() prints a new blank line and then your message. printf()
    // provides
    // // string formatting similar to the printf function in C.
    // // printf() is primarily needed when you need to print big strings to avoid
    // // string concatenaion in println() which can be confusing
    // // at times. (Although both can be used in almost all cases)
    // ===================================================================================================================================
    // =========== Input Data with Scanner function:
    Scanner scan = new Scanner(System.in);

    System.out.printf("Enter number1 :");
    int x = scan.nextInt();

    System.out.printf("\nEnter number2 :");
    double y = scan.nextDouble();

    System.out.printf("\nEnter number3 :");
    float z = scan.nextFloat();

    System.out.printf("\nEnter your name :");
    String name = scan.next();
    System.out.printf(
        "The value of number1 is %d\nThe value of number2 is %2f\nThe value of number3 is %f\nThe name input is %s", x,
        y, z, name);
    // =========== Input Data
    System.out.printf("Enter your name :");
    String Name = scan.next();
    System.out.printf("Enter your ID :");
    int ID = scan.nextInt();
    System.out.printf("Enter your age :");
    int age = scan.nextInt();
    System.out.printf("Enter your sex :");
    String sex = scan.next();
    System.out.printf("Enter your addresse :");
    String addresse = scan.next();
    System.out.printf("Enter your telephone number :");
    int phone = scan.nextInt();
    System.out.printf("Enter your position :");
    String position = scan.next();
    System.out.printf("Enter your salary :");
    float salary = scan.nextFloat();
    System.out.printf(
        "The personal data is such that :\nName : %s\nID : %d\nAge : %d\nSex : %s\nAddresse : %s\nPhone Number : %d\nPosition : %s\nSalary : %f",
        Name, ID, age, sex, addresse, phone, position, salary);
  }
}
