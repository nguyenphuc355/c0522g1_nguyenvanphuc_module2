package extra_exercise.service.impl;


import extra_exercise.model.Lecturer;
import extra_exercise.service.ILecturerService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LecturerService implements ILecturerService {
    private static List<Lecturer> lecturerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
    lecturerList.add(new Lecturer(1,"Oanh","1990","nu","Toan"));
    lecturerList.add(new Lecturer(2,"Hau","1989","nam","Van"));
    lecturerList.add(new Lecturer(3,"Tra","1987","nu","Anh"));
    lecturerList.add(new Lecturer(4,"Yen","1992","nam","Ly"));
    }

    /**
     * thêm giảng viên mới vào danh sách
     */
    @Override
    public void addLecturer() {
        Lecturer lecturer = infoLecturer();
        lecturerList.add(lecturer);
        System.out.println("them thanh cong!");
    }

    /**
     * xóa giảng viên khỏi danh sách
     */
    @Override
    public void removeLecturer() {
        System.out.print("nhap id can xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Lecturer lecturer : lecturerList) {
            if (lecturer.getId() == idRemove) {
                System.out.println("""
                        ban co muon xoa khong?
                        1. co
                        2. khong""");

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

    /**
     * hiển thị danh sách giảng viên
     */
    @Override
    public void displayAllLecturer() {
        for (Lecturer lecturer : lecturerList) {
            System.out.println(lecturer);
        }
    }

    /**
     * tim kiếm giảng viên theo id
     */
    @Override
    public void findLecturerById() {
        System.out.print("nhap id muon tim: ");
        int idFind = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Lecturer lecturer : lecturerList) {
            if (lecturer.getId() == idFind) {
                System.out.println(lecturer);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("=====Khong tim thay=====");
        }
    }

    /**
     * tìm kiếm giảng viên theo tên
     */
    @Override
    public void findLecturerByName() {
        boolean isExist = false;
        System.out.print("Moi nhap ten can tim: : ");
        String nameFind = scanner.nextLine();

        for (Lecturer lecturer : lecturerList) {
            if (lecturer.getName().contains(nameFind)) {
                System.out.println(lecturer);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("=====Khong tim thay=====");
        }
    }

    @Override
    public void bubbleSortLecturer() {
        boolean isSwap = true;
        for (int i = 0; i < lecturerList.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < lecturerList.size() - 1 - i; j++) {
                if (lecturerList.get(j).getName().compareTo(lecturerList.get(j + 1).getName()) > 0) {
                    Collections.swap(lecturerList, j, j + 1);
                    isSwap = true;
                }
            }
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
        return new Lecturer(id, name, gender, dateOfBirth, specialize);
    }
}

