package case_study_2.utils;

import case_study_2.model.TaiKhoanNganHang;
import case_study_2.model.TaiKhoanThanhToan;
import case_study_2.model.TaiKhoanTietKiem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    private static List<String> readFile(String path) {
        List<String> strings = new ArrayList<>();
        String line;

        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static List<TaiKhoanNganHang> readFiles(String path) {
        List<String> stringList = readFile(path);
        List<TaiKhoanNganHang> taiKhoanNganHang = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 8) {
                taiKhoanNganHang.add(new TaiKhoanTietKiem(Integer.parseInt(info[0]), info[1], info[2], info[3], Integer.parseInt(info[4]), info[5], Integer.parseInt(info[6]), info[7]));
            } else if (info.length == 6) {
                taiKhoanNganHang.add(new TaiKhoanThanhToan(Integer.parseInt(info[0]), info[1], info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5])));
            }
        }
        return taiKhoanNganHang;
    }

    private static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTaiKhoan(String path, List<TaiKhoanNganHang> taiKhoanNganHangList) {
        StringBuilder data = new StringBuilder();
        for (TaiKhoanNganHang taiKhoanNganHang : taiKhoanNganHangList) {
            data.append(taiKhoanNganHang.getInfo());
        }
        writeFile(path, data.toString());
    }
}
