package assignment06.util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Yêu cầu nhập vào số nguyên.");
                System.out.println("Nhập lại:");
            }
        }

    }

    public static int intputPositveInt(){
        while (true) {
            try {
                String input = scanner.nextLine();
                int num = Integer.parseInt(input);
                if (num > 0) return num;
                else {
                    System.out.println("Yêu cầu nhập vào số nguyên dương.");
                    System.out.println("Nhập lại:");
                }

            } catch (NumberFormatException e) {
                System.out.println("Yêu cầu nhập vào số nguyên dương.");
                System.out.println("Nhập lại:");
            }
        }
    }

    public static float inputFloat() {

            while (true) {
                try {
                    String input = scanner.nextLine();
                    float num = Float.parseFloat(input);
                    return num;

                } catch (NumberFormatException e) {
                    System.out.println("Yêu cầu nhập vào số nguyên dương.");
                    System.out.println("Nhập lại:");
                }
            }
    }

    public static String inputString() {
        return scanner.nextLine();
    }

    public static String inputEmail() {
        // phải chứa ký tự @
        while (true) {
            String input = scanner.nextLine();
            if (input.contains("@")) return input;
            else {
                System.out.println("Email phải có kí tự '@'");
            }
        }

    }

    public static String inputPassword() {
        // yêu cầu 6-12 kí tự, ít nhất 1 kí tự viết hoa
        while (true) {
            String input = scanner.nextLine();
            int length = input.length();
            if (length <6 || length > 12) {
                System.err.println("Yêu cầu từ 6-12 kí tự, nhập lại");
            } else {
                for (int i = 0; i < length ; i++) {
                    char c = input.charAt(i);
                    if (Character.isUpperCase(c)) return input;

                }
            }   System.err.println("Yêu cầu có kí tự in hoa, nhập lại");
        }
    }

    public static boolean hasAllAlphabetic(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c)) continue;
            if (!Character.isAlphabetic(c)) return false;
         }
        return  true;
    }



}
