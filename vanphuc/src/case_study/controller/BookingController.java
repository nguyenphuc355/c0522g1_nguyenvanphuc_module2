package case_study.controller;

import java.util.Scanner;

public class BookingController {
    private Scanner scanner = new Scanner(System.in);

    public void menuBooking(){
        do {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu.");

            System.out.print("Enter the option: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return;
            }

        }while (true);
    }
}
