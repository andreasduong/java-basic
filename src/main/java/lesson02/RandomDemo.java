package lesson02;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        // tạo số ngẫu nhiên
        int n = random.nextInt();
        System.out.println(n);

        // 0 - ngẫu nhiên - số max
        int m = random.nextInt(100);
        System.out.println("m = " + m);

        // min <= k <= max
        int min = 100;
        int max = 999;
        int k = random.nextInt(max + 1 - min) + min;
        System.out.println("k = " + k);

        // lấy ngẫu nhiên hoa quả
        String[] fruits = {"táo", "cam", "mận", "xoài", "đào", "dứa"};
        System.out.println(fruits[random.nextInt(fruits.length)]);
    }
    
}
