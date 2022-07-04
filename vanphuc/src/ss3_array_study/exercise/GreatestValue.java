package ss3_array_study.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GreatestValue {
    public static void main(String[] args) {
        int size;
        int[][] array;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so dong:");
        int row = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int col = sc.nextInt();
        array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("nhap phan tu mang tai [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        int max = array[0][0];
        System.out.println("mang vua nhap la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.print("]\t");
            System.out.println();
        }
        System.out.println("gia tri lon nhat la: " + max);
    }
}
