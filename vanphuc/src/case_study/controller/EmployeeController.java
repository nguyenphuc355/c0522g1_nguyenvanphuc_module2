package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {

    public static void menuEmployee() {
        Scanner scanner = new Scanner(System.in);
        IEmployeeService iEmployeeService = new EmployeeService();
        do {
            System.out.println("1. Hien thi danh sach nhan vien\n" +
                    "2. Them moi nhan vien\n" +
                    "3. Chinh sua nhan vien\n" +
                    "4. Quay ve menu chinh");

            System.out.print("moi ban nhap lua chon: ");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so, vui long nhap lai");
            }

            switch (choose) {
                case 1:
                    iEmployeeService.display();
                    break;
                case 2:
                    iEmployeeService.add();
                    break;
                case 3:
                    iEmployeeService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("lua chon khong hop le, moi nhap lai");
            }
        } while (true);
    }
}
