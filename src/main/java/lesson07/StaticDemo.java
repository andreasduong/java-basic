package lesson07;

public class StaticDemo {
    public static void main(String[] args) {
        // static property
        try {
            Student s1 = new Student( "Long");
            System.out.println("s1 = " + s1);
            Student s2 = new Student( "Linh");
            System.out.println("s2 = " + s2);
            Student s3 = new Student("Lan");
            System.out.println("s3 = " + s3);
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Số lượng học sinh: "  + Student.getCount());
        }


        // static method
        int max = Math.max(100, 1);
        System.out.println("max = " + max);
    }
}
