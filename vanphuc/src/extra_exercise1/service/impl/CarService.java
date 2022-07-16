package extra_exercise1.service.impl;

import extra_exercise1.model.Car;
import extra_exercise1.service.ICarrService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarrService {
    private List<Car> carList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void addCar() {
        Car car = infoCar();
        carList.add(car);
        System.out.println("them thanh cong!");
    }

    @Override
    public void displayCar() {
        for (Car car: carList){
            System.out.println(car);
        }
    }

    @Override
    public void removeCar() {
        System.out.print(" nhap bien kiem soat can xoa: ");
        String SeaOfControlRemove = scanner.nextLine();
        boolean isFlag = false;
        for (Car car: carList){
            if (car.getSeaOfControl().equals(SeaOfControlRemove) ){
                System.out.println("ban muon xoa hay khong?\n" +
                        "1. co\n" +
                        "2. khong");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());

                if (chooseYesNo==1){
                    carList.remove(car);
                    System.out.println("xoa thanh cong!");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag){
            System.out.println("khong tim thay!");
        }
    }

    @Override
    public void findCar() {
        System.out.print("nhap bien so xe muon tim: ");
        String SeaOfControlFind = scanner.nextLine();
        boolean isFlag = false;
        for (Car car : carList) {
            if (car.getSeaOfControl().equals(SeaOfControlFind)) {
                System.out.println(car);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }
    }

    public static Car infoCar(){
        System.out.print("nhap bien kiem soat: ");
        String seaOfControl = scanner.nextLine();

        System.out.print("Nhap ten hang san xuat: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Nhap nam san xuat: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap chu so huu: ");
        String owner = scanner.nextLine();

        System.out.print("Nhap so cho ngoi: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap kieu xe: ");
        String vehicleType = scanner.nextLine();

        Car car = new Car(seaOfControl,manufacturer,yearOfManufacture,owner,numberOfSeats,vehicleType);
        return car;
    }
}
