package case_study.controller;

import java.util.Scanner;

public class DisplayMainController {
    public static void menuController(){

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("========Furama=======\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit.");
            System.out.print("moi ban nhap lua chon: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.exit(0);
            }

        }while (true);
    }
}
