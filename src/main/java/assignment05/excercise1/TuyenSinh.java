package assignment05.excercise1;

import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
    private Scanner scanner = new Scanner(System.in);
    private List<ThiSinh> thiSinhList = new LinkedList<>();

    @Override
    public void themThiSinh() {
        System.out.println("Nhập vào số báo danh:");
        int soBaoDanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào họ tên:");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ:");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập mức ưu tiên:");
        int mucUuTien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào khối thi:");
        String khoiThi = scanner.nextLine();
    }

    @Override
    public void hienThiDSTS() {

    }

    @Override
    public void timKiemThiSinhTheoSBD() {

    }
}
