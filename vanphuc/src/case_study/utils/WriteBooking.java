package case_study.utils;

import case_study.model.Booking;
import case_study.model.Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteBooking {
    private static void writeCustomer(String path,String data){
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
    public static void writeBooking(String path, List<Booking> bookingList){
        StringBuilder data = new StringBuilder();
        for (Booking booking: bookingList){
            data.append(booking.getInfo());
        }
        writeCustomer(path,data.toString());
    }
}
