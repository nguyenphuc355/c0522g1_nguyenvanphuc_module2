package ss15_exception_handling.exercise.illegal_triangle_exception.controller;

import ss15_exception_handling.exercise.illegal_triangle_exception.Exception.IllegalTriangleException;
import ss15_exception_handling.exercise.illegal_triangle_exception.model.Triangle;

import java.util.Scanner;

public class MainException {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("nhap canh thu nhat: ");
                a = Integer.parseInt(scanner.nextLine());

                System.out.print("nhap canh thu hai: ");
                b = Integer.parseInt(scanner.nextLine());

                System.out.print("nhap canh thu ba: ");
                c = Integer.parseInt(scanner.nextLine());

                Triangle triangle = new Triangle(a,b,c);
                System.out.println(triangle);
                break;
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("vui long nhap lai");

            }catch (IllegalTriangleException  e){
                System.out.println(e.getMessage());
                System.out.println("vui long nhap lai cac canh");
            }
        }
    }
}
