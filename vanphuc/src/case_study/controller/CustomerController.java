package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {



    public static void menuCustomer(){
        Scanner scanner = new Scanner(System.in);
        ICustomerService iCustomerService = new CustomerService();
        do {
            System.out.println("1. Display list customer\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            System.out.print("Enter the option: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    iCustomerService.add();
                    break;
                case 3:
                case 4:
                    return;
            }

        }while (true);
    }
}
