package extra_exercise.controller;

import extra_exercise.service.ILecturerService;
import extra_exercise.service.impl.LecturerService;

import java.util.Scanner;

public class LecturerController {
    private  Scanner scanner = new Scanner(System.in);
    private  ILecturerService iLecturerService = new LecturerService();

    public void menuLecturer() {
        do {
            System.out.println("""
                    1. them moi giang vien
                    2. xoa giang vien
                    3. hien thi danh sach giang vien
                    4. Tim giang vien theo id
                    5. Tim giang vien theo ten
                    6. Sap xep theo ten
                    6. quay ve menu chinh""");
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
                    iLecturerService.findLecturerById();
                    break;
                case 5:
                    iLecturerService.findLecturerByName();
                    break;
                case 6:
                    iLecturerService.bubbleSortLecturer();
                    break;
                case 7:
                    return;

            }
        } while (true);
    }
}
