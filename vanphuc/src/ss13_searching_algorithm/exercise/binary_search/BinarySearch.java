package ss13_searching_algorithm.exercise.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] array() {
        System.out.print("nhap do dai mang: ");
        int length = Integer.parseInt(scanner.nextLine());
        int array[] = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("nhap phan tu tai [%d]: ", i);
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        return array;
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int mid = (right + left) / 2;
            if (value == array[mid]) {
                return mid;
            }
            if (value > array[mid]) {
                return binarySearch(array, mid + 1, right, value);
            }
            return binarySearch(array, left, mid - 1, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] newArray = array();
        System.out.print("Array: ");
        System.out.println(Arrays.toString(newArray));
        System.out.print("nhap so can tim: ");
        int number = scanner.nextInt();
        System.out.print("index = ");
        System.out.println(binarySearch(newArray, 0, newArray.length - 1, number));

    }
}
