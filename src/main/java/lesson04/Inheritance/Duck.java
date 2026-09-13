package lesson04.Inheritance;

public class Duck extends Animal{

    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Duck is eating...");
    }
}
