package lesson04;

public class Dog {
    public  String name;
    protected int age;

    String color;
    private int id;

    Dog(String name) {
        this.name = name;
    }

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Dog() {

    }

    @Override
    public String toString() {
        return "[Dog] - tên: " + name + ", tuổi: " +age;
    }
}
