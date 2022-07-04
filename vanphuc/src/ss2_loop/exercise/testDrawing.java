package ss2_loop.exercise;

import java.util.Scanner;

public class testDrawing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("input height: ");
        int height = sc.nextInt();

        System.out.print("input width: ");
        int width = sc.nextInt();
        System.out.print("\n");

        System.out.println("Draw Rectangle:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        System.out.println("Top-right: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.println("\nBotton-right: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j < height - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        System.out.println("Draw Triangle");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        System.out.println("Draw Inverted triangle");
        for (int i = 0; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print("*");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        System.out.println("Draw isosceles triangle");
        for (int i = 1; i <= height; i++) {
            for (int k = height; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
