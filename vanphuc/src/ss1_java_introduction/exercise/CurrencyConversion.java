package ss1_java_introduction.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien: ");
        usd = sc.nextDouble();
        double exchange = usd * vnd;
        System.out.println("gia tri vnd: "+exchange+"vnd");

    }
}
