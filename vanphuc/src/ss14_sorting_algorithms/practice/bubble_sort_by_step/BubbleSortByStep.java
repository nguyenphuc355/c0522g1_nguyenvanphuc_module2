package ss14_sorting_algorithms.practice.bubble_sort_by_step;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai mang: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhap phan tu tai [%d]: ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("bat dau xu ly sap xep ...");
        bubbleSortByStep(arr);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass;
        for (int k = 1; k < list.length - k; k++) {
            needNextPass = false;

            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {

                    System.out.println("hoan doi " + list[i] + " voi " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Mang co the da duoc sap xep");
                break;
            }

            System.out.println("Mang sau " + k + " sap xep: ");
            System.out.print("Array: ");
            System.out.println(Arrays.toString(list));
        }
    }
}