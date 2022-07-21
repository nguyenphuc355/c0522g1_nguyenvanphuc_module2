package ss15_exception_handling.practice.number_format_exception.controler;

import ss15_exception_handling.practice.number_format_exception.model.NumberFormatException;

import java.util.Scanner;

public class MainCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hay nhap x: ");
        int x = scanner.nextInt();
        System.out.print("Hay nhap y: ");
        int y = scanner.nextInt();
        NumberFormatException numberFormatException = new NumberFormatException();
        numberFormatException.calculate(x, y);
    }
}
