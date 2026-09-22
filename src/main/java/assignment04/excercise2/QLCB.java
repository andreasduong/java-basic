package assignment04.excercise2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    Scanner scanner = new Scanner(System.in);
    private List<CanBo> canBoList = new LinkedList<>();


    // a) thêm mới cán bộ
    public void themCanBo(CanBo canbo) {
        canBoList.add(canbo);
        System.out.println("Đã thêm cán bộ mới");
    }

    // b) Tìm kiếm theo họ tên
    public void timKiemTheoHoTen (String hoTen) {
        boolean found = false;

        for (CanBo canBo : canBoList) {
            if(canBo.getName().equalsIgnoreCase(hoTen)){
                System.out.println(canBo.toString());
                System.out.println("--------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy cán bộ có tên " + hoTen);
        }
    }

    // c) Hiện thị thông tin danh sách cán bộ
    public  void danhSachCanBo() {
        if (canBoList.isEmpty()) {
            System.out.println("Không có cán bộ nào");
            return;
        }

        for (CanBo canBo : canBoList) {
            System.out.println(canBo.toString());
            System.out.println("--------------------");
        }
    }

    // d) Xoá cán bộ theo tên
    public void xoaCanBo(String hoTen) {
        boolean found = false;
        for (int i = 0; i < canBoList.size(); i++) {
            CanBo canBo = canBoList.get(i);

            if (canBo.getName().equalsIgnoreCase(hoTen)) {
                canBoList.remove(i);
                System.out.println("Đã xoá cán bộ " + hoTen);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Không tìm thấy cán bộ " + hoTen);
        }
    }

    // e) Thoát chương trình
    public void thoat() {
        System.out.println("Đã thoát chương trình");
        System.exit(0);
    }

}
