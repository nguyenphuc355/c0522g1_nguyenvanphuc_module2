package ss3_array_study.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.print("nhap so luong phan tu cua mang: ");
        int size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhap phan tu mang tai [" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("mang vua nhap: ");
        System.out.print(Arrays.toString(arr) + "\n");
        int index = minValue(arr);
        System.out.println("the smallest element in the array is: " + index);
    }

    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
