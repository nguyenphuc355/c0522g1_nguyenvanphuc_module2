package extra_exercises2.controller;

import extra_exercises2.service.ITruckService;
import extra_exercises2.service.impl.TruckService;

import java.util.Scanner;

public class TruckController {
    private Scanner scanner = new Scanner(System.in);
    private ITruckService iTruckService = new TruckService();

    public void menuTruck(){
        do {
            System.out.println("1. them moi xe tai\n" +
                    "2. Hien thi danh sach\n" +
                    "3. Xoa xe tai\n" +
                    "4. Tom kiem xe tai\n" +
                    "5. Quay lai menu chinh");

            int choose = Integer.parseInt(scanner.nextLine());
             switch (choose){
                 case 1:
                     iTruckService.addTruck();
                     break;
                 case 2:
                     iTruckService.displayTruck();
                     break;
                 case 3:
                     iTruckService.removeTruck();
                     break;
                 case 4:
                     break;
                 case 5:
                     return;
             }
        }while(true);
    }
}
