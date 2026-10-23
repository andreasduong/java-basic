package assignment05.excercise1;

public class ThiSinhKhoiA extends ThiSinh {
    public ThiSinhKhoiA(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String monThi() {
        return "Toán, Lý, Hoá";
    }
}
