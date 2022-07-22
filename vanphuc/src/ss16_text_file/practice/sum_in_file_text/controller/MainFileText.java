package ss16_text_file.practice.sum_in_file_text.controller;

import ss16_text_file.practice.sum_in_file_text.model.ReadFileExample;

import java.util.Scanner;

public class MainFileText {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
