package ss1_java_introduction.practice;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Linear Aquation Resolver");
        System.out.println("Given Aquation as 'a * x + b = c', Please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.print("answer = " + answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solation");
            }
        }
    }
}
