package ss2_loop.practice;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number fist: ");
        int numberFirst = sc.nextInt();
        System.out.print("Enter number second: ");
        int numberSecond = sc.nextInt();
        numberFirst = Math.abs(numberFirst);
        numberSecond = Math.abs(numberSecond);
        if (numberFirst == 0 || numberSecond == 0) {
            System.out.println("No greatest common factor");
        }
        while (numberFirst != numberSecond) {
            if (numberFirst > numberSecond) {
                numberFirst = numberFirst - numberSecond;
            } else {
                numberSecond = numberSecond - numberFirst;
            }
        }
        System.out.println("Greatest common factor: " + numberFirst);
    }
}
