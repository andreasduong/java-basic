package lesson07;

public class Student {
    private int id;
    private String name;

    private static int count;

    public Student( String name) throws IllegalStateException{
        if (count >= 2) {
            throw new IllegalStateException("Tối đa 2 học sinh");
        }

        this.id = ++count;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
