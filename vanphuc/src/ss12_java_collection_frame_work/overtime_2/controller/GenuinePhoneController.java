package ss12_java_collection_frame_work.overtime_2.controller;


import ss12_java_collection_frame_work.overtime_2.service.IGenuinePhoneService;
import ss12_java_collection_frame_work.overtime_2.service.impl.GenuinePhoneService;

import java.util.Scanner;

public class GenuinePhoneController {
    private static final Scanner SCANNER = new Scanner(System.in);

    public void menuGenuinePhone(){
        IGenuinePhoneService iGenuinePhoneService = new GenuinePhoneService();
        do {
            System.out.println("1. Them moi dien thoai chinh hang\n" +
                    "2. Xoa tai dien thoai\n" +
                    "3. Tim kiem dien thoai\n" +
                    "4. Xem danh sach dien thoai\n" +
                    "5. Quay lai menu chinh");

            int choose=0;
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Phai nhap so!!");
            }

            switch (choose){
                case 1:
                    iGenuinePhoneService.add();
                    break;
                case 2:
                    iGenuinePhoneService.remove();
                    break;
                case 3:
                    iGenuinePhoneService.find();
                    break;
                case 4:
                    iGenuinePhoneService.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lua chon khong hop le, moi nhap lai!!");
            }
        }while (true);

    }
}
