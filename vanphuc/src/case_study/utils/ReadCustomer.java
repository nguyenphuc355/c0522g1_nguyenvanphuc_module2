package case_study.utils;

import case_study.model.Customer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCustomer {
    public static List<String> readCustomer(String path) {
        List<String> stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);

            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);



            while ((line = bufferedReader.readLine()) != null) {

                stringList.add(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Customer> readCustomerList(String path) {
        List<String> strings = readCustomer(path);
        List<Customer> customerList = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");

            customerList.add(new Customer(info[0], info[1], info[2], info[3], Integer.parseInt(info[4]), info[5], Integer.parseInt(info[6]), info[7], info[8]));
        }
        return customerList;
    }

}
