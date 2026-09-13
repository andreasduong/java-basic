package lesson04.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // tính đóng gói
        // 1.   private các thuộc tính
        // 2 . cung cấp getter / setter

        Cat cat1 = new Cat("Jane", 2);
        cat1.setAge(-99);
        System.out.println("cat1 = " + cat1);
    }
}
