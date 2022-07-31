package case_study_3.controller;

import java.util.Scanner;

public class DisplayPhoneController {

        public static void menuController() {
            CellPhoneController cellPhoneController = new CellPhoneController();
            GenuinePhoneController genuinePhoneController = new GenuinePhoneController();
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("--CHUONG TRINH QUAN LY DIEN THOAI--\n" +
                        "1. Quan ly dien thoai xach tay\n" +
                        "2. Quan ly dien thoai chinh hang\n" +
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
                        cellPhoneController.menuCellPhone();
                        break;
                    case 2:
                        genuinePhoneController.menuGenuinePhone();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Lua chon khong hop le, moi chon lai!!!");
                }
            } while (true);
        }
    }


