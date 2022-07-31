package case_study_2.controller;

import case_study_2.service.ITaiKhoanTietKiemService;
import case_study_2.service.impl.taiKhoanTietKiemService;

import java.util.Scanner;

public class TaiKhoanTietKiemController {
    private  Scanner scanner = new Scanner(System.in);
    private ITaiKhoanTietKiemService iTaiKhoanTietKiemService = new taiKhoanTietKiemService();

    public void menuTaiKhoanTietKiem(){
        do {
            System.out.println("1. Them moi tai khoan tiet kiem\n" +
                    "2. Xoa tai khoan tiet kiem\n" +
                    "3. Tim kiem tai khoan tiet kiem\n" +
                    "4. Xem danh sach tai khoan\n" +
                    "5. Quay lai menu chinh");

            int choose=0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Phai nhap so!!");
            }

            switch (choose){
                case 1:
                    iTaiKhoanTietKiemService.add();
                    break;
                case 2:
                    iTaiKhoanTietKiemService.remove();
                    break;
                case 3:
                    iTaiKhoanTietKiemService.find();
                    break;
                case 4:
                    iTaiKhoanTietKiemService.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lua chon khong hop le, moi nhap lai!!");
            }
        }while (true);

    }
}
