package assignment04.excercise2;

public class KySu extends CanBo {
    private String major;

    public KySu(String name, int age, Gender gender, String address, String major) {
        super(name, age, gender, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
         return "Tên: " + name + ", tuổi: " + age + ", giới tính: " + gender + ", địa chỉ: " + address + ", ngành đào tạo: " + major;
    }
}
