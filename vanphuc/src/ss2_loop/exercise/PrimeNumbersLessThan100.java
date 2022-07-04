package ss2_loop.exercise;

import java.util.Scanner;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter Numbers: ");
        int number = sc.nextInt();
        System.out.print("Prime numbers les than "+number+" is: " );
        for (int i = 0; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i+" ");
            } else {
                System.out.print("");
            }
        }
    }
}
