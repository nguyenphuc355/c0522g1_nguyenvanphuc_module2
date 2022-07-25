package case_study.service.impl;

import case_study.model.Employee;
import case_study.service.IEmployeeService;
import case_study.utils.ReadFileEmployee;
import case_study.utils.WriteFileEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static final String PATH = "vanphuc/src/case_study/employee.csv";
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private void writeEmployee(){
        WriteFileEmployee.writeFile(PATH,employeeList);
    }

    public void readEmployee(){
        List<Employee> list = ReadFileEmployee.readEmployees(PATH);
        employeeList.clear();
        employeeList.addAll(list);
    }

    @Override
    public void display() {
        readEmployee();
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }


}
