package ss4_class_and_object.exercise.QuaradticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        do {
            System.out.print("nhap a:");
            a = scanner.nextDouble();
            if (a==0){
                System.out.print("a=0, xin nhap lai!!");
            }
        }while (a == 0);


        System.out.print("Nhap b:");
        double b = scanner.nextDouble();

        System.out.print("Nhap c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.display());

    }
}
