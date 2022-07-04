package ss2_loop.practice;

import java.util.Scanner;

public class CreateMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectrangle");
        System.out.println("0. Exit");
        while (choice != 0) {
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" Draw the triangle");
                    System.out.println(" ****** ");
                    System.out.println(" ***** ");
                    System.out.println(" **** ");
                    System.out.println(" *** ");
                    System.out.println(" ** ");
                    System.out.println(" * ");
                    break;
                case 2:
                    System.out.println(" Draw the square");
                    System.out.println(" * * * * * *");
                    System.out.println(" * * * * * *");
                    System.out.println(" * * * * * *");
                    System.out.println(" * * * * * *");
                    System.out.println(" * * * * * *");
                    System.out.println(" * * * * * *");
                    break;
                case 3:
                    System.out.println(" Draw the rectrangle");
                    System.out.println(" * * * * * * ");
                    System.out.println(" * * * * * * ");
                    System.out.println(" * * * * * * ");
                    break;
                case 0:
                    System.exit(0);
                    System.out.println("Goodbye");
                default:
                    System.out.println("No choice!");
            }
        }
    }
}