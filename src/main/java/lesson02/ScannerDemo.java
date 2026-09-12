package lesson02;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("mời bạn nhập vào họ tên");
        String fullName = scanner.nextLine();
        System.out.println("mời bạn nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập vào giới tính 1.Nam 2.Nữ 3.Gay");
        int menu = scanner.nextInt();
        Gender gender;
        if (menu == 1) {
            gender = Gender.MALE;
        } else if (menu == 2){
            gender = Gender.FEMALE;
        } else {
            gender = Gender.GAY;
        }
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);


    }
}
