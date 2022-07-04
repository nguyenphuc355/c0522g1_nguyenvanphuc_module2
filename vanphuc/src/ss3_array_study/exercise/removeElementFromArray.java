package ss3_array_study.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class removeElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Nhap array[%d]: ", i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang vua tao: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Nhap phan tu X can xoa: ");
        int number = scanner.nextInt();
        boolean notInArray = true;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                notInArray = false;
                for (int j = i; j < array.length - 1; j++) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                array[array.length - 1] = 0;
            }
        }
        if (notInArray) {
            System.out.println("Khong tim thay phan tu x trong mang!");
        } else {
            System.out.println("mang sau khi xoa X: ");
            System.out.println(Arrays.toString(array));
        }
    }
}
