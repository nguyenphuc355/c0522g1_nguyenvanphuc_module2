package ss3_array_study.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang: ");
        int input = sc.nextInt();
        int[] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhap phan tu arr [" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("mang vua tao: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("\n");


        System.out.print("nhap so phan tu cua mang 2 : ");
        int input2 = sc.nextInt();
        int[] arr2 = new int[input2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("nhap phan tu arr2 [" + i + "] : ");
            arr2[i] = sc.nextInt();
        }
        System.out.print("mang vua tao: ");
        System.out.println(Arrays.toString(arr2));
        System.out.println("\n");

        int[] newArr = new int[input + input2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[i + arr.length] = arr2[i];
        }
        System.out.print("mang sau khi gop:");
        System.out.println(Arrays.toString(newArr));
    }
}
