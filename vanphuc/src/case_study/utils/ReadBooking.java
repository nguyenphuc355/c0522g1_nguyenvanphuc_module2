package case_study.utils;

import case_study.model.Booking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadBooking {
    public static List<String> readBooking(String path) {
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

    public static List<Booking> readBookingList(String path) {
        List<String> strings = readBooking(path);
        List<Booking> bookingList = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");

            bookingList.add(new Booking(info[0], info[1], info[2], info[3], info[4], info[5]));
        }
        return bookingList;
    }
}
