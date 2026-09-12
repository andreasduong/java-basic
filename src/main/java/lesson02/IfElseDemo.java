package lesson02;

public class IfElseDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        if (a > b) {
            System.out.println("a lớn hơn b");
        } else if(a < b) {
            System.out.println("a nhỏ hơn b");
        } else {
            System.err.println("a bằng b");
        }
    }
}
