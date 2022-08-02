package ss12_java_collection_frame_work.overtime_2.utils;

import java.util.Scanner;

public class MenuUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getRange() {
        System.out.println("Nhap pham vi bao hanh:\n" +
                "1. Quoc Te.\n" +
                "2. Toan Quoc.");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
            switch (choose) {
                case 1:
                    return "Quoc te";
                case 2:
                    return "Toan Quoc";
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại, vui lòng chọn lại!");
            }
        } while (true);
    }

    public static String getStatus() {
        System.out.println("Nhap trang thai:\n" +
                "1. Da Sua Chua.\n" +
                "2. Chua Sua Chua.");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!");
            }
            switch (choose) {
                case 1:
                    return "Da Sua Chua";
                case 2:
                    return "Chua Sua Chua";
                default:
                    System.out.println("lua chon khong ton tai, moi nhap lai!");
            }
        } while (true);
    }

    public static String getName() {
        String serviceName = SCANNER.nextLine();
        String[] arr = serviceName.toLowerCase().trim().split("");
        StringBuilder str = new StringBuilder().append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    str.append(arr[i].toUpperCase());
                } else {
                    str.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                str.append(arr[i]);
            }
        }
        return str.toString();
    }
}
