package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {


    public static void menuCustomer() {
        Scanner scanner = new Scanner(System.in);
        ICustomerService iCustomerService = new CustomerService();
        do {
            System.out.println("1. Hien thi danh sach khach hang\n" +
                    "2. Them moi khach hang\n" +
                    "3. Chinh sua danh sach\n" +
                    "4. Quay ve menu chinh");
            System.out.print("Moi nhap lua chon: ");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so, vui long nhap lai");
            }
            switch (choose) {
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    iCustomerService.add();
                    break;
                case 3:
                    iCustomerService.edit();
                    break;
                case 4:
                    return;
            }

        } while (true);
    }
}
