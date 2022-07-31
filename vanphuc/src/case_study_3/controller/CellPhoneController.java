package case_study_3.controller;

import case_study_3.service.ICellPhoneService;
import case_study_3.service.impl.CellPhoneService;

import java.util.Scanner;

public class CellPhoneController {

    private final Scanner SCANNER = new Scanner(System.in);

    public void menuCellPhone(){
        ICellPhoneService iCellPhoneService = new CellPhoneService();
        do {
            System.out.println("1. Them moi dien thoai xach tay\n" +
                    "2. Xoa dien thoai\n" +
                    "3. Tim kiem dien thoai xach tay\n" +
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
                    iCellPhoneService.add();
                    break;
                case 2:
                    iCellPhoneService.remove();
                    break;
                case 3:
                    iCellPhoneService.find();
                    break;
                case 4:
                    iCellPhoneService.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("lua chon khong hop le, moi chon lai!!!");
            }
        }while (true);
    }

}
