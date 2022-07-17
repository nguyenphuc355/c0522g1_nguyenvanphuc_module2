package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    private Scanner scanner = new Scanner(System.in);

    public void menuPromotion(){
        do {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu.");

            System.out.print("Enter th option: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                case 2:
                case 3:
                    return;
            }
        }while (true);
    }
}
