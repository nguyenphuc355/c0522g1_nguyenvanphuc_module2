package extra_exercises.service.impl;


import extra_exercises.model.Lecturer;
import extra_exercises.service.ILecturerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LecturerService implements ILecturerService {
    private static List<Lecturer> lecturerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void addLecturer() {
        Lecturer lecturer = infoLecturer();
        lecturerList.add(lecturer);
        System.out.println("them thanh cong!");
    }

    @Override
    public void removeLecturer() {
        System.out.print("nhap id can xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Lecturer lecturer : lecturerList) {
            if (lecturer.getId() == idRemove) {
                System.out.println("ban co muon xoa khong?\n" +
                        "1. co\n" +
                        "2. khong");

                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    lecturerList.remove(lecturer);
                    System.out.println("xoa thanh cong!");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("khong tim thay id");
        }
    }

    @Override
    public void displayAllLecturer() {
        for (Lecturer lecturer : lecturerList) {
            System.out.println(lecturer);
        }
    }

    public static Lecturer infoLecturer() {
        System.out.print("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("nhap name: ");
        String name = scanner.nextLine();
        System.out.print("nhap ngay sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("nhap gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.print("nhap chuyen mon : ");
        String specialize = scanner.nextLine();
        Lecturer lecturer = new Lecturer(id, name, gender, dateOfBirth, specialize);
        return lecturer;
    }
}

