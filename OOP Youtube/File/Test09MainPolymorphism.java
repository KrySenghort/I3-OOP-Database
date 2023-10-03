// Poly(many) + morphism(form) ==> many forms.
// Animal, Person
// There are two type of polymorphisms such as: 
// 1. static polymorphism(overloading method are the methods that has the same names but different with parameter argument.)
// 2. dynamic polymorphism(overriding method are the methods that has the same names but different with return values.)

public class Test09MainPolymorphism {
  public static void main(String[] args) {
    Test09Animal a = new Test09Animal();
    // overloading method use in static polymorphism.
    a.getInfo();
    a.getInfo("Ki ki");
    a.getInfo(4);
    System.out.println("==============================================");
    // overriding method use in dynamic polymorphism.
    Test09Animal dog = new Test09Dog2();
    dog.getInfo();
    dog.getInfo(4);
    dog.getInfo("Dog");

    System.out.println("==============================================");
    Test09Animal fish = new Test09Fish();
    fish.getInfo();
    fish.getInfo("Dara");
    fish.getInfo(4);

  }
}
// Output:
// This is general information....
// This is animal name : Ki ki
// This is animal leg:4
// ==============================================
// This is the information from Dog Class
// This is animal leg:4
// This is animal name : Dog
// ==============================================
// This is general information....
// This is animal name : Dara
// This is animal leg:4