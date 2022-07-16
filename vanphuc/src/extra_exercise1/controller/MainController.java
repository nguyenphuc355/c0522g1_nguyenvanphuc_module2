package extra_exercise1.controller;

import java.util.Scanner;

public class MainController {
    public MainController(String seaOfControl, String manufacturer, int yearOfManufacture, String owner, int wattage) {
    }

    public static void menuController(){
        CarController carController = new CarController();
        TruckController truckController = new TruckController();
        MotorcycleController motorcycleController = new MotorcycleController();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("==== DANH SACH PHUONG TIEN ====\n"+
                    "1. Quan ly oto\n" +
                    "2. Quan ly xe tai\n" +
                    "3. Quan ly xe may\n" +
                    "4. thoat chuong trinh");

            System.out.print("moi ban nhap lua chon: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    carController.menuCar();
                    break;
                case 2:
                    truckController.menuTruck();
                    break;
                case 3:
                    motorcycleController.menuMotorcycle();
                    break;
                case 4:
                    System.exit(0);
            }
        }while (true);
    }
}
