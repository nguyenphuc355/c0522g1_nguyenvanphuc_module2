package ss12_java_collection_frame_work.overtime_2.service.impl;

import ss12_java_collection_frame_work.overtime_2.exception.NotFoundPhoneAccountException;
import ss12_java_collection_frame_work.overtime_2.model.CellPhone;
import ss12_java_collection_frame_work.overtime_2.model.Phone;
import ss12_java_collection_frame_work.overtime_2.service.IGenuinePhoneService;
import ss12_java_collection_frame_work.overtime_2.utils.MenuUtil;
import ss12_java_collection_frame_work.overtime_2.utils.ReadWritePhone;

import java.util.List;
import java.util.Scanner;

public class GenuinePhoneService implements IGenuinePhoneService {
    private static final String PATH = "vanphuc/src/ss12_java_collection_frame_work.case_study_3/data/genuine_phone.csv";
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void add() {
        List<Phone> list = ReadWritePhone.readFiles(PATH);
        int id = list.get(list.size() - 1).getId() + 1;

        System.out.print("Nhap ten dien thoai: ");
        String name = SCANNER.nextLine();

        System.out.print("Nhap gia ban: ");
        int price;
        while (true){
            try {
                price = Integer.parseInt(SCANNER.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Phai nhap so!!!");
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

        System.out.print("Nhap thoi gian bao hanh (so ngay): ");
        String warrantyPeriod = SCANNER.nextLine();

        System.out.print("Nhap pham vi bao hanh");
        String warrantyCoverage = MenuUtil.getRange();

        list.add(new CellPhone(id, name, price, amount, productName, warrantyPeriod, warrantyCoverage));
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
                if (phone.getId()==id) {
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
            if (phone.getName().contains(find)||Integer.toString(phone.getId()).contains(find)) {
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
