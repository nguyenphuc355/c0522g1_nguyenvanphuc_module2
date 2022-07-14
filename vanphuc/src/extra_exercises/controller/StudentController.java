package extra_exercises.controller;

import extra_exercises.service.IStudentService;
import extra_exercises.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IStudentService iStudentService = new StudentService();

    public void menuStudent() {
        do {
            System.out.println("1. Them moi hoc sinh\n" +
                    "2. Xoa hoc sinh\n" +
                    "3. Hien thi hoc sinh\n" +
                    "4. Quay ve menu chinh");
            int choose = Integer.parseInt(scanner.nextLine());
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
                    return;
            }
        } while (true);
    }
}
