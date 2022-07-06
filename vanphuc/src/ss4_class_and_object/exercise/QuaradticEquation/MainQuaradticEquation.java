package ss4_class_and_object.exercise.QuaradticEquation;

import java.util.Scanner;

public class MainQuaradticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a:");
        double a = scanner.nextDouble();
        System.out.print("Nhap  b:");
        double b = scanner.nextDouble();
        System.out.print("Nhap c:");
        double c = scanner.nextDouble();

        QuaradticEquation quaradticEquation = new QuaradticEquation(a, b, c);
        System.out.println(quaradticEquation.display());

    }
}
