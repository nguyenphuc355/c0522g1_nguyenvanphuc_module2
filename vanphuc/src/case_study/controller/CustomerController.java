package case_study.controller;

import java.util.Scanner;

public class CustomerController {
    private Scanner scanner = new Scanner(System.in);


    public void menuCustomer(){
        do {
            System.out.println("1. Display list customer\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            System.out.print("Enter the option: ");
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
