public class Test04Employee {
  private int id;
  private String lastname;
  private String firstname;
  private int salary;

  // method constructor
  public Test04Employee(int id, String lastname, String firstname, int salary) {
    this.id = id;
    this.lastname = lastname;
    this.firstname = firstname;
    this.salary = salary;
  }

  // keyword ("this") is used to make no confusion(ធាតុដែលមានឈ្មោះដូចគ្នា
  // និង​ជាន់គ្នា​ ដាក់មិនអោយច្រលំគ្នាឬត្រួតធាតុគ្នា) the variable.
  public int getId() {
    return this.id;
  }

  public String getLastname() {
    return this.lastname;
  }

  public String getFirstname() {
    return this.firstname;
  }

  public String getName() {
    return this.lastname + " " + this.firstname;
    // for this point we can use this or not use as we want because of not useful.
  }

  public int getSalary() {
    return this.salary;
  }

  public void SetSalary(int salary) {
    this.salary = salary;
  }

  public int getAnnualSalary() {
    return this.salary * 12;
  }

  public int raiseSalary(int percent) {
    return (salary * percent) / 100 + salary;
  }

  public String toString() {
    return "Employee[id = " + this.id + ", name = " + getName() + ", Salary= " + this.salary + "]";
  }
}
