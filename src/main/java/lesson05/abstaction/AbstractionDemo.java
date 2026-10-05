package lesson05.abstaction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // tính trừu tượng
        // Abstract class - trừu tượng 50%
        Circle circle1 = new Circle(7);
        System.out.println("circle1.area() = " + circle1.area());
        circle1.info();


        // Interface - trừu tượng 100%
    }
}
