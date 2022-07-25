package extra_exercise.controller;

import extra_exercise.service.ILecturerService;
import extra_exercise.service.impl.LecturerService;

import java.util.Scanner;

public class LecturerController {
    private  Scanner scanner = new Scanner(System.in);
    private  ILecturerService iLecturerService = new LecturerService();

    public void menuLecturer() {
        do {
            System.out.println("1. them moi giang vien\n" +
                    "2. xoa giang vien\n" +
                    "3. hien thi danh sach giang vien\n" +
                    "4. Tim giang vien theo id\n" +
                    "5. Tim giang vien theo ten\n" +
                    "6. Sap xep theo ten\n" +
                    "7. quay ve menu chinh");
            int choose =0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("---nhap lai so---");;
            }
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
                default:
                    System.out.println("yeu cau nhap lai!!!");

            }
        } while (true);
    }
}
