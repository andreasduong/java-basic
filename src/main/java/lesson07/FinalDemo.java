package lesson07;

public class FinalDemo {
    public static void main(String[] args) {
        // final property
        final double pi = 3.1415;
        // pi = 5; // -> Lỗi

        // final method
        Dog dog1 = new Dog();
        dog1.run();

        // final class
        // Shiba shiba = new Shiba();
//        shiba.run()

        // constant
        System.out.println("Math.PI = " + Math.PI);

    }
}
