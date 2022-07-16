package extra_exercise.controller;

import java.util.Scanner;

public class StudyController {
    public static void menuController() {
        StudentController studentController = new StudentController();
        LecturerController lecturerController = new LecturerController();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcome to my school!\n" +
                    "1. Quan ly hoc sinh\n" +
                    "2. Quan ly giang vien\n" +
                    "3. Thoat chuong trinh");

            System.out.println("moi ban nhap lua chon: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentController.menuStudent();
                    break;
                case 2:
                    lecturerController.menuLecturer();
                    break;
                case 3:
                    System.exit(0);
            }

        } while (true);
    }
}
