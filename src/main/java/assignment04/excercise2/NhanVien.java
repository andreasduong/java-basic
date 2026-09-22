package assignment04.excercise2;

public class NhanVien extends CanBo {
    private String occupation;

    public NhanVien(String name, int age, Gender gender, String address, String occupation) {
        super(name, age, gender, address);
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String   toString() {
        return "Tên: " + name + ", tuổi: " + age + ", giới tính: " + gender + ", địa chỉ: " + address + ", vị trí: " + occupation;
    }
}
