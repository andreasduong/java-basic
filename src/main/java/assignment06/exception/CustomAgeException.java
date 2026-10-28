package assignment06.exception;


import lesson06.InvalidAgeException;

import java.util.Scanner;

public class CustomAgeException {
    public static void main(String[] args) {
        inputAge();
    }

    public static void inputAge() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập vào tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());

            if (age <= 0) throw new IllegalStateException("Tuổi phải lớn hơn 0");
            else System.out.println("Chào mừng bạn!");
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
