package lesson05.polymorphism;

public class OverloadingDemo {
    public static void main(String[] args) {

    }

    public int sum(int a, int b) {
        return  a + b;
    }

    public int sum(int a, byte b) {
        return a + b;
    }
}
