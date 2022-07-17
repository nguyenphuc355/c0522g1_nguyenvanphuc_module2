package case_study.controller;

import java.util.Scanner;

public class EmployeeController {
    private Scanner scanner = new Scanner(System.in);
    public  void menuEmployee(){
        do {
            System.out.println("1. Display lít employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu");

            System.out.print("moi ban nhap lua chon: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                case 2:
                case 3:
                case 4:
                    return;
            }
        }while (true);
    }
}
