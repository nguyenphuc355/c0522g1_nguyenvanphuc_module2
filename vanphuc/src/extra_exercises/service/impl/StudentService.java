package extra_exercises.service.impl;

import extra_exercises.model.Student;
import extra_exercises.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("them moi thanh cong! ");
    }

    @Override
    public void removeStudent() {
        System.out.print("moi ban nhap id can xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println("Ban muon xoa hay khong?\n" +
                        "1. co\n" +
                        "2. khong");
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

    @Override
    public void disPlayAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
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
        Student student = new Student(id, name, dateOfBirth, gender, classes, point);
        return student;
    }
}
