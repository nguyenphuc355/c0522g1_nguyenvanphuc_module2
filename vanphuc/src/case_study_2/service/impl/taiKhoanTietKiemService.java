package case_study_2.service.impl;

import case_study.exception.AgeInvalidException;
import case_study_2.exception.NotFoundBankAccountException;
import case_study_2.model.TaiKhoanNganHang;
import case_study_2.model.TaiKhoanTietKiem;
import case_study_2.service.ITaiKhoanTietKiemService;
import case_study_2.utils.ReadWriteFile;

import java.util.List;
import java.util.Scanner;

public class taiKhoanTietKiemService implements ITaiKhoanTietKiemService {
    public static final String PATH = "vanphuc/src/case_study_2/data/taikhoantietkiem.csv";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getName() {
        String serviceName = SCANNER.nextLine();
        String[] arr = serviceName.toLowerCase().trim().split("");
        StringBuilder str = new StringBuilder().append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    str.append(arr[i].toUpperCase());
                } else {
                    str.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                str.append(arr[i]);
            }
        }
        return str.toString();
    }

    @Override
    public void add() {
        List<TaiKhoanNganHang> list = ReadWriteFile.readFiles(PATH);
        int id = list.get(list.size() - 1).getIdTaiKhoan() + 1;

        System.out.print("Nhap ma tai khoan: ");
        String maTaiKhoan = SCANNER.nextLine();

        System.out.print("Nhap ten chu tai khoan: ");
        String name = getName();

        System.out.print("Nhap ngay tao tai khoan: ");
        String date;
        while (true) {
            try {
                date = SCANNER.nextLine();
                if (!date.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19\\d{2}|20[01]\\d)")) {
                    throw new AgeInvalidException("Nhap dung dinh dang dd/mm/yyyy");
                }
                break;
            } catch (AgeInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhap so tien gui tiet kiem: ");
        int money = Integer.parseInt(SCANNER.nextLine());

        System.out.print("Nhap ngay gui tiet kiem: ");
        String dateSent;
        while (true) {
            try {
                dateSent = SCANNER.nextLine();
                if (!dateSent.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19\\d{2}|20[01]\\d)")) {
                    throw new AgeInvalidException("Nhap dung dinh dang dd/mm/yyyy");
                }
                break;
            } catch (AgeInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhap lai suat ( %/1 nam )");
        int laiSuat = Integer.parseInt(SCANNER.nextLine());

        System.out.print("nhap ki han: ");
        String kihan = SCANNER.nextLine();

        list.add(new TaiKhoanTietKiem(id, maTaiKhoan, name, date, money, dateSent, laiSuat, kihan));
        ReadWriteFile.writeTaiKhoan(PATH, list);
        System.out.println("THEM MOI THANH CONG");
    }

    @Override
    public void remove() {
        List<TaiKhoanNganHang> list = ReadWriteFile.readFiles(PATH);
        boolean isFlag = false;
        String code;
        do {
            System.out.print("Nhap ma tai khoan can xoa: ");
            code = SCANNER.nextLine();

            for (TaiKhoanNganHang taiKhoanNganHang : list) {
                if (code.equals(taiKhoanNganHang.getMaTaiKhoan())) {
                    System.out.println("Tai khoan can xoa");
                    System.out.println(taiKhoanNganHang);
                    System.out.println("Ban co chac muon xoa khong ?\n" +
                            "1. Co\n" +
                            "2. Khong");
                    int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
                    if (chooseYesNo == 1) {
                        list.remove(taiKhoanNganHang);

                        ReadWriteFile.writeTaiKhoan(PATH, list);

                        System.out.println("XOA THANH CONG");

                    }
                    isFlag = true;
                    break;
                }
            }
            try {
                if (!isFlag) {
                    throw new NotFoundBankAccountException("Tai khoan khong ton tai");
                }
            } catch (NotFoundBankAccountException e) {
                System.out.println(e.getMessage());
            }
        } while (!isFlag);
    }


    @Override
    public void find() {
        List<TaiKhoanNganHang> list = ReadWriteFile.readFiles(PATH);
        System.out.println("Nhap chu ten tai khoan hoac ma tai khoan can tim kiem!!");
        String find = SCANNER.nextLine();
        boolean isFlag = false;

        for (TaiKhoanNganHang taiKhoanNganHang: list){
            if (taiKhoanNganHang.getTenChuTaiKhoan().contains(find) || taiKhoanNganHang.getMaTaiKhoan().contains(find)){
                System.out.println(taiKhoanNganHang);
                isFlag = true;
            }
        }
        if (!isFlag){
            System.out.println("Khong tim thay!!");
        }
    }

    @Override
    public void display() {
        List<TaiKhoanNganHang> taiKhoanNganHangList = ReadWriteFile.readFiles(PATH);
        for (TaiKhoanNganHang taiKhoanNganHang : taiKhoanNganHangList) {
                System.out.println(taiKhoanNganHang);
        }
    }
}