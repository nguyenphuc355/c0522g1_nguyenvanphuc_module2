package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    public static void menuFacility() {
        IFacilityService iFacilityService = new FacilityService();
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("\n1. Hien thi danh sach co so ha tang\n" +
                    "2. Them moi co so ha tang\n" +
                    "3. hien thi danh sach bao tri co so\n" +
                    "4. Quay ve menu chinh");

            System.out.print("Moi nhao lua chon: ");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("phai nhap so!!");
            }
            switch (choose) {
                case 1:
                    iFacilityService.display();
                    break;
                case 2:
                    MenuAddFacility.menuAdd();
                    break;
                case 3:
                    iFacilityService.displayMaintenance();
                    break;
                case 4:
                    return;
            }
        } while (true);

    }
}