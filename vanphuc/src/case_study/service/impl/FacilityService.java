package case_study.service.impl;

import case_study.model.Facility;
import case_study.service.IFacilityService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
public static final String PATH = "vanphuc/src/case_study/facility.csv";
private static List<Facility> facilities = new ArrayList<>();
private static Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {

    }
    public static Facility info(){
        System.out.println("Nhap ten dich vu");
        String serviceName = scanner.nextLine();

        System.out.println("Nhap dien tich su dung");
        String area=scanner.nextLine();

        System.out.println("Nhap chi phi thue");
        int cost = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap so nguoi toi da");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap kieu thue");
        String type = scanner.nextLine();
        return null;
    }
}
