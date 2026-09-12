package lesson02;

public class OperatorsDemo {
    public static void main(String[] args) {
        // toán tử số học
        System.out.println(99 + 2);
        System.out.println(99 - 2);
        System.out.println(99 * 2);
        System.out.println(99 % 2);

        //
        int a = 100;
        a += 10;
        System.out.println(a);

        int b = 100;
        b++;
        System.out.println(b);

        int x = 100;
        int y = x++;
        int z = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // toán tử logic
        int k = 9;
        boolean test1 = k < 5 && k < 10;
        System.out.println(test1);

        // ! not
        boolean notTrue = !true;
        System.out.println(notTrue);
    }
}
