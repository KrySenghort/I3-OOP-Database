package Lesson02;

public class TestVisibility {
    short age = 19; //attribute
    
    public void methodA(){
        int age = 20;//local variable
        if(age >= 20){
            System.out.println("Age is "+this.age+" years old.");
        }
    }
    public static void main(String[] args) {
        TestVisibility tv = new TestVisibility();
        tv.methodA();
    }
}
