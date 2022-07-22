package extra_exercise1.controller;

import extra_exercise1.service.IMotorcycleService;
import extra_exercise1.service.impl.MotorcycleService;

import java.util.Scanner;

public class MotorcycleController {
    private final Scanner scanner = new Scanner(System.in);
    private final IMotorcycleService iMotorcycleService = new MotorcycleService();

    public void menuMotorcycle(){
        do {
            System.out.println(" 1. Them xe may\n" +
                    "2. Hien thi xe may\n" +
                    "3. Xoa xe may\n" +
                    "4. Tim kiem xe may\n" +
                    "5. Quay ve menu chinh");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                   iMotorcycleService.addMotorcycle();
                    break;
                case 2:
                    iMotorcycleService.displayMotorcycle();
                    break;
                case 3:
                    iMotorcycleService.removeMotorcycle();
                    break;
                case 4:
                    iMotorcycleService.findMotorcycle();
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
    }


