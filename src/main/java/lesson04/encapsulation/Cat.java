package lesson04.encapsulation;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return this.name.toUpperCase();
    }
    // setter
    public void setAge(int age) {
        if (age > 0) this.age = age ;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name.toUpperCase() + '\'' +
                ", age=" + age +
                '}';
    }
}
