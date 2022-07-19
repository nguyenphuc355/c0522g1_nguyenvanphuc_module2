package extra_exercise.controller;

import extra_exercise.service.IStudentService;
import extra_exercise.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private  Scanner scanner = new Scanner(System.in);
    private  IStudentService iStudentService = new StudentService();

    public void menuStudent() {
        do {
            System.out.println("""
                    1. Them moi hoc sinh
                    2. Xoa hoc sinh
                    3. Hien thi hoc sinh
                    4. Tim hoc sinh theo id
                    5. Tim hoc sinh theo ten
                    6. Quay ve menu chinh""");
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
                    iStudentService.findStudentById();
                    break;
                case 5:
                    iStudentService.findStudentByName();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }
}
