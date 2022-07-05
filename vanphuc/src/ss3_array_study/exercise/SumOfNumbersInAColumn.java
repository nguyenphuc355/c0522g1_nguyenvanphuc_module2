package ss3_array_study.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumbersInAColumn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] array;

        System.out.print("nhap so luong dong: ");
        int row = scanner.nextInt();
        System.out.print("nhap so luong cot: ");
        int col = scanner.nextInt();
        array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("nhap phan tu mang thu [" + i + "]" + "[" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("mang vua nhap la :");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }


        int sum = 0;
        int index;
        boolean isTrue;
        do {
            System.out.print("vi tri cot can cong: ");
            index = scanner.nextInt();
            isTrue = index < 0 || index > array.length;
            if (isTrue) {
                System.out.print("khong tim thay cot, xin moi nhap lai! ");
            }
        } while (isTrue);
        for (int i = 1; i < array.length; i++) {
                    sum += array[i][index];
        }
        System.out.println("tong cac phan tu tai cot " + index + " la: " + sum);
    }
}
