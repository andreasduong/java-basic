package lesson04.Inheritance;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal is eating....");
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }
}
