package ss14_sorting_algorithms.practice.bubble_sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static int[] array() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai mang:");
        int length = scanner.nextInt();
        int array[] = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhap phan tu tai [%d]: ", i);
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = list.length - 1; j >= 1; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] newArray = array();
        bubbleSort(newArray);
        System.out.print("Array: ");
        System.out.println(Arrays.toString(newArray));
    }
}
