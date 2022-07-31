package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuPromotion() {
        do {
            System.out.println("1. Danh sach khach hang su dung dich vu\n" +
                    "2. Danh sach khach hang nhan duoc voucher\n" +
                    "3. Quay ve menu chinh");

            System.out.print("Moi nhap lua chon: ");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so, vui long nhap lai");
            }
            switch (choose) {
                case 1:
                case 2:
                case 3:
                    return;
            }
        } while (true);
    }
}
