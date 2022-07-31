package case_study.utils;

import case_study.model.Contract;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteContract {
    private static void writeContract(String path,String data){
        try {
            File file = new File(path);

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void writeContracts(String path, List<Contract> contractList){
        StringBuilder data = new StringBuilder();
        for (Contract contract: contractList){
            data.append(contract.getInfo());
        }
        writeContract(path,data.toString());
    }
}
