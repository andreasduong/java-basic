package assignment04.excercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QLCB qlcb = new QLCB();

        while (true) {
            System.out.println("\n===== QUẢN LÝ CÁN BỘ =====");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("\n1. Công nhân");
                    System.out.println("2. Kỹ sư");
                    System.out.println("3. Nhân viên");
                    System.out.print("Chọn loại cán bộ: ");

                    int type = Integer.parseInt(scanner.nextLine());

                    System.out.println("Nhập họ tên: ");
                    String name = scanner.nextLine();

                    System.out.println("Nhập tuổi");
                    int age = Integer.parseInt(scanner.nextLine());

                    System.out.println("Nhập giới tính");

                    System.out.println("Chọn giới tính:");
                    System.out.println("1. Nam");
                    System.out.println("2. Nữ");
                    System.out.println("3. Khác");
                    System.out.print("Lựa chọn: ");
                    int genderChoice = Integer.parseInt(scanner.nextLine());

                    Gender gender;
                    switch (genderChoice) {
                        case 1:
                            gender = Gender.MALE;
                            break;
                        case 2:
                            gender = Gender.FEMALE;
                            break;
                        case 3:
                            gender =Gender.OTHER;
                            break;
                        default:
                            throw new IllegalArgumentException("Giới tính không hợp lệ");
                    }

                    System.out.println("Địa chỉ");
                    String address = scanner.nextLine();

                    if (type == 1) {
                        System.out.println("Bậc (1-10): ");
                        int level = Integer.parseInt(scanner.nextLine());

                        qlcb.themCanBo(new CongNhan(name, age, gender, address, level));
                    }

                    if (type == 2) {
                        System.out.println("Ngành đào tạo: ");
                        String major = scanner.nextLine();

                        qlcb.themCanBo(new KySu(name, age, gender, address, major));
                    }

                    if (type == 3) {
                        System.out.println("Công việc: ");
                        String occupation = scanner.nextLine();

                        qlcb.themCanBo(new NhanVien(name, age, gender ,address, occupation));
                    }
                    break;
                case 2:
                    System.out.println("Nhập họ tên cần tìm: ");
                    String nameSearch = scanner.nextLine();
                    qlcb.timKiemTheoHoTen(nameSearch);
                    break;
                case 3:
                    qlcb.danhSachCanBo();
                    break;
                case 4:
                    System.out.println("Nhập tên cần xoá: ");
                    String nameDel = scanner.nextLine();
                    qlcb.xoaCanBo(nameDel);
                    break;
                case 5:
                    qlcb.thoat();
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
