package lesson02;

public class MethodDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.isPrime(5));
        System.out.println(dog.isPrime(10));
        
        dog.bark();
    }
}
