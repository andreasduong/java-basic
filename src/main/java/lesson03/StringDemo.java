package lesson03;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Java core";
        String s2 = "Java core";


        String s3 = new String("Java core");
        String s4 = new String("java core");


        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        // ==        → so sánh reference
        // .equals() → so sánh nội dung


    }
}
