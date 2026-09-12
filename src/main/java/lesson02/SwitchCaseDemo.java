package lesson02;

public class SwitchCaseDemo {
    public static void main(String[] args) {
            int month = 9;

    switch (month) {
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("tháng có 30 ngày");
            break;
        case 2:
            System.out.println("tháng có 29 ngày");
            break;
        default:
            System.out.println("tháng có 31 ngày");
    }
    }

}
