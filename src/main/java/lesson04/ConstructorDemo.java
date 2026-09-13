package lesson04;

public class ConstructorDemo {
    public static void main(String[] args) {
        // tên Constructor trùng với class
        // không có kiểu trả về


        Dog dog = new Dog("Jake", 2);
        System.out.println("dog = " + dog);

        Dog dog3 = new Dog();
        System.out.println("dog3 = " + dog3);

    }
}
