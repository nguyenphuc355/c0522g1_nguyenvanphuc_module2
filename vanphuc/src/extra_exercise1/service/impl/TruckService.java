package extra_exercise1.service.impl;

import extra_exercise1.model.Truck;
import extra_exercise1.service.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
private static final List<Truck> truckList = new ArrayList<>();
private static final Scanner scanner = new Scanner(System.in);
    @Override
    public void addTruck() {
        Truck truck = infoTruck();
        truckList.add(truck);
        System.out.println("them thanh cong!");
    }

    @Override
    public void displayTruck() {
        for (Truck truck : truckList){
            System.out.println(truck);
        }
    }

    @Override
    public void removeTruck() {
        System.out.println(" nhap bien kiem soat can xoa");
        String seaOfControlRemove = scanner.nextLine();
        boolean isFlag = false;
        for (Truck truck: truckList){
            if (truck.getSeaOfControl().equals(seaOfControlRemove)){
                System.out.println("""
                        ban co muon xoa khong
                        1. co
                        2. khong""");

                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo==1){
                    truckList.remove(truck);
                    System.out.println("xoa thanh cong");
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
    public void findTruck() {
        System.out.print("nhap bien so xe muon tim: ");
        String SeaOfControlFind = scanner.nextLine();
        boolean isFlag = false;
        for (Truck truck : truckList) {
            if (truck.getSeaOfControl().equals(SeaOfControlFind)) {
                System.out.println(truck);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }
    }

    public static Truck infoTruck(){
        System.out.print(" Nhap bien kiem soat:");
        String seaOfControl = scanner.nextLine();

        System.out.print(" Nhap ten hang san xuat:");
        String manufacturer = scanner.nextLine();

        System.out.print(" Nhap nam san xuat:");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());

        System.out.print(" Nhap chu so huu:");
        String owner = scanner.nextLine();

        System.out.print(" nhap trong tai:");
        int tonnage = Integer.parseInt(scanner.nextLine());

        return new Truck(seaOfControl,manufacturer,yearOfManufacture,owner,tonnage);
    }
}
