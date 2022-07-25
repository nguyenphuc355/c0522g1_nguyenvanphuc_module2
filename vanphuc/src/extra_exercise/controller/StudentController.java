package extra_exercise.controller;

import extra_exercise.service.IStudentService;
import extra_exercise.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private  Scanner scanner = new Scanner(System.in);
    private  IStudentService iStudentService = new StudentService();

    public void menuStudent() {
        do {
            System.out.println("1. Them moi hoc sinh\n" +
                    "2. Xoa hoc sinh\n" +
                    "3. Hien thi hoc sinh\n" +
                    "4. Tim hoc sinh theo id\n" +
                    "5. Tim hoc sinh theo ten\n" +
                    "6. Sap xep hoc sinh theo ten\n" +
                    "7. Quay ve menu chinh");
            int choose =0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("---nhap lai so---");;
            }

            switch (choose) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.disPlayAllStudent();
                    break;
                case 4:
                    iStudentService.findStudentById();
                    break;
                case 5:
                    iStudentService.findStudentByName();
                    break;
                case 6:
                    iStudentService.bubbleSortName();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("yeu cau nhap lai!!!");
            }
        } while (true);
    }
}
