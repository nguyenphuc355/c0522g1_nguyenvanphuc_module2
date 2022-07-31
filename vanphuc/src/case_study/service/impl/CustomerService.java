package case_study.service.impl;

import case_study.model.Customer;
import case_study.service.ICustomerService;
import case_study.utils.FormatName;
import case_study.utils.MenuUtil;
import case_study.utils.ReadCustomer;
import case_study.utils.WriteCustomer;
import ss17_binary_file.exercise.product.exception.DuplicateIDException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CustomerService implements ICustomerService {
    public static final String PATH = "vanphuc/src/case_study/customer.csv";
    private static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    private void writeCustomer() {
        WriteCustomer.writeCustomerFile(PATH, CUSTOMER_LIST);

    }

    public void readCustomer() {
        List<Customer> list = ReadCustomer.readCustomerList(PATH);
        CUSTOMER_LIST.clear();
        CUSTOMER_LIST.addAll(list);
    }


    @Override
    public void display() {
        readCustomer();
        for (Customer customer : CUSTOMER_LIST) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        readCustomer();
        Customer customer = infoCustomer();
        CUSTOMER_LIST.add(customer);
        System.out.println("them moi thanh cong");
        writeCustomer();
    }

    @Override
    public void edit() {
        readCustomer();
        System.out.print("Nhap ma khach hang can sua: ");
        String codeEdit = SCANNER.nextLine();

        for (Customer customer : CUSTOMER_LIST) {
            if (codeEdit.equals(customer.getCode())) {
                System.out.print("Nhap ngay sinh: ");
                customer.setDateOfBirth(MenuUtil.getDateOfBirth());

                customer.setGender(MenuUtil.getGender());

                System.out.print("Nhap ho va ten: ");
                customer.setName(FormatName.getName());

                System.out.print("Nhap so dien thoai: ");
                customer.setPhoneNumber(MenuUtil.getPhone());

                System.out.print("Nhap email: ");
                customer.setEmail(SCANNER.nextLine());

                System.out.print("Nhap so CCCD: ");
                customer.setId(Integer.parseInt(SCANNER.nextLine()));

                customer.setTypeOfGuest(MenuUtil.customerType());

                System.out.print("Nhap dia chi khach hang: ");
                customer.setAddress(FormatName.getName());

                writeCustomer();
            }
        }
    }

    public static Customer infoCustomer() {
        System.out.print("Nhap ma khach hang: ");
        String customerCode;
        while (true) {
            try {
                customerCode = SCANNER.nextLine();
                for (Customer customer : CUSTOMER_LIST) {
                    if (customer.getCode().equals(customerCode)) {
                        throw new DuplicateIDException("bi trung, moi nhap lai");
                    }
                }
                break;
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhap ngay sinh: ");
        String dateOfBirth = MenuUtil.getDateOfBirth();

        System.out.print("NHap gioi tinh: ");
        String gender = MenuUtil.getGender();

        System.out.print("Ho va ten: ");
        String name = FormatName.getName();

        System.out.print("Nhap so dien thoai: ");
        String phoneNumber;
        while (true) {
            try {
                phoneNumber = SCANNER.nextLine();
                for (Customer customer : CUSTOMER_LIST) {
                    if (customer.getPhoneNumber().equals(phoneNumber)) {
                        throw new DuplicateIDException("so dien thoai da co, nhap lai");
                    }
                }
                break;
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhap email: ");
        String email = SCANNER.nextLine();

        System.out.print("Nhap so CCCD: ");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(SCANNER.nextLine());
                for (Customer customer : CUSTOMER_LIST) {
                    if (customer.getId() == id) {
                        throw new DuplicateIDException("CCCD da co, nhap lai!!!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("phai nhap so");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        String customerType = MenuUtil.customerType();
        System.out.print("Nhap dia chi khach hang: ");
        String address = FormatName.getName();

        return new Customer(customerCode, dateOfBirth, gender, name, phoneNumber, email, id, customerType, address);
    }

}