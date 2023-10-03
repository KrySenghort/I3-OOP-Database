public class Test01MainCar {
  public static void main(String[] args) {
    // Car Class Application
    // Contructor without parameter.
    Test01Car car1 = new Test01Car();
    System.out.println("Year1 : " + car1.YearCar);
    System.out.println("Model1 : " + car1.ModelCar);
    // Constructor with parameter.
    Test01Car car2 = new Test01Car(200, "Lexus");
    System.out.println("Year2 : " + car2.YearCar);
    System.out.println("Model2 : " + car2.ModelCar);

    Test01Car car3 = new Test01Car(2020, "Prus");
    System.out.println("Year3 : " + car3.YearCar);
    System.out.println("Model3 : " + car3.ModelCar);

  }
}
