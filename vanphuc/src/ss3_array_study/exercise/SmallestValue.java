package ss3_array_study.exercise;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        int row, col;
        int[][] array;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so dong: ");
        row = sc.nextInt();
        System.out.print("nhap so cot: ");
        col = sc.nextInt();
        array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("nhap phan tu mang tai [" + i + "][" + j + "]:");
                array[i][j] = sc.nextInt();
            }
        }
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            System.out.print("[\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            System.out.print("]\t");
            System.out.println();
        }
        System.out.println("so nho nhat la: " + min);
    }
}
