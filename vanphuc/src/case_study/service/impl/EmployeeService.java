package case_study.service.impl;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.service.IEmployeeService;
import case_study.utils.ReadFileEmployee;
import case_study.utils.WriteFileEmployee;
import ss17_binary_file.exercise.product.exception.DuplicateIDException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static final String PATH = "vanphuc/src/case_study/employee.csv";
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private void writeEmployee() {
        WriteFileEmployee.writeFile(PATH, employeeList);
    }

    public void readEmployee() {
        List<Employee> list = ReadFileEmployee.readEmployees(PATH);
        employeeList.clear();
        employeeList.addAll(list);
    }

    @Override
    public void display() {
        readEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        readEmployee();
        Employee employee = infoEmployee();
        employeeList.add(employee);
        System.out.println("nhap thanh cong");
        writeEmployee();
    }

    @Override
    public void edit() {
        readEmployee();
        System.out.print("nhap ma nhan vien can sua: ");
        String codeEdit = scanner.nextLine();

        for (Employee employee : employeeList) {
            if (codeEdit.equals(employee.getCode())) {
                System.out.print("Nhap ngay sinh: ");
                employee.setDateOfBirth(scanner.nextLine());

                System.out.print("Nhap gioi tinh: ");
                employee.setGender(scanner.nextLine());

                System.out.print("nhap ho va ten:");
                employee.setName(scanner.nextLine());

                System.out.print("Nhap so dien thoai: ");
                employee.setPhoneNumber(Integer.parseInt(scanner.nextLine()));

                System.out.print("Nhap email: ");
                employee.setEmail(scanner.nextLine());

                System.out.print("nhap so CCCD: ");
                employee.setId(Integer.parseInt(scanner.nextLine()));

//                System.out.print("nhap trinh do: ");
//                Employee employees = new Employee();
                int choose;
                do {
                    System.out.println("===TRINH DO===\n" +
                            "1. Trung cap\n" +
                            "2. Cao dang\n" +
                            "3. Dai Hoc\n" +
                            "4.Sau dai hoc");

                    choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            employee.setLevel("Trung cap");
                            break;
                        case 2:
                            employee.setLevel("Cao dang");
                            break;
                        case 3:
                            employee.setLevel("Dai hoc");
                            break;
                        case 4:
                            employee.setLevel("Sau dai hoc");
                            break;
                    }
                } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);

                System.out.print(" nhap chuc vu: ");
                employee.setLocation(scanner.nextLine());

                System.out.print("nhap luong: ");
                employee.setWage(Integer.parseInt(scanner.nextLine()));

                writeEmployee();
            }
        }
        System.out.println("====EDIT OK====");
    }


    public static Employee infoEmployee() {
        System.out.print("Nhap ma nhan vien: ");
        String code;
        while (true) {
            try {
                code = scanner.nextLine();
                for (Employee employee : employeeList) {
                    if (employee.getCode().equals(code)) {
                        throw new DuplicateIDException("Ma nhan vien da co, nhap lai!!");
                    }
                }
                break;
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhap ngay sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();

        System.out.print("nhap ho va ten:");
        String name = scanner.nextLine();

        System.out.print("Nhap so dien thoai: ");
        int phone;
        while (true) {
            try {


                phone = Integer.parseInt(scanner.nextLine());
                for (Employee employee : employeeList) {
                    if (employee.getPhoneNumber() == phone) {
                        throw new DuplicateIDException("So dien thoai da co, vui long nhap lai");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("phai nhap so");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhap email: ");
        String email = scanner.nextLine();

        System.out.print("nhap so CCCD: ");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                for (Employee employee : employeeList) {
                    if (employee.getId() == id) {
                        throw new DuplicateIDException("id da co, moi nhap lai");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("phai nhap so");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        Employee employees = new Employee();
        int choose;
        do {
            System.out.println("===TRINH DO===\n" +
                    "1. Trung cap\n" +
                    "2. Cao dang\n" +
                    "3. Dai Hoc\n" +
                    "4.Sau dai hoc");

            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employees.setLevel("Trung cap");
                    break;
                case 2:
                    employees.setLevel("Cao dang");
                    break;
                case 3:
                    employees.setLevel("Dai hoc");
                    break;
                case 4:
                    employees.setLevel("Sau dai hoc");
                    break;
            }
        } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);

        System.out.print(" nhap chuc vu: ");
        String location = scanner.nextLine();

        System.out.print("nhap luong: ");
        int wage;
        while (true) {
            try {
                wage = Integer.parseInt(scanner.nextLine());
                for (Employee employee : employeeList) {
                    if (employee.getWage() == wage) {
                        throw new NumberFormatException("phai nhap so");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        return new Employee(code, dateOfBirth, gender, name, phone, email, id, employees.getLevel(), location, wage);
    }

}
