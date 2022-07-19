package extra_exercise.service.impl;


import extra_exercise.model.Lecturer;
import extra_exercise.model.Student;
import extra_exercise.service.ILecturerService;

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

    @Override
    public void findLecturer() {
        int choose;
        boolean isExist = false;

        do {
            System.out.println("Tìm kiểm theo: \n" +
                    "1. Id.\n" +
                    "2. Tên.");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose != 1 && choose != 2) {
                System.out.println("Nhập lại!");
            }
        } while (choose != 1 && choose != 2);

        if (choose == 1) {
            System.out.println("Mời bạn nhập id cần tìm kiếm: ");
            int idFind = Integer.parseInt(scanner.nextLine());

            for (Lecturer lecturer : lecturerList) {
                if (lecturer.getId() == idFind) {
                    System.out.println(lecturer);
                    isExist = true;
                    break;
                }
            }
        }
        else {
            System.out.println("Mời bạn nhập tên cần tìm kiếm: ");
            String nameFind = scanner.nextLine();

            for (Lecturer teacher : lecturerList) {
                if (teacher.getName().contains(nameFind)) {
                    System.out.println(teacher);
                    isExist = true;
                }
            }
        }

        if (!isExist) {
            System.out.println("Không tìm thấy!");
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

