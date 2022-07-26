package case_study.utils;

import case_study.model.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee {
    private static List<String> readFiles(String path) {
        List<String> strings = new ArrayList<>();
        String line;
        try {
            File file = new File(path);

            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {

                strings.add(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static List<Employee> readEmployees(String path) {
        List<String> strings = readFiles(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            employeeList.add((new Employee(info[0], info[1], info[2], info[3], Integer.parseInt(info[4]), info[5], Integer.parseInt(info[6]), info[7], info[8], Integer.parseInt(info[9]))));
        }
        return employeeList;
    }
}
