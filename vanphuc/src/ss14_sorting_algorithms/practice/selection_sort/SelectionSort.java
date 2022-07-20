package ss14_sorting_algorithms.practice.selection_sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    //    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static double[] array() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap do dai mang: ");
        int length = scanner.nextInt();
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("nhap phan tu tai [%d]: ", i);
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double min = list[i];
            int index = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    index = j;
                }
            }
            if (index != i) {
                list[index] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = array();
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
