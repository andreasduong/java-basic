package lesson05.polymorphism;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run() {
        System.out.println("person is running....");
    }
}
