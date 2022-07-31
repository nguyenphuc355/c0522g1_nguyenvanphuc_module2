package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class MenuAddFacility {


    public static void menuAdd() {
         IFacilityService iFacilityService = new FacilityService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("====THEM CO SO HA TANG====\n" +
                    "1. Them Vila\n" +
                    "2. Them House\n" +
                    "3. Them Room\n" +
                    "4. Quay ve menu chinh");

            System.out.print("moi nhap lua chon: ");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("phai nhap so!!");
            }
            switch (choose) {
                case 1:
                    iFacilityService.addVilla();
                    break;
                case 2:
                    iFacilityService.addHouse();
                    break;
                case 3:
                    iFacilityService.addRoom();
                case 4:
                    return;
                default:
                    System.out.println("lua chon kho hop le, nhap lai!!");
            }
        } while (true);

    }
}