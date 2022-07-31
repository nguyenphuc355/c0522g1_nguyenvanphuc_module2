package case_study.controller;

import case_study.service.IBookingService;
import case_study.service.IContactService;
import case_study.service.impl.BookingService;
import case_study.service.impl.ContactService;

import java.util.Scanner;

public class BookingController {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menuBooking() {
        IBookingService iBookingService = new BookingService();
        IContactService iContactService = new ContactService();
        do {
            System.out.println("1. Them lua chon\n" +
                    "2. Hien thi danh sach lua chon\n" +
                    "3. Tao moi hop dong\n" +
                    "4. Hien thi danh sach hop dong\n" +
                    "5. Chinh sua hop dong\n" +
                    "6. Quay ve menu chinh.");

            System.out.print("Moi nhap lua chon: ");
            int choose = 0;
            try {
                choose = Integer.parseInt(SCANNER.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so, vui long nhap lai");
            }
            switch (choose) {
                case 1:
                    iBookingService.add();
                    break;
                case 2:
                    iBookingService.display();
                    break;
                case 3:
                    iContactService.addContract();
                    break;
                case 4:
                    iContactService.displayContract();
                    break;
                case 5:
                    iContactService.edit();
                    break;
                case 6:
                    return;
            }

        } while (true);
    }
}
