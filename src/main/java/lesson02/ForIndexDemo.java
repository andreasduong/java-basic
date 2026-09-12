package lesson02;

public class ForIndexDemo {

    public static void main(String[] args) {
        // từ 1 - 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // từ 10 - 1
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //  2 4 6 8 10
        for(int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }

        // lặp các phần tử trong mảng
        int[] numbers = {9, 13, 22 ,45, 67, 78, 92};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    

    
}
