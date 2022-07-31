package case_study_2.controller;

import case_study_2.service.ITaiKhoanThanhToanService;
import case_study_2.service.impl.TaiKhoanThanhToanService;

import java.util.Scanner;

public class TaiKhoanThanhToanController {
    private  ITaiKhoanThanhToanService iTaiKhoanThanhToanService = new TaiKhoanThanhToanService();
    private  Scanner scanner = new Scanner(System.in);

    public void menuTaiKhoanThanhToan(){
        do {
            System.out.println("1. Them moi tai khoan thanh toan\n" +
                    "2. Xoa tai khoan thanh toan\n" +
                    "3. Tim kiem tai khoan thanh toan\n" +
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
                    iTaiKhoanThanhToanService.add();
                    break;
                case 2:
                    iTaiKhoanThanhToanService.remove();
                    break;
                case 3:
                    iTaiKhoanThanhToanService.find();
                    break;
                case 4:
                    iTaiKhoanThanhToanService.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("lua chon khong hop le, moi chon lai!!!");
            }
        }while (true);
    }
}
