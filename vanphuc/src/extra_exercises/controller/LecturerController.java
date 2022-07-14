package extra_exercises.controller;

import extra_exercises.service.ILecturerService;
import extra_exercises.service.impl.LecturerService;

import java.util.Scanner;

public class LecturerController {
    private Scanner scanner = new Scanner(System.in);
    private ILecturerService iLecturerService = new LecturerService();

    public void menuLecturer() {
        do {
            System.out.println("1. them moi giang vien\n" +
                    "2. xoa giang vien\n" +
                    "3. hien thi danh sach giang vien\n" +
                    "4. quya ve menu chinh");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iLecturerService.addLecturer();
                    break;
                case 2:
                    iLecturerService.removeLecturer();
                    break;
                case 3:
                    iLecturerService.displayAllLecturer();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
