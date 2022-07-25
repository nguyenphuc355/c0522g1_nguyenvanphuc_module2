package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    public void menuFacility() {
        Scanner scanner = new Scanner(System.in);
        IFacilityService iFacilityService = new FacilityService();

        System.out.println("1. Display list facility\n" +
                "2. Add new facility\n" +
                "3 Display list facility maintenance" +
                "4. Return main menu.");

        System.out.print("Enter the option: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                iFacilityService.add();
            case 2:
            case 3:
            case 4:
                return;
        }
    }
}
