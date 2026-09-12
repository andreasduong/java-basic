package lesson03;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        // toString
        Dog dog = new Dog();
        dog.name = "Jake";
        dog.age = 3;
        System.out.println("dog = " + dog);

        // equals
        Dog dog1 = new Dog();
        dog1.name = "Jake";
        dog1.age = 3;
        System.out.println("dog1 = " + dog1);

        System.out.println(dog == dog1);
        System.out.println(dog.equals(dog1));
    }
}
