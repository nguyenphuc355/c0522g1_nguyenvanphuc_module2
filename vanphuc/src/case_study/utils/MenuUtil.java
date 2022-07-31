package case_study.utils;

import case_study.exception.AgeInvalidException;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class MenuUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getLevel() {
        int choose = 0;
        do {
            System.out.println("===TRINH DO===\n" +
                    "1. Trung cap\n" +
                    "2. Cao dang\n" +
                    "3. Dai Hoc\n" +
                    "4.Sau dai hoc");
            try {
                choose = Integer.parseInt(SCANNER.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so!!");
            }

            switch (choose) {
                case 1:
                    return "Trung cap";
                case 2:
                    return "Cao dang";

                case 3:
                    return "Dai hoc";

                case 4:
                    return "Sau dai hoc";
                default:
                    System.out.println("lua chon khong ton tai, nhap lai");

            }
        } while (true);
    }

    public static String getGender() {
        int choose;
        do {
            System.out.println("====GIOI TINH====\n" +
                    "1. Nam\n" +
                    "2. Nu\n" +
                    "3. Gioi tinh khac");
            System.out.print("Moi nhap lua chon: ");
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
                switch (choose) {
                    case 1:
                        return "Nam";
                    case 2:
                        return "Nu";
                    case 3:
                        return "Gioi tinh khac";
                    default:
                        System.out.println("lua chon sai,vui long nhap lai");
                }
            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so!!");
            }
        } while (true);
    }

    private static boolean isLeapYear(int year) {
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && !isDivisible100) || isDivisible400;
    }

    public static String getDateOfBirth() {
        String dateOfBirth;
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        double age;
        while (true) {
            try {

                dateOfBirth = SCANNER.nextLine();
                if (!dateOfBirth.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19\\d{2}|20[01]\\d)")) {
                    throw new AgeInvalidException("Nhap dung dinh dang dd/mm/yyyy!");
                }

                String[] str = dateOfBirth.split("/");
                if (str[1].equals("04") || str[1].equals("06") || str[1].equals("09") || str[1].equals("11")) {
                    if (Integer.parseInt(str[0]) > 30) {
                        throw new AgeInvalidException("vui long nhap dung so ngay trong thang (thang nay co toi da 30 ngay)!");
                    }
                } else if (str[1].equals("02")) {
                    if (isLeapYear(Integer.parseInt(str[2]))) {
                        if (Integer.parseInt(str[0]) > 29) {
                            throw new AgeInvalidException("vui long nhap dung so ngay trong thang (thang 2 co toi đa 29 ngày vi la nam nhuan)!");
                        }
                    } else {
                        if (Integer.parseInt(str[0]) > 28) {
                            throw new AgeInvalidException("vui long nhap dung so ngay trong thang (thang 2 co toi da 20 ngay)!");
                        }
                    }
                }

                age = (double) (date.getTime() - dateFormat.parse(dateOfBirth).getTime()) / 315576E5;
                if (age < 18 || age > 100) {
                    throw new AgeInvalidException("Ngay sinh phai nho hon ngay hien tai 18 nam va nguoi dung khong đuoc qua 100 tuoi!");
                }

                return dateOfBirth;

            } catch (AgeInvalidException e) {
                System.out.println(e.getMessage());
            } catch (ParseException e) {
                e.getStackTrace();
            }
        }
    }

    public static String getPhone() {
        String phone;
        while (true) {
            phone = SCANNER.nextLine();
            if (phone.matches("[0]\\d{9}")) {
                break;
            } else {
                System.out.println("Phai nhap dung dinh dang 0x (x gom 9 chu so)");
            }
        }
        return phone;
    }

    public static String getLocation() {
        int choose;
        do {
            System.out.println("====CHUC VU====\n" +
                    "1. Le tan\n" +
                    "2. Phuc vu\n" +
                    "3. Chuyen vien\n" +
                    "4. Giam sat\n" +
                    "5. Quan ly\n" +
                    "6. Giam doc");
            System.out.print("Moi nhap lua chon: ");
            choose = Integer.parseInt(SCANNER.nextLine());
            switch (choose) {
                case 1:
                    return "Le tan";

                case 2:
                    return "Phuc vu";

                case 3:
                    return "Chuyen vien";

                case 4:
                    return "Giam sat";

                case 5:
                    return "Quan ly";

                case 6:
                    return "Giam doc";

                default:
                    System.out.println("lua chon khong hop le, moi nhap lai!");
            }
        } while (true);
    }

    public static String customerType() {
        int choose;
        do {
            System.out.println("====KIEU KHACH====\n" +
                    "1. Diamond\n" +
                    "2. Platinium\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member");
            System.out.print("Moi nhap lua chon: ");
            choose = Integer.parseInt(SCANNER.nextLine());
            switch (choose) {
                case 1:
                    return "Diamond";

                case 2:
                    return "Platinium";

                case 3:
                    return "Gold";

                case 4:
                    return "Silver";

                case 5:
                    return "Member";

                default:
                    System.out.println("Lua chon khong hop le, moi nhap lai");
            }
        } while (true);
    }

    public static String getRoomStandard() {
        int choose = 0;
        do {
            System.out.println("======TIEU CHUAN PHONG======\n" +
                    "1. Binh dan\n" +
                    "2. 3 sao\n" +
                    "3. 4 sao\n" +
                    "4. 5 sao");
            System.out.print("Moi nhap lua chon: ");
            try {
                choose = Integer.parseInt(SCANNER.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("phai nhap so");
            }

            switch (choose) {
                case 1:
                    return "Binh dan";
                case 2:
                    return "3 sao";
                case 3:
                    return "4 sao";
                case 4:
                    return "5 sao";
                default:
                    System.out.println("lua chon khong hop le, nhap lai!!");
            }
        } while (true);
    }
}
