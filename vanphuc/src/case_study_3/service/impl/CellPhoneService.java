package case_study_3.service.impl;

import case_study_3.exception.NotFoundPhoneAccountException;
import case_study_3.model.CellPhone;
import case_study_3.model.Phone;
import case_study_3.service.ICellPhoneService;
import case_study_3.utils.MenuUtil;
import case_study_3.utils.ReadWritePhone;

import java.util.List;
import java.util.Scanner;

public class CellPhoneService implements ICellPhoneService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "vanphuc/src/case_study_3/data/cell_phone.csv";

    @Override
    public void add() {
        List<Phone> list = ReadWritePhone.readFiles(PATH);
        int id = list.get(list.size() - 1).getId() + 1;

        System.out.print("Nhap ten dien thoai: ");
        String name = SCANNER.nextLine();

        System.out.print("Nhap gia ban: ");
        int price;
        while (true) {
            try {
                price = Integer.parseInt(SCANNER.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("phia nhap so!!");
            }
        }
        System.out.print("Nhap so luong: ");
        int amount;
        while (true) {
            try {
                amount = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("phai nhap so!!");
            }
        }

        System.out.print("Nhap nha san xuat: ");
        String productName = SCANNER.nextLine();

        System.out.print("Nhap quoc gia xach tay: ");
        String countryName;
        while (true){
            try {
                countryName = MenuUtil.getName();
                if (countryName.matches("(^Viet Nam)")){
                    throw new Exception("Quoc gia xach tay khong duoc la Viet Nam");
                }break;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhap trang thai");
        String status = MenuUtil.getStatus();

        list.add(new CellPhone(id, name, price, amount, productName, countryName, status));
        ReadWritePhone.writePhone(PATH, list);
        System.out.println("THEM MOI THANH CONG");
    }

    @Override
    public void remove() {

        List<Phone> list = ReadWritePhone.readFiles(PATH);
        boolean isFlag = false;
        int id;
        do {
            System.out.print("Nhap id can xoa: ");
            id = Integer.parseInt(SCANNER.nextLine());

            for (Phone phone : list) {
                if (phone.getId() == id) {
                    System.out.println("Tai khoan can xoa");
                    System.out.println(phone);
                    System.out.println("Ban co chac muon xoa khong ?\n" +
                            "1. Co\n" +
                            "2. Khong");
                    int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
                    if (chooseYesNo == 1) {
                        list.remove(phone);

                        ReadWritePhone.writePhone(PATH, list);

                        System.out.println("XOA THANH CONG");

                    }
                    isFlag = true;
                    break;
                }
            }
            try {
                if (!isFlag) {
                    throw new NotFoundPhoneAccountException("Tai khoan khong ton tai");
                }
            } catch (NotFoundPhoneAccountException e) {
                System.out.println(e.getMessage());
            }
        } while (!isFlag);
    }

    @Override
    public void find() {
        List<Phone> list = ReadWritePhone.readFiles(PATH);
        System.out.println("Nhap id hoac ma ten dien thoai can tim kiem!!");
        String find = SCANNER.nextLine();
        boolean isFlag = false;

        for (Phone phone : list) {
            if (phone.getName().contains(find) || Integer.toString(phone.getId()).contains(find)) {
                System.out.println(phone);
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println("Khong tim thay!!");
        }
    }

    @Override
    public void display() {
        List<Phone> phoneList = ReadWritePhone.readFiles(PATH);
        for (Phone phone : phoneList) {
            System.out.println(phone);
        }
    }
}
