package assignment03;

import java.util.Scanner;

public class Exercise04 {
    void question01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào xâu ký tự");
        String string = scanner.nextLine();
        String[] words = string.split(" ");

        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println("Số từ là: " + count);
    }

    void question02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất:");
        String s1 = scanner.nextLine();
        System.out.println("Nhập chuỗi thứ hai:");
        String s2 = scanner.nextLine();
        System.out.println("s1.concat(s2) = " + s1.concat(s2));
    }

    void question04_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên người dùng:");
        String name = scanner.nextLine().toUpperCase();
        String[] words = name.split("");

        for (int i = 0; i < words.length; i++) {
            if (words[i].isBlank()) continue;
            System.out.println("Kí tự thứ " + (i + 1) + " là: " + words[i]);
        }
    }

        void question04_2() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên người dùng:");
            String name = scanner.nextLine().toUpperCase();

            int count = 1;
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);

                if(Character.isWhitespace(c)) continue;

                System.out.println("Kí tự thứ " + count + " là: " + c);
                count++;
            }

        }

        void question06_1(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập đầy đủ tên người dùng");
            String name =scanner.nextLine();
            String[] words= name.split(" ");

            for (int i = 0; i < words.length; i++){
                if (i == 0) System.out.println("Họ là: " + words[0]); // in ra họ

                if (i !=0 && i != words.length - 1) System.out.println("Tên đệm thứ " + i + " là: " + words[i]); // (các) tên đệm nếu nhiều hơn 1 tên đệm

                if (i == words.length - 1) System.out.println("Tên là: " + words[words.length-1]); // in ra tên
            }

         }

         void question06_2() {
            Scanner scanner = new Scanner(System.in);
             System.out.println("Nhập đầy đủ tên người dùng");
             String name = scanner.nextLine();

             String[] words = name.trim().split("\\s+");

             System.out.println("Họ là: " + words[0]);

             for (int i = 1; i < words.length -1 ; i++) {
                 System.out.println("Tên đệm thứ " + i + " là: " + words[i]);
             }

             System.out.println("Tên là: " + words[words.length- 1]);
         }


}
