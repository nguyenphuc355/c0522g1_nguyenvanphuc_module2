package ss14_sorting_algorithms.exercise.insert_sort_illustrate;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortIllustrate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap do dai mang: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("nhap phan tu tai [%d]: ", i);
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.println("====bat dau xy ly sap xep====");
        insertSortByStep(array);
    }

    public static void insertSortByStep(int[] list) {

        for (int i = 1; i < list.length; i++) {

            int key = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > key; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = key;
            System.out.print("Array: ");
            System.out.println(Arrays.toString(list));
        }
    }
}
