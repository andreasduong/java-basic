package lesson05.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // tính đa hình

        Student student = new Student("Huy", 20);
        student.run();
        Person person = (Person) student;
        person.run();

        //instance of
        boolean isStudent = person instanceof Student;
        System.out.println("isStudent = " + isStudent);

    }
}
