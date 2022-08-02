package case_study.controller;


import java.util.Scanner;

public class DisplayMainController {
    public static void menuController() {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("========Furama Resort========\n" +
                    "1. Quan ly nhan vien\n" +
                    "2. Quan ly khach hang\n" +
                    "3. Quan ly co so\n" +
                    "4. Quan ly dat cho\n" +
                    "5. Quan ly khuyen mai\n" +
                    "6. Thoat");
            System.out.print("moi ban nhap lua chon: ");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so, vui long nhap lai");
            }

            switch (choose) {
                case 1:
                    EmployeeController.menuEmployee();
                    break;
                case 2:
                    CustomerController.menuCustomer();
                    break;
                case 3:
                    FacilityController.menuFacility();
                    break;
                case 4:
                    BookingController.menuBooking();
                    break;
                case 5:
                    PromotionController.menuPromotion();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("lua chon khong hop le, moi nhap lai!!");
            }

        } while (true);
    }
}
