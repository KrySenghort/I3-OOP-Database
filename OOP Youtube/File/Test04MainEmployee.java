public class Test04MainEmployee {
  public static void main(String[] args) {
    // Class Employee Application :
    Test04Employee emp1 = new Test04Employee(1, "Kry", "Senghort", 1000);
    System.out.println(emp1.toString());
    System.out.println("ID : " + emp1.getId());
    System.out.println("Firstname : " + emp1.getFirstname());
    System.out.println("Lastname : " + emp1.getLastname());
    System.out.println("Salary : " + emp1.getSalary());
    System.out.println("Annual Salary : " + emp1.getAnnualSalary());
    System.out.println("Salary after one year : " + emp1.raiseSalary(10));
    System.out.println("========================================================================");
    Test04Employee emp2 = new Test04Employee(2, "San", "Chandara", 2000);
    System.out.println(emp2.toString());
    System.out.println("ID : " + emp2.getId());
    System.out.println("Firstname : " + emp2.getFirstname());
    System.out.println("Lastname : " + emp2.getLastname());
    System.out.println("Salary : " + emp2.getSalary());
    System.out.println("Annual Salary : " + emp2.getAnnualSalary());
    System.out.println("Salary after one year : " + emp2.raiseSalary(20));
    System.out.println("========================================================================");
    Test04Employee emp3 = new Test04Employee(3, "Sin", "Sisamuth", 3000);
    System.out.println(emp3.toString());
    System.out.println("ID : " + emp3.getId());
    System.out.println("Firstname : " + emp3.getFirstname());
    System.out.println("Lastname : " + emp3.getLastname());
    System.out.println("Salary : " + emp3.getSalary());
    System.out.println("Annual Salary : " + emp3.getAnnualSalary());
    System.out.println("Salary after one year : " + emp3.raiseSalary(20));
  }
}
