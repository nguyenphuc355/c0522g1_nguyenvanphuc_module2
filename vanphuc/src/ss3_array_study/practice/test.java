package ss3_array_study.practice;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array;
        System.out.print("nhap so dong: ");
        int row = sc.nextInt();
        System.out.print("nhap so cot: ");
        int col = sc.nextInt();
        array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("nhap phan tu mang tai [" + i + "]" + "[" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("mang vua nhap la:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("]\t");
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j <= i; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("tong duong cheo trong ma tran la: " + sum );
    }
}
