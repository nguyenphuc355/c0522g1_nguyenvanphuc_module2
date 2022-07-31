package case_study.service.impl;


import case_study.model.Employee;
import case_study.service.IEmployeeService;
import case_study.utils.FormatName;
import case_study.utils.MenuUtil;
import case_study.utils.ReadFileEmployee;
import case_study.utils.WriteFileEmployee;
import ss17_binary_file.exercise.product.exception.DuplicateIDException;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static final String PATH = "vanphuc/src/case_study/employee.csv";
    private static final List<Employee> EMPLOYEE_LIST = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);


    public void readEmployee() {
        List<Employee> list = ReadFileEmployee.readEmployees(PATH);
        EMPLOYEE_LIST.clear();
        EMPLOYEE_LIST.addAll(list);
    }

    private void writeEmployee() {
        WriteFileEmployee.writeFile(PATH, EMPLOYEE_LIST);
    }



    @Override
    public void display() {
        readEmployee();
        for (Employee employee : EMPLOYEE_LIST) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        readEmployee();
        Employee employee = infoEmployee();
        EMPLOYEE_LIST.add(employee);
        System.out.println("nhap thanh cong");
        writeEmployee();
    }

    @Override
    public void edit() {
        readEmployee();
        System.out.print("nhap ma nhan vien can sua: ");
        String codeEdit = SCANNER.nextLine();

        for (Employee employee : EMPLOYEE_LIST) {
            if (codeEdit.equals(employee.getCode())) {

                System.out.print("Nhap ngay sinh: ");
                employee.setDateOfBirth(MenuUtil.getDateOfBirth());

                employee.setGender(MenuUtil.getGender());

                System.out.print("nhap ho va ten:");
                employee.setName(FormatName.getName());

                System.out.print("Nhap so dien thoai: ");
                employee.setPhoneNumber(MenuUtil.getPhone());

                System.out.print("Nhap email: ");
                employee.setEmail(SCANNER.nextLine());

                System.out.print("nhap so CCCD: ");
                employee.setId(Integer.parseInt(SCANNER.nextLine()));

                employee.setLevel(MenuUtil.getLevel());

                employee.setLocation(MenuUtil.getLocation());

                System.out.print("nhap luong: ");
                employee.setWage(Integer.parseInt(SCANNER.nextLine()));

                writeEmployee();
            }
        }
        System.out.println("====CHINH SUA THANH CONG====");
    }


    public static Employee infoEmployee() {
        System.out.print("Nhap ma nhan vien: ");
        String code;
        while (true) {
            try {
                code = SCANNER.nextLine();
                for (Employee employee : EMPLOYEE_LIST) {
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
        String dateOfBirth = MenuUtil.getDateOfBirth();

        System.out.print("Nhap gioi tinh: ");
        String gender = MenuUtil.getGender();

        System.out.print("nhap ho va ten:");
        String name = FormatName.getName();

        System.out.print("Nhap so dien thoai: ");
        String phone = MenuUtil.getPhone();

        System.out.print("Nhap email: ");
        String email = SCANNER.nextLine();

        System.out.print("nhap so CCCD: ");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(SCANNER.nextLine());
                for (Employee employee : EMPLOYEE_LIST) {
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

        String level = MenuUtil.getLevel();

        System.out.print(" nhap chuc vu: ");
        String location = MenuUtil.getLocation();

        System.out.print("nhap luong: ");
        int wage;
        while (true) {
            try {
                wage = Integer.parseInt(SCANNER.nextLine());
                for (Employee employee : EMPLOYEE_LIST) {
                    if (employee.getWage() == wage) {
                        throw new NumberFormatException("phai nhap so");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        return new Employee(code, dateOfBirth, gender, name, phone, email, id, level, location, wage);
    }

}
