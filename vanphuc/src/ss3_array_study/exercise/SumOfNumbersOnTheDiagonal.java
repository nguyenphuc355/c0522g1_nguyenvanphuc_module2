package ss3_array_study.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumbersOnTheDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array;
        System.out.print("nhap so hang: ");
        int row = scanner.nextInt();
        System.out.print("nhap so  cot: ");
        int col = scanner.nextInt();
        array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("mang vua nhap la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(Arrays.toString(array[i]));
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
                sum += array[i][i];

        }
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i][array.length - 1 - i];
        }
        System.out.println("tong cac phan tu tai duong cheo cua mang la: \n" + sum + "\n" + sum2);
    }
}
