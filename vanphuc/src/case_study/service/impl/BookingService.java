package case_study.service.impl;

import case_study.model.Booking;
import case_study.service.IBookingService;
import case_study.utils.ReadBooking;
import case_study.utils.WriteBooking;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingService implements IBookingService {
    public static final String PATH = "vanphuc/src/case_study/booking.csv";
    private static final List<Booking> BOOKING_LIST = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    private void writeBooking() {
        WriteBooking.writeBooking(PATH, BOOKING_LIST);

    }

    public void readBooking() {
        List<Booking> list = ReadBooking.readBookingList(PATH);
        BOOKING_LIST.clear();
        BOOKING_LIST.addAll(list);
    }
    @Override
    public void display() {
        readBooking();
        for (Booking booking : BOOKING_LIST) {
            System.out.println(booking);
        }
    }

    @Override
    public void add() {
        readBooking();
        System.out.print("Nhap ma booking: ");
        String bookingCode = SCANNER.nextLine();

        System.out.print("Nhap ngay bat dau: ");
        String startDay = SCANNER.nextLine();

        System.out.print("Nhap ngay ket thuc: ");
        String endDate = SCANNER.nextLine();

        System.out.print("Nhap ma khach hang: ");
        String customerCode = SCANNER.nextLine();

        System.out.print("Nhap ten dich vu: ");
        String serviceName =SCANNER.nextLine();

        System.out.print("Nhap loai dich vu: ");
        String typeOfService = SCANNER.nextLine();

        BOOKING_LIST.add(new Booking(bookingCode, startDay, endDate, customerCode, serviceName, typeOfService));
        System.out.println("THEM MOI THANH CONG");
        writeBooking();
    }
}
