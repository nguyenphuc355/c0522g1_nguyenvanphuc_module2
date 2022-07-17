package case_study.controller;

import java.util.Scanner;

public class FacilityController {
    private Scanner scanner = new Scanner(System.in);

    public void menuFacility(){
        System.out.println("1. Display list facility\n" +
                "2. Add new facility\n" +
                "3. Add new facility" +
                "4. Return main menu.");

        System.out.print("Enter the option: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
            case 2:
            case 3:
            case 4:
                return;
        }
    }
}
