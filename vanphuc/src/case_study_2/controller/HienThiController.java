package case_study_2.controller;

import java.util.Scanner;

public class HienThiController {
    public static void menuController() {
        TaiKhoanThanhToanController taiKhoanThanhToan = new TaiKhoanThanhToanController();
        TaiKhoanTietKiemController taiKhoanTietKiem = new TaiKhoanTietKiemController();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("--CHUONG TRINH QUAN LY NGAN HANG--\n" +
                    "1. Quan ly tai khoan thanh toan\n" +
                    "2. Quan ly tai khoan tiet kiem\n" +
                    "3. Thoat");
            System.out.print("Moi nhap lua chon: ");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so!!");
            }

            switch (choose) {
                case 1:
                    taiKhoanThanhToan.menuTaiKhoanThanhToan();
                    break;
                case 2:
                    taiKhoanTietKiem.menuTaiKhoanTietKiem();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le, moi chon lai!!!");
            }
        } while (true);
    }
}
