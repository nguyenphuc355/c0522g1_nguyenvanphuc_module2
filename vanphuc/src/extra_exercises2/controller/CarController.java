package extra_exercises2.controller;

import extra_exercises2.service.ICarrService;
import extra_exercises2.service.impl.CarService;

import java.util.Scanner;

public class CarController {
    private Scanner scanner = new Scanner(System.in);
    private ICarrService iCarrService = new CarService();

    public void menuCar(){
        do {
            System.out.println("1. Them oto\n" +
                    "2. Hien thi oto\n" +
                    "3. Xoa oto\n" +
                    "4. Tim kiem oto\n" +
                    "5. Quay ve menu chinh");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    iCarrService.addCar();
                    break;
                case 2:
                    iCarrService.displayCar();
                    break;
                case 3:
                    iCarrService.removeCar();
                    break;
                case 4:
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
