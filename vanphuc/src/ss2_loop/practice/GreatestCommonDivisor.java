package ss2_loop.practice;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number fist: ");
        int numberFist = sc.nextInt();
        System.out.print("Enter number second: ");
        int numberSecond = sc.nextInt();
        numberFist = Math.abs(numberFist);
        numberSecond = Math.abs(numberSecond);
        if (numberFist == 0 || numberSecond == 0) {
            System.out.println("No greatest common factor");
        }
        while (numberFist != numberSecond) {
            if (numberFist > numberSecond) {
                numberFist = numberFist - numberSecond;
            } else {
                numberSecond = numberSecond - numberFist;
            }
        }
        System.out.println("Greatest common factor: " + numberFist);
    }
}
