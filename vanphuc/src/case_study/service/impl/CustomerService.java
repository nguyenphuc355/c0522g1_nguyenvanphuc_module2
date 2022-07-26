package case_study.service.impl;

import case_study.model.Customer;
import case_study.service.ICustomerService;
import case_study.utils.ReadCustomer;
import case_study.utils.WriteCustomer;
import ss17_binary_file.exercise.product.exception.DuplicateIDException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CustomerService implements ICustomerService {
    public static final String PATH = "vanphuc/src/case_study/customer.csv";
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private void writeCustomer() {
        WriteCustomer.writeCustomerFile(PATH, customerList);

    }

    public void readCustomer() {
        List<Customer> list = ReadCustomer.readCustomerList(PATH);
        customerList.clear();
        customerList.addAll(list);
    }

    @Override
    public void display() {
        readCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {

    }

//    public static Customer infoCustomer() {
//        System.out.print("Nhap ma khach hang: ");
//        String customerCode = scanner.nextLine();
//
//        System.out.print("Nhap ngay sinh: ");
//        String dateOfBirth = scanner.nextLine();
//
//        System.out.print("NHap gioi tinh: ");
//        String gender = scanner.nextLine();
//
//        System.out.print("Ho va ten: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Nhap so dien thoai: ");
//        int phoneNumber;
//        while (true){
//            try {
//                phoneNumber = Integer.parseInt(scanner.nextLine());
//                for (Customer customer : customerList){
//                    if (customer.getPhoneNumber()==phoneNumber){
//                        throw new DuplicateIDException("so dien thoai da co, nhap lai");
//                    }
//                }
//                break;
//            }catch (NumberFormatException e){
//                System.out.println("phia nhap so");
//            }catch (DuplicateIDException e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//        System.out.print("Nhap email: ");
//        String email = scanner.nextLine();

//        System.out.print("Nhap so CCCD: ");
//        int id;
//        while (true){
//            try {
//                id = Integer.parseInt(scanner.nextLine());
//                for (Customer customer : customerList){
//                    if (customer.getId() == id){
//                        throw new DuplicateIDException("CCCD da co, nhap lai!!!");
//                    }
//                }
//                break;
//            }catch (NumberFormatException e){
//                System.out.println("phai nhap so");
//            }catch (DuplicateIDException e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//       Customer customer = new Customer();
//        int choose;
//        do {
//            System.out.println("====KIEU KHACH====\n" +
//                    "1. Diamond\n" +
//                    "2. Platinium\n" +
//                    "3. Gold\n" +
//                    "4. Silver\n" +
//                    "5. Member");
//
 //      }
    }

