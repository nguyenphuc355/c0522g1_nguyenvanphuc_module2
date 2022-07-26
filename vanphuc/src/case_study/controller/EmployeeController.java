package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {

    public static   void menuEmployee(){
        Scanner scanner = new Scanner(System.in);
        IEmployeeService iEmployeeService = new EmployeeService();
        do {
            System.out.println("1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu");

            System.out.print("moi ban nhap lua chon: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
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
            }
        }while (true);
    }
}
