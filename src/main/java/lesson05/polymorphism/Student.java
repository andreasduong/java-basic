package lesson05.polymorphism;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("student is running....");
    }
}
