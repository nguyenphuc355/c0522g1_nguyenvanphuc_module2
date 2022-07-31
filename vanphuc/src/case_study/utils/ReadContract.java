package case_study.utils;

import case_study.model.Contract;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadContract {
    public static List<String> readContract(String path) {
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

    public static List<Contract> readContracts(String path) {
        List<String> strings = readContract(path);
        List<Contract> contractList = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");

            contractList.add(new Contract(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), info[4]));
        }
        return contractList;
    }
}

