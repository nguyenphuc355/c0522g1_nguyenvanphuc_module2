package extra_exercise.service.impl;

import extra_exercise.model.Student;
import extra_exercise.service.IStudentService;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static  List<Student> studentList = new ArrayList<>();
    private static  Scanner scanner = new Scanner(System.in);

    /**
     * thêm học sinh mới vào danh sách
     */
    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("them moi thanh cong! ");
    }

    /**
     * xóa học sinh khỏi danh sách
     */
    @Override
    public void removeStudent() {
        System.out.print("moi ban nhap id can xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println("""
                        Ban muon xoa hay khong?
                        1. co
                        2. khong""");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("da xoa thanh cong!");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("khong tim thay!");
        }
    }

    /**
     * hiển thị danh sách học sinh
     */
    @Override
    public void disPlayAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    /**
     * tìm kiếm học sinh trong danh sách theo id
     */

    @Override
    public void findStudentById() {
        System.out.print("nhap id muon tim: ");
        int idFind = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idFind) {
                System.out.println(student);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("=====Khong tim thay=====");
        }
    }

    /**
     * tìm kiếm học sinh theo tên
     */
    @Override
    public void findStudentByName() {
        boolean isExist = false;
        System.out.print("Moi nhap ten can tim: : ");
        String nameFind = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getName().contains(nameFind)) {
                System.out.println(student);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("=====Khong tim thay=====");
        }
    }

    public static Student infoStudent() {
        System.out.print("nhap id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("nhap name:");
        String name = scanner.nextLine();
        System.out.print("nhap ngay sinh:");
        String dateOfBirth = scanner.nextLine();
        System.out.print("nhap gioi tinh:");
        String gender = scanner.nextLine();
        System.out.print("nhap lop:");
        String classes = scanner.nextLine();
        System.out.print("nhap diem:");
        double point = Double.parseDouble(scanner.nextLine());
        return new Student(id, name, dateOfBirth, gender, classes, point);
    }
}
