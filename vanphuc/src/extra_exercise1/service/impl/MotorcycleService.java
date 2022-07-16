package extra_exercise1.service.impl;



import extra_exercise1.model.Motorcycle;
import extra_exercise1.service.IMotorcycleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorcycleService implements IMotorcycleService {
    private static List<Motorcycle> motorcycleList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    public static Motorcycle infoMotorcycle(){
        System.out.print("Nhap bien kiem soat: ");
        String seaOfControl = scanner.nextLine();

        System.out.print("Nhap ten hang san xuat: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Nhap nam san xuat: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap chu so huu: ");
        String owner = scanner.nextLine();

        System.out.print("Nhap cong suat: ");
        int wattage = Integer.parseInt(scanner.nextLine());

        Motorcycle motorcycle  = new Motorcycle(seaOfControl,manufacturer,yearOfManufacture,owner,wattage);
        return motorcycle;

    }


    @Override
    public void addMotorcycle() {
        Motorcycle motorcycle = infoMotorcycle();
        motorcycleList.add(motorcycle);
        System.out.println("them thanh cong1");
    }

    @Override
    public void displayMotorcycle() {
        for (Motorcycle motorcycle : motorcycleList){
            System.out.println(motorcycle);
        }
    }

    @Override
    public void removeMotorcycle() {
        System.out.print("nhap bien kiem soat muon xoa: ");
        String SeaOfControlRemove = scanner.nextLine();
        boolean isFlag = false;
        for (Motorcycle motorcycle: motorcycleList){
            if (motorcycle.getSeaOfControl().equals(SeaOfControlRemove) ){
                System.out.println("ban muon xoa hay khong?\n" +
                        "1. co\n" +
                        "2. khong");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());

                if (chooseYesNo==1){
                    motorcycleList.remove(motorcycle);
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
    public void findMotorcycle() {
        System.out.print("nhap bien so xe muon tim: ");
        String SeaOfControlFind = scanner.nextLine();
        boolean isFlag = false;
        for (Motorcycle motorcycle : motorcycleList) {
            if (motorcycle.getSeaOfControl().equals(SeaOfControlFind)) {
                System.out.println(motorcycle);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }
    }

}
