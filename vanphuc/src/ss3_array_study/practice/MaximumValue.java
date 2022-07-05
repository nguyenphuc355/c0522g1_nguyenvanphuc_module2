package ss3_array_study.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu mang: ");
        int size = sc.nextInt();
        int[] arr;
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhap phan tu mang tai [" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.print("gia tri lon nhat trong mang la: " + max + "\n tai vi tri: " + index);
    }
}
