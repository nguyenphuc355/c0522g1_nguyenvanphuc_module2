package extra_exercise1.controller;

import extra_exercise1.service.ICarrService;
import extra_exercise1.service.impl.CarService;

import java.util.Scanner;

public class CarController {
    private final Scanner scanner = new Scanner(System.in);
    private final ICarrService iCarrService = new CarService();

    public void menuCar() {
        do {
            System.out.println("""
                    1. Them oto
                    2. Hien thi oto
                    3. Xoa oto
                    4. Tim kiem oto
                    5. Quay ve menu chinh""");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
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
                    iCarrService.findCar();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
