package case_study.service.impl;

import case_study.exception.*;
import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.service.IFacilityService;
import case_study.utils.FormatName;
import case_study.utils.MenuUtil;
import case_study.utils.ReadWriteFacility;
import ss17_binary_file.exercise.product.exception.DuplicateIDException;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static final String PATH_VILLA = "vanphuc/src/case_study/data/villa.csv";
    private static final String PATH_HOUSE = "vanphuc/src/case_study/data/house.csv";
    private static final String PATH_ROOM = "vanphuc/src/case_study/data/room.csv";
    private static final Scanner SCANNER = new Scanner(System.in);


    public void addVilla() {
        Map<Facility, Integer> villaList = ReadWriteFacility.readFacilities(PATH_VILLA);
        String serviceId;
        while (true) {
            try {
                System.out.print("Nhap ma dich vu: ");
                serviceId = SCANNER.nextLine();

                if (!serviceId.matches("^SVVL-\\d{4}$")) {
                    throw new ServiceFormatException("ma dich vu khong hop le, vui nhap theo dinh dang SVVL-YYYY (voi Y la so tu 0-9)!");
                }

                for (Facility villa : villaList.keySet()) {
                    if (serviceId.equals(villa.getServiceId())) {
                        throw new DuplicateIDException("Ma dich vu da ton tai, vui long nhap lai!!");
                    }
                }
                break;
            } catch (ServiceFormatException | DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        String name;
        while (true) {
            try {
                System.out.print("Nhap ten dich vu");
                name = SCANNER.nextLine();
                if (!name.matches("[A-z][a-z]+")) {
                    throw new ServiceFormatException("Nhap sai dinh dang 'Aabcd',vui long nhap lai");
                }
                break;
            } catch (ServiceFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        double area;
        while (true) {
            try {
                System.out.print("Nhap dien tich su dung: ");
                area = Double.parseDouble(SCANNER.nextLine());
                if (area < 30) {
                    throw new AreaInvalidException("Dien tich su dung phai > 30m2");
                }
                break;
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so!!");
            }
        }


        System.out.print("Nhap chi phi thue: ");
        int rentalCosts;
        while (true) {
            try {
                rentalCosts = Integer.parseInt(SCANNER.nextLine());
                if (rentalCosts < 0) {
                    throw new NumberIsLessThanZeroException("Chi phi phai > 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!!");
            } catch (NumberIsLessThanZeroException e) {
                System.out.println(e.getMessage());
            }
        }

        int maxPeople;
        while (true) {
            try {
                System.out.print("Nhap so nguoi toi da: ");
                maxPeople = Integer.parseInt(SCANNER.nextLine());
                if (maxPeople <= 0 || maxPeople > 20) {
                    throw new ServiceException("So nguoi toi da <= 20 nguoi");
                }
                break;
            } catch (ServiceException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so!!");
            }
        }

        System.out.print("Nhap kieu thue: ");
        String rentalType = FormatName.getName();

        System.out.print("Nhap tieu chuan phong: ");
        String roomStandard = MenuUtil.getRoomStandard();

        System.out.print("Nhap dien tich ho boi: ");
        int swimmingPoolArea;
        while (true) {
            try {
                swimmingPoolArea = Integer.parseInt(SCANNER.nextLine());
                if (swimmingPoolArea < 30) {
                    throw new AreaInvalidException("Dien tich su dung phai lon > 30m2");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so!!");
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhap so tang: ");
        int numberOfFloors;
        while (true) {
            try {
                numberOfFloors = Integer.parseInt(SCANNER.nextLine());
                if (numberOfFloors < 0) {
                    throw new NumberIsLessThanZeroException("So tang phai > 0, moi nhap lai");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so!!");
            } catch (NumberIsLessThanZeroException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("====NHAP THANH CONG====");

        villaList.put(new Villa(serviceId, name, area, rentalCosts, maxPeople, rentalType, roomStandard, swimmingPoolArea, numberOfFloors), 0);

        ReadWriteFacility.writeFileFacility(PATH_VILLA, villaList);
    }

    @Override
    public void addHouse() {
        Map<Facility, Integer> houseList = ReadWriteFacility.readFacilities(PATH_HOUSE);
        String serviceId;
        while (true) {
            try {
                System.out.print("Nhap ma dich vu: ");
                serviceId = SCANNER.nextLine();

                if (!serviceId.matches("^SVHO-\\d{4}$")) {
                    throw new ServiceFormatException("ma dich vu khong hop le, vui nhap theo dinh dang SVVL-YYYY (voi Y la so tu 0-9)!");
                }

                for (Facility villa : houseList.keySet()) {
                    if (serviceId.equals(villa.getServiceId())) {
                        throw new DuplicateIDException("Ma dich vu da ton tai, vui long nhap lai!!");
                    }
                }
                break;
            } catch (ServiceFormatException | DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        String name;
        while (true) {
            try {
                System.out.print("Nhap ten dich vu");
                name = SCANNER.nextLine();
                if (!name.matches("[A-z][a-z]+")) {
                    throw new ServiceFormatException("Nhap sai dinh dang 'Aabcd',vui long nhap lai");
                }
                break;
            } catch (ServiceFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        double area;
        while (true) {
            try {
                System.out.print("Nhap dien tich su dung: ");
                area = Double.parseDouble(SCANNER.nextLine());
                if (area < 30) {
                    throw new AreaInvalidException("Dien tich su dung phai > 30m2");
                }
                break;
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so!!");
            }
        }


        System.out.print("Nhap chi phi thue: ");
        int rentalCosts;
        while (true) {
            try {
                rentalCosts = Integer.parseInt(SCANNER.nextLine());
                if (rentalCosts < 0) {
                    throw new NumberIsLessThanZeroException("Chi phi phai > 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!!");
            } catch (NumberIsLessThanZeroException e) {
                System.out.println(e.getMessage());
            }
        }
        int maxPeople;
        while (true) {
            try {
                System.out.print("Nhap so nguoi toi da: ");
                maxPeople = Integer.parseInt(SCANNER.nextLine());
                if (maxPeople <= 0 || maxPeople > 20) {
                    throw new ServiceException("So nguoi toi da <= 20 nguoi");
                }
                break;
            } catch (ServiceException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so!!");
            }
        }

        System.out.print("Nhap kieu thue: ");
        String rentalType = FormatName.getName();

        System.out.print("Nhap tieu chuan phong: ");
        String roomStandard = MenuUtil.getRoomStandard();


        System.out.print("Nhap so tang: ");
        int numberOfFloors;
        while (true) {
            try {
                numberOfFloors = Integer.parseInt(SCANNER.nextLine());
                if (numberOfFloors < 0) {
                    throw new NumberIsLessThanZeroException("So tang phai > 0, moi nhap lai");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so!!");
            } catch (NumberIsLessThanZeroException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("====NHAP THANH CONG====");

        houseList.put(new House(serviceId, name, area, rentalCosts, maxPeople, rentalType, roomStandard, numberOfFloors), 0);

        ReadWriteFacility.writeFileFacility(PATH_HOUSE, houseList);
    }

    @Override
    public void addRoom() {
        Map<Facility, Integer> roomList = ReadWriteFacility.readFacilities(PATH_ROOM);
        String serviceId;
        while (true) {
            try {
                System.out.print("Nhap ma dich vu: ");
                serviceId = SCANNER.nextLine();

                if (!serviceId.matches("^SVRO-\\d{4}$")) {
                    throw new ServiceFormatException("ma dich vu khong hop le, vui nhap theo dinh dang " +
                            "SVVL-YYYY (voi Y la so tu 0-9)!");
                }

                for (Facility villa : roomList.keySet()) {
                    if (serviceId.equals(villa.getServiceId())) {
                        throw new DuplicateIDException("Ma dich vu da ton tai, vui long nhap lai!!");
                    }
                }
                break;
            } catch (ServiceFormatException | DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhap ten dich vu: ");
        String name;
        while (true) {
            try {
                name = SCANNER.nextLine();
                if (!name.matches("[A-z][a-z]+")) {
                    throw new ServiceFormatException("Nhap sai dinh dang 'Aabcd',vui long nhap lai");
                }
                break;
            } catch (ServiceFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        double area;
        while (true) {
            try {
                System.out.print("Nhap dien tich su dung: ");
                area = Double.parseDouble(SCANNER.nextLine());
                if (area < 30) {
                    throw new AreaInvalidException("Dien tich su dung phai > 30m2");
                }
                break;
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so!!");
            }
        }


        System.out.print("Nhap chi phi thue: ");
        int rentalCosts;
        while (true) {
            try {
                rentalCosts = Integer.parseInt(SCANNER.nextLine());
                if (rentalCosts < 0) {
                    throw new NumberIsLessThanZeroException("Chi phi phai > 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!!");
            } catch (NumberIsLessThanZeroException e) {
                System.out.println(e.getMessage());
            }
        }
        int maxPeople;
        while (true) {
            try {
                System.out.print("Nhap so nguoi toi da: ");
                maxPeople = Integer.parseInt(SCANNER.nextLine());
                if (maxPeople <= 0 || maxPeople > 20) {
                    throw new ServiceException("So nguoi toi da <= 20 nguoi");
                }
                break;
            } catch (ServiceException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so!!");
            }
        }

        System.out.print("Nhap kieu thue: ");
        String rentalType = FormatName.getName();

        System.out.print("Nhap dich vu mien phi di kem!!");
        String freeService = SCANNER.nextLine();

        System.out.println("====NHAP THANH CONG====");

        roomList.put(new Room(serviceId, name, area, rentalCosts, maxPeople, rentalType, freeService), 0);
        ReadWriteFacility.writeFileFacility(PATH_ROOM, roomList);
    }

    @Override
    public void display() {
        System.out.println("-----------------------------DISPLAY VILLA-----------------------------------------------");
        Map<Facility, Integer> villaList = ReadWriteFacility.readFacilities(PATH_VILLA);
        for (Facility villa : villaList.keySet()) {
            System.out.println(villa + "-So lan su dung: " + villaList.get(villa));
        }


        System.out.println("\n---------------------------DISPLAY HOUSE-----------------------------------------------");
        Map<Facility, Integer> houseList = ReadWriteFacility.readFacilities(PATH_HOUSE);
        for (Facility house : houseList.keySet()) {
            System.out.println(house + "-So lan su dung: " + houseList.get(house));
        }


        System.out.println("\n---------------------------DISPLAY ROOM------------------------------------------------");
        Map<Facility, Integer> roomList = ReadWriteFacility.readFacilities(PATH_ROOM);
        for (Facility room : roomList.keySet()) {
            System.out.println(room + "-So lan su dung: " + roomList.get(room));
        }
    }

    @Override
    public void displayMaintenance() {
        System.out.println("-----------------------------DISPLAY MAINTENANCE VILLA-----------------------------------");
        Map<Facility, Integer> villaList = ReadWriteFacility.readFacilities(PATH_VILLA);
        for (Facility villa : villaList.keySet()) {
            if (villaList.get(villa) >= 5) {
                System.out.println("%s,%s" + villa + " so lan su dung: " + villaList.get(villa));
            }
        }


        System.out.println("-----------------------------DISPLAY MAINTENANCE HOUSE-----------------------------------");
        Map<Facility, Integer> houseList = ReadWriteFacility.readFacilities(PATH_HOUSE);
        for (Facility house : houseList.keySet()) {
            if (houseList.get(house) >= 5) {
                System.out.println("%s,%s" + house + " so lan su dung: " + houseList.get(house));
            }
        }

        System.out.println("-----------------------------DISPLAY MAINTENANCE ROOM----------------------------------------");
        Map<Facility, Integer> roomList = ReadWriteFacility.readFacilities(PATH_ROOM);
        for (Facility room : roomList.keySet()) {
            if (roomList.get(room) >= 5) {
                System.out.println("%s,%s" + room + " so lan su dung: " + roomList.get(room));
            }
        }
    }
}