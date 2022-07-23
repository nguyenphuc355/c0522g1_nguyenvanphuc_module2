package extra_exercise.service.impl;


import extra_exercise.exception.DuplicateIDException;
import extra_exercise.model.Lecturer;
import extra_exercise.service.ILecturerService;
import extra_exercise.ultils.ReadLecturer;
import extra_exercise.ultils.WriteLecturer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LecturerService implements ILecturerService {
    public static final String PATH = "vanphuc/src/extra_exercise/data/teacher.csv";
    private static List<Lecturer> lecturerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void writeFile(){
        WriteLecturer.writeLecturerFile(PATH,lecturerList);
    }
    public void readFile(){
        List<Lecturer>list = ReadLecturer.readLecturerFile(PATH);

        lecturerList.clear();
        lecturerList.addAll(list);
    }

    /**
     * thêm giảng viên mới vào danh sách
     */
    @Override
    public void addLecturer() {
        readFile();
        Lecturer lecturer = infoLecturer();
        lecturerList.add(lecturer);
        System.out.println("them thanh cong!");
        writeFile();
    }

    /**
     * xóa giảng viên khỏi danh sách
     */
    @Override
    public void removeLecturer() {
        readFile();
        System.out.print("nhap id can xoa: ");
        int idRemove;
        while (true) {
            try {
                idRemove = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so");
            }
        }
        boolean isFlag = false;
        for (Lecturer lecturer : lecturerList) {
            if (lecturer.getId() == idRemove) {
                System.out.println(" ban co muon xoa khong?\n" +
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
        writeFile();

        if (!isFlag) {
            System.out.println("khong tim thay id");
        }
    }

    /**
     * hiển thị danh sách giảng viên
     */
    @Override
    public void displayAllLecturer() {
        readFile();
        for (Lecturer lecturer : lecturerList) {
            System.out.println(lecturer);
        }
    }

    /**
     * tim kiếm giảng viên theo id
     */
    @Override
    public void findLecturerById() {
        readFile();
        System.out.print("nhap id muon tim: ");
        int idFind;
        while (true) {
            try {
                idFind = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so");
            }
        }
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
        readFile();
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
        readFile();
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
        writeFile();
        displayAllLecturer();
    }


    public static Lecturer infoLecturer() {
        System.out.print("nhap id: ");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                for (Lecturer lecturer : lecturerList) {
                    if (lecturer.getId() == id) {
                        throw new DuplicateIDException("id da co, vui long nhap lai!!!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
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

