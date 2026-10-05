package assignment04.excercise2;

public class CongNhan extends CanBo{


    private int level;

    public CongNhan(String name, int age, Gender gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= 1 && level <= 10) {
            this.level = level;
        } else {
            throw new IllegalArgumentException("Bậc phải từ 1 đến 10");
        }
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", tuổi: " + age + ", giới tính: " + gender + ", địa chỉ: " + address + ", cấp bậc: " + level;
    }
}
