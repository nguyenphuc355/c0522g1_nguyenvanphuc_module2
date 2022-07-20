package ss14_sorting_algorithms.exercise.insert_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap do dai mang: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("nhap phan tu tai [%d]: ", i);
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        insertSort(array);
    }

    public static void insertSort(int[] list) {

        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > key; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = key;
        }
        System.out.println("====mang sau khi sap xep====");
        System.out.print("Array: ");
        System.out.println(Arrays.toString(list));
    }
}
